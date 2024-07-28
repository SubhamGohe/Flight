package com.filghts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.filghts.entity.User;
import com.filghts.repository.UserRepository;

import aj.org.objectweb.asm.Attribute;
import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	@Autowired
  private UserRepository userRepo;
	
	
	// localhost:8080/showLoginPage
	@RequestMapping("/showLoginPage")
	public String showloginpage() {
		return "login/index";
	}
	
	//localhost:8080/showReg
	@RequestMapping("/showReg")
   public String showReg() 
   {
	return"login/showReg";
   }
	
	//localhost:8080/saveReg
	@RequestMapping("/saveReg")
	public String  saveReg(@ModelAttribute ("User") User user ){
	        
			userRepo.save(user);
		return "login/login";
	}
	
	//localhost:8080/verifylogin
	@RequestMapping("/verifyLogin")
	public String verifyLogin(
			@RequestParam("emailId")String emailId,
			@RequestParam("password")String password ,
			 ModelMap modelMap) {
		User user = userRepo.findByEmail(emailId);
		if (user != null) {

		if (user.getEmail().equals(emailId)&& user.getPassword().equals(password))
		
		{
			return "login/findFlights";

		}else {
			modelMap.addAttribute ("error","Invalide user /name/ password");
			return "login/login";

		}
	} else {
			modelMap.addAttribute ("error","Invalide user /name/ password");
			return "login/login";
		}
}}
