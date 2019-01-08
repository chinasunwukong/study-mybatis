package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.MessageInterface;

@Controller
public class HelloController {

	@Autowired
	private MessageInterface self;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model, @RequestParam String name) {
		model.addAttribute("hello", self.getMessage());
		model.addAttribute("name", name);
		return "hello";
	}

	@RequestMapping(value = "/path/{id}", method = RequestMethod.GET)
	public String path(Model model, @PathVariable String id) {
		model.addAttribute("hello", self.getMessage());
		model.addAttribute("path", id);
		return "hello";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

}
