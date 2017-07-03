package com.bookshopping.controller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookshopping.model.Order;
import com.bookshopping.model.User;
import com.bookshopping.service.OrderService;

@Controller
@RequestMapping(value="Order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;


	@GetMapping("/myorders")
	public String myOrders(ModelMap modelMap, HttpSession session) {

		User loggedInUser = (User) session.getAttribute("LOGGED_IN_USER");
		List<Order> list = orderService.findByUserIdOrderByIdDesc(loggedInUser.getId());
		modelMap.addAttribute("MY_ORDERS", list);
		session.setAttribute("MY_ORDERS",list);
		return "/listmyorders";

	}
	
	@GetMapping("/listorder")
	public String list(ModelMap modelMap, HttpSession session) {

		List<Order> list = orderService.findAllOrders();
		System.out.println("orders:"+ list.size());
		for (Order order : list) {
			System.out.println(order);
		}
		modelMap.addAttribute("ORDERS_LIST", list);
		return "/orderlist";

	}

	@PostMapping("/save")
	public String save(@RequestParam("total_price") float totalPrice, HttpSession session) {
System.out.println("inside order save");
		Order orderInCart = (Order) session.getAttribute("MY_CART_ITEMS");
		if ( orderInCart != null && orderInCart.getOrderItems().size() > 0) {
			orderInCart.setTotalPrice(totalPrice);
			orderService.save(orderInCart);
			session.removeAttribute("MY_CART_ITEMS");			
		}
				
		return "redirect:../Order/myorders";
	}
	
	@GetMapping("/updateStatus")
	public String updateStatus(@RequestParam("id") int id , @RequestParam("status")String status ) {
		Order order = orderService.findOne(id);
		if ("CANCELLED".equals(status) ) {
			order.setCancelledDate(LocalDate.now());
		}
		else if ("DELIVERED".equals(status)) {
			order.setDeliveredDate(LocalDate.now());
		}
		
		order.setStatus(status);
		orderService.save(order);	
		return "redirect:../Order/myorders";
	}
	
	@GetMapping("/cart")
	public String cart(){
		System.out.println("cart called");
		return "cart";
	}
}
