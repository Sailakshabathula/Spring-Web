package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.ContactForm;
import com.example.demo.entity.Contact;
import com.example.demo.repo.contactrepo;

@Service
public class contactserviceImp implements contactservice{
	
	@Autowired
	private contactrepo contactRepo;

	@Override
	public String saveContact(ContactForm form) {
		// TODO Auto-generated method stub
		Contact entity=new Contact();
		
		BeanUtils.copyProperties(form, entity);
		entity.setActiveStatus("Yes");
		entity=contactRepo.save(entity);
		if(entity.getId()!=null)
		{
			return "success";
		}
		return "failure";
	}

	@Override
	public List<ContactForm> viewcontact() {
		List<ContactForm> l=new ArrayList();
		List<Contact> findAll = contactRepo.findAll();
		// TODO Auto-generated method stub
		for(Contact entity:findAll)
		{
			ContactForm f=new ContactForm();
			BeanUtils.copyProperties(entity, f);
			l.add(f);
		}
		return l;
	}

	@Override
	public ContactForm editcontact(Integer id) {
		Optional<Contact> findById = contactRepo.findById(id);
		if(findById.isPresent())
		{
			Contact entity = findById.get();
			ContactForm f=new ContactForm();
			BeanUtils.copyProperties(entity, f);
			return f;
		}
		return null;
	}

	@Override
	public List<ContactForm> deletecontact(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
