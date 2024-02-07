package com.schoolManagement.pack.Repositories;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.schoolManagement.pack.Model.Test;

@FeignClient(url = "http://localhost:9091" , value = "quizClient")
public interface QuizClient {
	
	@GetMapping("/get/{id}")
	public Test getByQuizId(@PathVariable int id) ;
	
	@PostMapping("/insert")
	public Test insert(@RequestBody Test test);
	
	@PostMapping("/insertAll")
	public List<Test> insertAll(@RequestBody List<Test> test);
	
	
	
	
	@GetMapping("/getAll")
	public List<Test> getAll();
	
	
	@PutMapping("/update")
	public Test update(@RequestBody Test test);
	
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id);
	

}
