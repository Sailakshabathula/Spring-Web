package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Controller
public class userForm {
    @Autowired
	private UserRepo userrepo;
	
	@GetMapping("/presentUser")
	public String userFormData(Model model)
	{
		User u=new User();
		model.addAttribute("user",u);
		return "user-form";
	}
	@PostMapping("/displayUserData")
	public String saveData(Model model)
	{
		User u=new User();
		userrepo.save(u);
		System.out.println(u);
		model.addAttribute("msg","data saved succeffuly");
		return "display-data";
	}

}
