package com.tqdp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@Autowired
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
}
