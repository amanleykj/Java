package com.bookclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookclub.models.Book;
import com.bookclub.models.LoginUser;
import com.bookclub.models.User;
import com.bookclub.services.BookService;
import com.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	
	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String mainPage(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("loginuser", new LoginUser());
		return "login.jsp";
	}
	
	@GetMapping("/books")
	public String home(Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("allBooks", bookService.getAllBooks());
		model.addAttribute("user", userService.getOneUser((Long)session.getAttribute("userId")));
		return "home.jsp";
	}
	
	@GetMapping("/books/{id}")
	public String viewBook(@Valid @PathVariable("id") Long id, @ModelAttribute("book") Book book, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
				return "redirect:/";
		}
		model.addAttribute("oneBook", bookService.getOneBook(id));
		model.addAttribute("user", userService.getOneUser((Long)session.getAttribute("userId")));
		return "viewBook.jsp";
	}
	
	@GetMapping("/books/new")
	public String newBook(Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", new Book());
		model.addAttribute("user", userService.getOneUser((Long)session.getAttribute("userId")));
		return "createBook.jsp";
	}
	
	@PostMapping("/createBook")
	public String createBook(@Valid @ModelAttribute("book") Book book, 
			BindingResult result, 
			Model model)
	{
		bookService.register(book, result);
		if(result.hasErrors()) {
			return "createBook.jsp";
		}
		return "redirect:/books";
	}
	
	@GetMapping("/book/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Book book = bookService.getOneBook(id);
		model.addAttribute("book", book);
		return "editBook.jsp";
	}
	
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
	public String edit(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			Model model
			)
	{
		if(result.hasErrors()) {
			model.addAttribute("book", book);
			return "editBook.jsp";
		}
		else {
			bookService.editBook(book);
			return "redirect:/books";
		}
	}
	
	@GetMapping("/book/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {
		userService.register(user, result);
		if(result.hasErrors())  {
			model.addAttribute("loginuser", new LoginUser());
			return "login.jsp";
		}
		session.setAttribute("userId", user.getId());
		System.out.println("session variable: " + session.getAttribute("userId"));
		return "redirect:/books";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("loginuser") LoginUser user, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors())  {
			model.addAttribute("user", new User());
			return "login.jsp";
		}
		User user1 = userService.login(user, result);
		session.setAttribute("userId", user1.getId());
		System.out.println("session variable: " + session.getAttribute("userId"));
		return "redirect:/books";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("userId", null);
		return "redirect:/";
	}

}

