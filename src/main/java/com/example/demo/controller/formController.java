package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.binding.ProductForm;
import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;

@Controller
public class formController {

	//private static final int ResponseEntity = 0;
	/*@Autowired
	private ProductRepo productrepo;
	@Autowired
	private ProductService productservice;
    @GetMapping("/")
	public String getLoad(Model model)
	{
		Product p=new Product();
	
	    model.addAttribute("product",p);
	    model.addAttribute("ids",productservice.getId());
	    
		return "index";
	}
    @PostMapping("/saveproduct")
    public String getSave(Product product,Model model)
    {
    	System.out.println(product.getProductName());
    	productrepo.save(product);
    	
    	model.addAttribute("msg",product);
    	model.addAttribute("ob",productservice.getId());
    	
    	return "dashboard";
    }*/
	
	
	@Autowired
	private ProductService ser;
	
	@GetMapping("/productdata/{id}")
	public ResponseEntity<ProductForm> getData(@PathVariable Integer id)
	{
		ProductForm product = ser.getProduct(id);
		return new ResponseEntity<ProductForm>(product,HttpStatus.OK);
	}
	@GetMapping("/productname/{id}")
	public ResponseEntity<String> getProudctName(@PathVariable Integer id)
	{
		 String n = ser.getProductName(id);
		 return new ResponseEntity<String>(n,HttpStatus.OK);
	}
	
    
}
