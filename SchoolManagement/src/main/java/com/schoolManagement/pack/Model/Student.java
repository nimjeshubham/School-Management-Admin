package com.schoolManagement.pack.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@Column(unique = true)
	private String enrollmentNo;
	private String name;
	private String fName;
	private String mName;
	private String address;
	private String password;
	
	@ManyToOne
	private School school;
	
	@ManyToOne
	private Sclass sclass;
	
	@OneToMany
	private List<Marksheet> marksheet;
	

}
