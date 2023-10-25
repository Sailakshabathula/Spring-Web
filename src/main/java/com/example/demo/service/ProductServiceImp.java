package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.binding.ProductForm;
import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	public ProductRepo prod;
	
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public ProductForm getProduct(Integer id) {
		// TODO Auto-generated method stub
		Optional<Product> findById = prod.findById(id);
		
		if(findById.isPresent())
		{
			Product product = findById.get(); 
			ProductForm p=new ProductForm();
			BeanUtils.copyProperties(product, p);
			return p;
		}
		
		return null;
	}
	@Override
	public String getProductName(Integer id)
	{
		String s="select product_name from product where product_id="+id;
		
		try
		{
	     String q = jt.queryForObject(s, String.class);
		
		
		return q;
		}
		catch(EmptyResultDataAccessException e)
		{
			return "no data found";
		}
	}
	@Override
	public List fetchall() {
		// TODO Auto-generated method stub
		return null;
	}

}
