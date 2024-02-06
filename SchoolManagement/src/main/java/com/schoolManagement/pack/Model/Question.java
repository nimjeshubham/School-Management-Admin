package com.schoolManagement.pack.Model;


import lombok.Data;

@Data
public class Question {
	
	
	private int questionId;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;
	private int testId;
	

}
