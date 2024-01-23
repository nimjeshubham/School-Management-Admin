package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolManagement.pack.Model.Marksheet;
import com.schoolManagement.pack.Repositories.MarksheetRepo;

@Service
public class MarksheetDao {
	
	@Autowired
	MarksheetRepo repo;
	
	public Marksheet insert(Marksheet m) {
		return repo.save(m);
	}
	
	public List<Marksheet> getAll() {
		return repo.findAll();
	}
	
	public Marksheet get(Integer id) {
		return repo.findById(id).orElse(null);
		}
	
	public Marksheet update(Marksheet m) {
		Marksheet mm =repo.findById(m.getMID()).orElse(null);
		mm.setSubject(m.getSubject());
		mm.setExam(m.getExam());
		mm.setMarks(m.getMarks());
		return repo.save(mm);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

}
