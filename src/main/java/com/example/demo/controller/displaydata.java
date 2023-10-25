package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller
public class displaydata {
	/*@Autowired
	private ProductService pservice;
	@GetMapping("/pro")
	public String getproductData(Model model)
	{
		//Product p=new Product();
		model.addAttribute("product",pservice.ProductData());
		
		return "Data";
	}
*/
}
