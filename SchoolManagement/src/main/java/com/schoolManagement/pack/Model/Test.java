package com.schoolManagement.pack.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;


@Data
public class Test {
	
	
	private int testId;
	private Date date;
	private String subject;
	private List<Question> question;

}
