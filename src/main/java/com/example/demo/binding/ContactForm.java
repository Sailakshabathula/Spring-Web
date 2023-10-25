package com.example.demo.binding;

import java.time.LocalDate;

public class ContactForm {
	private Integer id;
	private String name;
	private String email;
	private String phno;
	private String activeStatus;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	
	public ContactForm() {
		super();
	}
	public ContactForm(Integer id, String name, String email, String phno, String activeStatus, LocalDate createdDate,
			LocalDate updatedDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.activeStatus = activeStatus;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	

}
