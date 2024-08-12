package com.yeom.spring.ex.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yeom.spring.ex.mvc.domain.User;
import com.yeom.spring.ex.mvc.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	// @RequestMapping(path="/mvc/user/info", method=RequestMethod.GET)
	@GetMapping("/mvc/user/info")
	public String userInfo(Model model) {	
		User user = userService.getLastUser();
		
		model.addAttribute("resutl", user);
		model.addAttribute("title", "회원정보");
		
		
		return "mvc/userInfo";
	}
	
}
