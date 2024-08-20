package com.yeom.spring.ex.mvc.mvctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yeom.spring.ex.mvc.mvctest.Servicetest.UsersService;
import com.yeom.spring.ex.mvc.mvctest.domain.Users;

@Controller
@RequestMapping("/mvctest/user2")
public class UsersController {
	
	@Autowired
	private UsersService userService;
	
	@PostMapping("/create")
	public String createUser(
			@ModelAttribute Users users, 
			Model model) {
		
		userService.addUser(users);
		
		model.addAttribute("users", users);
		
		return "";
	}
	
	@GetMapping("/input")
	public String userInput() {
		return "users/userInput";
	}
	
}
