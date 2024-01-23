package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.schoolManagement.pack.Model.School;
import com.schoolManagement.pack.Repositories.SchoolRepo;

@Service
public class SchoolDao {
	
	 @Autowired
	 SchoolRepo repo;
	 
	 public School insert(School s) {
			return repo.save(s);
		}
		
		public List<School> getAll() {
			return repo.findAll();
		}
		
		public School get(Integer id) {
			return repo.findById(id).orElse(null);
			}
		
		public School update(School s) {
			School ss =repo.findById(s.getSchoolID()).orElse(null);
			ss.setName(s.getName());
			ss.setAddress(s.getAddress());
			ss.setPrincipal(s.getPrincipal());
			return repo.save(ss);
		}
		
		public void deleteById(Integer id) {
			repo.deleteById(id);
		}

}
