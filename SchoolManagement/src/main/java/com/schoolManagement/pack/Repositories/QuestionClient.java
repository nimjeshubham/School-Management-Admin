package com.schoolManagement.pack.Repositories;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.schoolManagement.pack.Model.Question;



//@FeignClient(url = "http://localhost:9090" , value = "questionClient")
@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClient {
	
	
	@GetMapping("/getByTestId/{id}")
	public List<Question> getQuestionOfTest(@PathVariable int id);
	
	@PostMapping("/insert")
	public Question insert (@RequestBody Question question);
	
	@PostMapping("/insertAll")
	public List<Question> insertAll(@RequestBody List<Question> question);
	
	@GetMapping("/get/{id}")
	public Question get(@PathVariable int id) ;
	
	
	
	@GetMapping("/getAll")
	public List<Question> getAll();
	
	@PutMapping("/update")
	public Question update (@RequestBody Question question) ;
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) ;


}
