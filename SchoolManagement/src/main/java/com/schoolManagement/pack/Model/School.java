package com.schoolManagement.pack.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int schoolID;
	private String name;
	private String address;
	private String principal;
	
	@OneToMany
	private List<Sclass> sclass;
	
	@OneToMany
	private List<Teacher> teacher;
	
	@OneToMany
	private List<Student> student;

}
