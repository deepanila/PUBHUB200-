package com.bookshopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookshopping.model.User;
import com.bookshopping.service.UserService;


@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		System.out.println("controller called");
		return "register";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public String addUser( @RequestParam("name") String name,
			 @RequestParam("emailId") String emailId, @RequestParam("password") String password, @RequestParam("mobileNo") String mobileNo) {
		System.out.println("Inside the controller");
		User user = new User(name,emailId,password,mobileNo);

		userservice.save(user);
		return "loginuser";

	}

	/*
	 * @GetMapping("/List") public String list(ModelMap modelMap) {
	 * 
	 * List<User> users = userservice.findAll(); System.out.println(users);
	 * modelMap.addAttribute("USERS_LIST", users); return "userlist"; }
	 */
	@RequestMapping(value = "/booklist", method = RequestMethod.POST)
	public String loginUser(@RequestParam("name") String name, @RequestParam("password") String password,HttpSession session) {

		System.out.println("UserController called");

		User user = userservice.login(name, password);
		if (user.getName().equals(name) && user.getPassword().equals(password)) {
		    session.setAttribute("LOGGED_IN_USER",user);
			System.out.println("success");
			// return "view-cart";
			return "redirect:../Book/book";

		} else {
			System.out.println("failure");
			return "loginuser";

		}

	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String userSignUp() {
		System.out.println("SignUp Controller called");
		return "loginuser";
	}
	/*@RequestMapping(value ="/changepassword",method=RequestMethod.GET)
	public String changePassword() {
		System.out.println("ChangePassword Called");
		return "password";
		
	}*/


}
