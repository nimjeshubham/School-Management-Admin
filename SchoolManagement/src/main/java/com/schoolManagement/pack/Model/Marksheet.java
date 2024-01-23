package com.schoolManagement.pack.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Marksheet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int mID;
	private String subject;
	private int marks;
	private String exam;
	
	@ManyToOne
	private Student student;
	
	

}
