package com.institute.courseProducer;

public class CourseModel {

	private String name, details, duration, tutor;
	private double fee;
	
	public CourseModel(String name, String details, String duration, String tutor, double fee) {
		super();
		this.name = name;
		this.details = details;
		this.duration = duration;
		this.tutor = tutor;
		this.fee = fee;
	}

	public CourseModel() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
}
