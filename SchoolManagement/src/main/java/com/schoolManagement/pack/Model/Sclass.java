package com.schoolManagement.pack.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Sclass {
	
	@Id
	private int sclass;
	private char section;
	private String classTeacher;
	
	@OneToMany
	private List<Teacher> teacher;
	
	@OneToMany
	private List<Subject> subject;
	
	@OneToMany
	private List<Student> student;
	
	@ManyToOne
	private School school;

}
