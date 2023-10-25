package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.ProductForm;
import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;


public interface ProductService {
	
	
   public ProductForm getProduct(Integer id);
   
   public String getProductName(Integer id);
   
   
   public List fetchall();
	
	

}
