package com.schoolManagement.pack.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolManagement.pack.Model.Test;
import com.schoolManagement.pack.Repositories.QuizClient;

@Service
public class TestDao {
	
	@Autowired
	QuizClient quizClient;
	
	public Test insert(Test t) {
		return quizClient.insert(t);
	}
	
	public List<Test> getAll(){
		return quizClient.getAll();
	}
	
	public Test get(int id) {
		return quizClient.getByQuizId(id);
	}
	
	public void delete(int id ) {
		quizClient.delete(id);
	}
	
	public Test update(Test t) {
		return quizClient.update(t);
	}

}
