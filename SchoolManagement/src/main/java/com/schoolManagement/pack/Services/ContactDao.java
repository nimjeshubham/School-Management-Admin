package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolManagement.pack.Model.Contact;
import com.schoolManagement.pack.Model.Marksheet;
import com.schoolManagement.pack.Repositories.ContactRepo;

@Service
public class ContactDao {
	
	@Autowired
	ContactRepo repo;
	
	public Contact insert(Contact c) {
		return repo.save(c);
	}
	
	public List<Contact> getAll() {
		return repo.findAll();
	}
	
	public Contact get(Integer id) {
		return repo.findById(id).orElse(null);
		}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}


}
