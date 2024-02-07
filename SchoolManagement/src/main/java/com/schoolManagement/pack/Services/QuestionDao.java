package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolManagement.pack.Model.Question;
import com.schoolManagement.pack.Repositories.QuestionClient;

@Service
public class QuestionDao {
	
	@Autowired
	QuestionClient questionClient;
	
	public Question insert(Question q) {
		return questionClient.insert(q);
	}
	
	public List<Question> getAll(){
		return questionClient.getAll();
	}
	
	public Question getById(int id) {
		return questionClient.get(id);
	}
	
	public void delete (int id) {
		questionClient.delete(id);
	}
	
	public Question update(Question q) {
		return questionClient.update(q);
	}
	
	
	
	

}
