package com.instiute.quizProducer;

import java.util.Scanner;

public class QuizModel {

	private String question;
	private String answer1; 
	private String answer2; 
	private String cAnswer;
	
	public QuizModel() {}

	public QuizModel(String question, String answer1, String answer2, String cAnswer) {
		super();
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.cAnswer = cAnswer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getcAnswer() {
		return cAnswer;
	}

	public void setcAnswer(String cAnswer) {
		this.cAnswer = cAnswer;
	}

	public void takeQuestion() {
		
		Scanner sbj = new Scanner(System.in);
		
		System.out.println(this.question);
		System.out.println("1. " + answer1);
		System.out.println("2. " + answer2);
		System.out.println("3. " + cAnswer);
		
		System.out.println("Select your answer:");
		if(sbj.nextInt() == 3) System.out.println("Correct!");
		else System.out.println("Incorrect answer.Correct answer is " + this.cAnswer);
		
		sbj.close();
		
		return;
	}
	
}
