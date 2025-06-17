package com.example.fastxprojdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.fastxprojdemo.entity.UserAccount;
import com.example.fastxprojdemo.jpa.UserAccountRegRepo;

import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {

	@Autowired
	UserAccountRegRepo userAccountRegRepo;
	
//index page
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
//register page
	@RequestMapping("/registerPage")
	public String registerPage() {
		return "registerPage.jsp";
	}
//login page
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "loginPage.jsp";
	}

	@RequestMapping("/register")
	public String register(UserAccount userAccount, RedirectAttributes attributes) {
		userAccountRegRepo.save(userAccount);
		attributes.addFlashAttribute("userAccount", userAccount);
		attributes.addFlashAttribute("msg", "User registration has been completed successfully!");
		return "redirect:loginPage";
	}

	@RequestMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, RedirectAttributes attributes,
			HttpSession session) {
		try {
			UserAccount userAccount = userAccountRegRepo.getReferenceById(email);
			if (userAccount.getEmail().equalsIgnoreCase(email)
					&& userAccount.getPassword().equalsIgnoreCase(password)) {
				session.setAttribute("loggedInUser", userAccount);
				return "redirect:userHomePage";
			} else {
				attributes.addFlashAttribute("err", "Invalid Password");
				return "redirect:loginPage";
			}
		} catch (EntityNotFoundException e) {
			System.err.println(e);
			attributes.addFlashAttribute("err", "Invalid Email Or Password");
			return "redirect:loginPage";
		}
	}
	
	@RequestMapping("/userHomePage")
	public String userHomePage() {
		return "userHomePage.jsp";
	}
	
	@RequestMapping("/logOut")
	public String logout(HttpSession session,RedirectAttributes attributes) {
		session.invalidate();
		attributes.addFlashAttribute("msg","You have been logged out Successfully!");
		return "redirect:loginPage";
	}
}
