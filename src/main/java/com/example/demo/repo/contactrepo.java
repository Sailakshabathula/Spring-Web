package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Contact;

@Repository
public interface contactrepo extends JpaRepository<Contact,Integer> {

}
