package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.ContactForm;
import com.example.demo.service.contactservice;
import com.example.demo.service.contactserviceImp;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class contactController {

	@Autowired
	private contactservice service;
	@PostMapping("/save")
    public String savedata(@RequestBody ContactForm form)
    {
		String saveContact = service.saveContact(form);
		return saveContact;
    }
	@GetMapping("/display")
	public List<ContactForm> display()
	{
		return service.viewcontact();
	}
	@GetMapping("/edit/{id}")
	public ContactForm editContact(@PathVariable Integer id)
	{
		return service.editcontact(id);
	}
}
