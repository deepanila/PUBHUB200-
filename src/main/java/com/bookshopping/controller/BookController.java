package com.bookshopping.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookshopping.model.Book;
import com.bookshopping.service.BookService;


@Controller
@RequestMapping("/Book")
public class BookController {
	@Autowired
	private BookService bookservice;
	
	@RequestMapping(value = "/book", method = RequestMethod.GET)
public String list(ModelMap modelMap) {
	System.out.println("Book Controller Called");
	List<Book> books = bookservice.findAll();
	System.out.println(books);
	modelMap.addAttribute("books", books);
	return "list";
}
@GetMapping("/logout")
public String logOut(HttpSession session) {
    session.invalidate();
    return "redirect:../User/signup";
}
@GetMapping("/{id}")
public String View(@PathVariable("id") int id,HttpSession session)
{
System.out.println("viewbook"+id);	
Book book=bookservice.findOne(id);
session.setAttribute("selectbook", book);
return "bookdetails";

}

}
