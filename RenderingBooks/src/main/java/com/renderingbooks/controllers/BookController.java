package com.renderingbooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.renderingbooks.services.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/books";
	}
	
	
	@RequestMapping("/books/{bookId}")
	public String show(Model model, @PathVariable("bookId") Long bookId) {
		model.addAttribute("bookie", bookService.findBook(bookId));
		return "show.jsp";
	}

}
