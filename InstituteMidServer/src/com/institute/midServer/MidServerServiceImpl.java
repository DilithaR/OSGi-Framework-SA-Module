package com.institute.midServer;

import com.institute.courseProducer.CourseService;
import com.institute.courseProducer.CourseServiceImpl;
import com.institute.resourcesProducer.ResourcesService;
import com.institute.resourcesProducer.ResourcesServiceImpl;
import com.institute.tutorProducer.TutorService;
import com.institute.tutorProducer.TutorServiceImpl;
import com.institute.tutorialProducer.TutorialService;
import com.institute.tutorialProducer.TutorialServiceImpl;
import com.instiute.quizProducer.QuizService;
import com.instiute.quizProducer.QuizServiceImpl;

public class MidServerServiceImpl implements MidServerService {
	
	private static MidServerServiceImpl instance = null;

	TutorService tutor;
	TutorialService tutorial;
	ResourcesService resource;
	QuizService quiz;
	CourseService course;
	
	private MidServerServiceImpl(){
		
		tutor = new TutorServiceImpl();
		tutorial = new TutorialServiceImpl();
		resource = new ResourcesServiceImpl();
		quiz = new QuizServiceImpl();
		course = new CourseServiceImpl();
		
	}
	
	public static MidServerServiceImpl getMidServer() {
		
		if(instance == null) {
			instance = new MidServerServiceImpl();
		}
		
		return instance;
	}
	
	@Override
	public void addTutor() {
		// TODO Auto-generated method stub
		tutor.addTutor();
	}

	@Override
	public boolean tutorLogin() {
		// TODO Auto-generated method stub
		return tutor.tutorLogin();
	}

	@Override
	public void seeTutors() {
		// TODO Auto-generated method stub
		tutor.seeTutors();
	}

	@Override
	public void addEducationResources() {
		// TODO Auto-generated method stub
		resource.addEducationResources();
	}

	@Override
	public void displayPriceList() {
		// TODO Auto-generated method stub
		resource.displayPriceList();
	}

	@Override
	public void addQuiz() {
		// TODO Auto-generated method stub
		quiz.addQuiz();
	}

	@Override
	public void takeQuiz() {
		// TODO Auto-generated method stub
		quiz.takeQuiz();
	}

	@Override
	public void addTutorials() {
		// TODO Auto-generated method stub
		tutorial.addTutorials();
	}

	@Override
	public void DisplayTutorials() {
		// TODO Auto-generated method stub
		tutorial.DisplayTutorials();
	}

	@Override
	public void addcourse() {
		// TODO Auto-generated method stub
		course.addcourse();
	}

	@Override
	public void viewAllCourses() {
		// TODO Auto-generated method stub
		course.viewAllCourses();
	}

	@Override
	public void searchCourse() {
		// TODO Auto-generated method stub
		course.searchCourse();
	}

}
