package com.institute.tutorProducer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TutorServiceImpl implements TutorService {

	private static final String[] TUTOR_NAMES = {"Janaka", "Gihan", "Nirmal", "Ajith"};
	private static final String[] SUBJECTS = {"Biology", "Mathematics", "Information Technology", "English"};
	private static final String[] USERNAMES = {"janaka01", "gihan2", "nirma1", "ajith"};
	private static final String[] PASSWORDS = {"janaka01", "gihan2", "nirma1", "ajith"};
	
	ArrayList<TutorModel> tutors;
	Scanner scan;
	
	public TutorServiceImpl() {
		
		scan = new Scanner(System.in);
		tutors = new ArrayList<TutorModel>();
		
		for(int i = 0; i < 4; i++) {
			
			TutorModel tutor = new TutorModel(TUTOR_NAMES[i],SUBJECTS[ThreadLocalRandom.current().nextInt(0, SUBJECTS.length)],USERNAMES[i],PASSWORDS[i]);
			
			tutors.add(tutor);
			
		}
	}
	
	@Override
	public void addTutor() {
		
		TutorModel tutor = new TutorModel();
		
		while(true) {
			
			System.out.println("Enter tutor name: ");
			tutor.setName(scan.next());
			
			System.out.println("Enter tutor subject: ");
			tutor.setSubject(scan.next());
			
			System.out.println("Enter tutor username: ");
			tutor.setuName(scan.next());
			
			System.out.println("Enter tutor password: ");
			tutor.setPass(scan.next());
			
			try {
			
				tutors.add(tutor);
				
			}catch(Exception e) {
				
				e.printStackTrace();
				System.out.println("Error. Couldn't add the tutor. Please try again.");
			}
			
			char another = 'x';
			
			while(another != 'n' && another != 'N' && another != 'y' && another != 'Y') {
				
				System.out.println("Add another tutor?(y/n)");
				another = scan.next().charAt(0);
				
				if(another != 'n' && another != 'N' && another != 'y' && another != 'Y') {
					
					System.out.println("Invalid input.");
				}
			}
			
			if(another == 'n' || another == 'N') break;
		
		}
	}

	@Override
	public boolean tutorLogin() {
		
		while(true) {
			
			System.out.println("Tutor Username: ");
			String uname = scan.next();
		
			System.out.println("Tutor Password: ");
			String pass = scan.next();
			
			for(TutorModel tutor: tutors) {
				
				if(tutor.getuName().equals(uname)) {
					
					if(tutor.getPass().equals(pass)) {
						
						return true;
						
					}
				}
			}
			
			char again = 'x';
			
			while(again != 'n' && again != 'N' && again != 'y' && again != 'Y') {
				
				System.out.println("Invalid credentials.Try again?(y/n)");
				again = scan.next().charAt(0);
				
				if(again != 'n' && again != 'N' && again != 'y' && again != 'Y') {
					
					System.out.println("Invalid input.");
				}
			}
			
			if(again == 'n' || again == 'N') return false;
		}
	}

	@Override
	public void seeTutors() {
		
		int subj;
		
		while(true) {
		
			for(int i = 0; i < tutors.size(); i++) {
				
				System.out.println((i + 1) + ". " + SUBJECTS[i]);
				
			}
			
			System.out.println("Select a subject(1-" + SUBJECTS.length + "): ");
			
			subj = scan.nextInt();
			
			if(subj > 0 && subj <= SUBJECTS.length) break;
			else System.out.println("Invalid input. Please try again.");
		
		}
		
		for(TutorModel tutorTemp : tutors) {
			
			if(tutorTemp.getSubject().equals(SUBJECTS[subj - 1])) {
				
				System.out.println(tutorTemp.getName());
				
			}
			
		}	
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		for(TutorModel t:tutors) {
			System.out.println(t.getName());
		}
	}
}
