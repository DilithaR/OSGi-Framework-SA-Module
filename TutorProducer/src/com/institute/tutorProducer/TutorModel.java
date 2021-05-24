package com.institute.tutorProducer;

public class TutorModel {

	private String name,subject,uName,pass;

	public TutorModel() {}

	public TutorModel(String name, String subject, String uName, String pass) {

		this.name = name;
		this.subject = subject;
		this.uName = uName;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
