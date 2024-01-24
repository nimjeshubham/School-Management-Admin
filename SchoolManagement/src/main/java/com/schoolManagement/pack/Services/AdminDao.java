package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolManagement.pack.Model.Admin;

import com.schoolManagement.pack.Repositories.AdminRepo;

@Service
public class AdminDao {
	
	@Autowired
	AdminRepo repo;
	
	public Admin insert(Admin m) {
		return repo.save(m);
	}
	
	public List<Admin> getAll() {
		return repo.findAll();
	}
	
	public Admin get(Integer id) {
		return repo.findById(id).orElse(null);
		}
	
	public Admin update(Admin m) {
		Admin mm =repo.findById(m.getAdminID()).orElse(null);
		mm.setPassword(m.getPassword());
		return repo.save(mm);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}


}
