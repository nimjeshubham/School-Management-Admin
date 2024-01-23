package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.schoolManagement.pack.Model.Sclass;
import com.schoolManagement.pack.Repositories.SclassRepo;

@Service
public class SclassDao {
	
	@Autowired
	SclassRepo repo;
	
	public Sclass insert(Sclass s) {
		return repo.save(s);
	}
	
	public List<Sclass> getAll() {
		return repo.findAll();
	}
	
	public Sclass get(Integer id) {
		return repo.findById(id).orElse(null);
		}
	
	public Sclass update(Sclass s) {
		Sclass ss =repo.findById(s.getSclass()).orElse(null);
		ss.setSection(s.getSection());
		ss.setClassTeacher(s.getClassTeacher());
		ss.setSchool(s.getSchool());
		return repo.save(ss);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}


}
