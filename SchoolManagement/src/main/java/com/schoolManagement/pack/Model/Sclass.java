package com.schoolManagement.pack.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Sclass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sclass;
	private int name;
	private String section;
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
