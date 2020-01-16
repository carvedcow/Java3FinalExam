package com.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.login.model.User;
import com.login.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	// Values
	@Autowired
	private UserService userService;

	// Constructors
	// Methods
	@RequestMapping(value = "/loginUser")
	public ModelAndView getLoginPage() {
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("user", new User());
		return mv;
	}
	
	@RequestMapping(value = "tryLoginUser")
	public String tryLoginUser(@ModelAttribute("user") User user) {
		
		List<User> validUsers = userService.getUsers();
		String returnString = "redirect:/users/registerUser";
		
		for (User u : validUsers) {
			if (u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
				returnString = "redirect:/users/userHome";
			}
		}
		return returnString;
	}
	
	@RequestMapping(value = "/registerUser")
	public ModelAndView registerUser() {
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("user", new User());
		return mv;
	}
	
	@RequestMapping(value = "/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.addUser(user);
		return "redirect:/users/userHome";
	}
	
	@RequestMapping(value = "/userHome")
	public ModelAndView userHome() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}
}
