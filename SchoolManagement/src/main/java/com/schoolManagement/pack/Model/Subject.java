package com.schoolManagement.pack.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int subjectId;
	private String name;
	
	@ManyToOne
	private Sclass sclass;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "Subject Id"), inverseJoinColumns = @JoinColumn(name = "Teacher Id"))
	private  List<Teacher> teacher;
	

}
