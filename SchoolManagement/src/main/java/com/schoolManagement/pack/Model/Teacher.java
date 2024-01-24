package com.schoolManagement.pack.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class  Teacher{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int tID;
	private String name;
	private String address;
	private String password;
	
	@ManyToOne
	private School school;
	
	@ManyToMany(mappedBy = "teacher")
	private List<Subject> subject;
	
	

}
