package com.example.bookstoredemo.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bookstoredemo.domain.Book;


public class BookController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String Books(Model model, Book book) {

		model.addAttribute("book", book);
		model.addAttribute("books", book);

		return "index";
	}

}
