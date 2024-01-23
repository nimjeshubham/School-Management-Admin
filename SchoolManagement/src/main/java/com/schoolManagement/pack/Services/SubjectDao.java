package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.schoolManagement.pack.Model.Subject;

import com.schoolManagement.pack.Repositories.SubjectRepo;

@Service
public class SubjectDao {
	@Autowired
	SubjectRepo repo;
	 
	 public Subject insert(Subject s) {
			return repo.save(s);
		}
		
		public List<Subject> getAll() {
			return repo.findAll();
		}
		
		public Subject get(Integer id) {
			return repo.findById(id).orElse(null);
			}
		
		public Subject update(Subject s) {
			Subject ss =repo.findById(s.getSubjectId()).orElse(null);
			ss.setName(s.getName());
			ss.setSclass(s.getSclass());
			ss.setTeacher(s.getTeacher());
			return repo.save(ss);
		}
		
		public void deleteById(Integer id) {
			repo.deleteById(id);
		}

}
