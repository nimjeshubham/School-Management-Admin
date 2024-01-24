package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.schoolManagement.pack.Model.Teacher;

import com.schoolManagement.pack.Repositories.TeacherRepo;

@Service
public class TeacherDao {
	
	@Autowired
	TeacherRepo repo;
	 
	 public Teacher insert(Teacher s) {
			return repo.save(s);
		}
		
		public List<Teacher> getAll() {
			return repo.findAll();
		}
		
		public Teacher get(Integer id) {
			return repo.findById(id).orElse(null);
			}
		
		public Teacher update(Teacher s) {
			Teacher ss =repo.findById(s.getTID()).orElse(null);
			ss.setName(s.getName());
			ss.setAddress(s.getAddress());
			ss.setSchool(s.getSchool());
			ss.setPassword(s.getPassword());
			return repo.save(ss);
		}
		
		public void deleteById(Integer id) {
			repo.deleteById(id);
		}


}
