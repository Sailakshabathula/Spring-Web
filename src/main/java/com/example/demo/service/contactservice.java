package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.binding.ContactForm;


public interface contactservice {
	public String saveContact(ContactForm form);
	public List<ContactForm> viewcontact();
	public ContactForm editcontact(Integer id);
	public List<ContactForm> deletecontact(Integer Id);
	

}
