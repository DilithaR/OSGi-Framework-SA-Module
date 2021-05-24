package com.institute.courseProducer;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseServiceImpl implements CourseService {

	
	
	ArrayList<CourseModel> courses;
	Scanner scan = new Scanner(System.in);
	
	
	@Override
	public void addcourse() {
		
		CourseModel cr = new CourseModel();
		
		while(true) {
			
			System.out.println("Enter course name: ");
			cr.setName(scan.next());
			
			System.out.println("Enter course details: ");
			cr.setDetails(scan.next());
			
			System.out.println("Enter course duration: ");
			cr.setDuration(scan.next());
			
			System.out.println("Enter course tutor: ");
			cr.setTutor(scan.next());
			
			System.out.println("Enter course fee: ");
			cr.setTutor(scan.next());
			
			try {
			
				courses.add(cr);
				
			}catch(Exception e) {
				
				e.printStackTrace();
				System.out.println("Error. Couldn't add the course. Please try again.");
			}
			
			char another = 'x';
			
			while(another != 'n' && another != 'N' && another != 'y' && another != 'Y') {
				
				System.out.println("Add another course?(y/n)");
				another = scan.next().charAt(0);
				
				if(another != 'n' && another != 'N' && another != 'y' && another != 'Y') {
					
					System.out.println("Invalid input.");
				}
			}
			
			if(another == 'n' || another == 'N') break;
		
		}


	}

	@Override
	public void viewAllCourses() {
		// TODO Auto-generated method stub
		for(CourseModel c: courses) {
			
			System.out.println(c.getName());
			System.out.println(c.getDetails());
			System.out.println(c.getDuration());
			System.out.println(c.getTutor());
			System.out.println(c.getFee());
			
		}
	}

	@Override
	public void searchCourse() {
		// TODO Auto-generated method stub
		String name;
		
		System.out.println("Enter course name: ");
		name = scan.next();
		
		for(CourseModel c: courses) {
			
			if(c.getName().equalsIgnoreCase(name)) {
				
				System.out.println("Course Found.Details are..");
				System.out.println(c.getName());
				System.out.println(c.getDetails());
				System.out.println(c.getDuration());
				System.out.println(c.getTutor());
				System.out.println(c.getFee());
				
			}
			
		}
	}

}
