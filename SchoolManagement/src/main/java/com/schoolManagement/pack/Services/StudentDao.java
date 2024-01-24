package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.schoolManagement.pack.Model.Student;

import com.schoolManagement.pack.Repositories.StudentRepo;

@Service
public class StudentDao {
	 @Autowired
	 StudentRepo repo;
	 
	 public Student insert(Student s) {
			return repo.save(s);
		}
		
		public List<Student> getAll() {
			return repo.findAll();
		}
		
		public Student get(String id) {
			return repo.findById(id).orElse(null);
			}
		
		public Student update(Student s) {
			Student ss =repo.findById(s.getEnrollmentNo()).orElse(null);
			ss.setName(s.getName());
			ss.setFName(s.getFName());
			ss.setMName(s.getMName());
			ss.setAddress(s.getAddress());
			ss.setSchool(s.getSchool());
			ss.setSclass(s.getSclass());
			ss.setPassword(s.getPassword());
			return repo.save(ss);
		}
		
		public void deleteById(String id) {
			repo.deleteById(id);
		}

}
