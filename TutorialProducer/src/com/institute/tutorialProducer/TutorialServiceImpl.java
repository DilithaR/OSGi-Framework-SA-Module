package com.institute.tutorialProducer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TutorialServiceImpl implements TutorialService {

	
	HashMap<String, String> biology = new HashMap<String, String>();
	HashMap<String, String> mathematics = new HashMap<String, String>();
	HashMap<String, String> english = new HashMap<String, String>();
	HashMap<String, String> it = new HashMap<String, String>();
	
	Scanner scn = new Scanner(System.in);
	
	public TutorialServiceImpl() {
		
		biology.put("micro-biology","dummylink");
		mathematics.put("combined maths","");
		english.put("grammar","");
		it.put("flowcharts","");
		
	}
	
	@Override
	public void addTutorials() {
		
		System.out.print("1 - Biology");
		System.out.print("2 - Mathematics");
		System.out.print("3 - English");
		System.out.print("4 - Information Technology");
		
		System.out.println("Select a subject to add new tutorial(1-4)");
		int subj = scn.nextInt();
		
		System.out.print("Enter Tutorial Title : ");
		String sname = scn.nextLine();
		System.out.print("Enter Tutorial Link : ");
		String tname = scn.nextLine();
		
		switch(subj) {
		
		case 1:
			biology.put(sname, tname);
			break;
		case 2:
			mathematics.put(sname, tname);
			break;
		case 3:
			english.put(sname, tname);
			break;
		case 4:
			it.put(sname, tname);
			break;
		default:
			System.out.println("Error: Invalid Menu Selection.");
		}
	}

	@Override
	public void DisplayTutorials() {
		
		System.out.print("1 - Biology");
		System.out.print("2 - Mathematics");
		System.out.print("3 - English");
		System.out.print("4 - Information Technology");
		
		System.out.println("Select a subject to display the tutorials(1-4)");
		int subject = scn.nextInt();
		
		switch(subject) {
		
		case 1:
			System.out.println("Available Tutorials in Biology "+"\n");
			for(Map.Entry<String, String> Tutorials : biology.entrySet()) {
				System.out.println(Tutorials.getKey()+ " "+Tutorials.getValue());
			}
			break;
		case 2:
			System.out.println("Available Tutorials in Mathematics "+"\n");
			for(Map.Entry<String, String> Tutorials : mathematics.entrySet()) {
				System.out.println(Tutorials.getKey()+ " "+Tutorials.getValue());
			}
			break;
		case 3:
			System.out.println("Available Tutorials in English "+"\n");
			for(Map.Entry<String, String> Tutorials : english.entrySet()) {
				System.out.println(Tutorials.getKey()+ " "+Tutorials.getValue());
			}
			break;
		case 4:
			System.out.println("Available Tutorials in Information Technology "+"\n");
			for(Map.Entry<String, String> Tutorials : it.entrySet()) {
				System.out.println(Tutorials.getKey()+ " "+Tutorials.getValue());
			}
			break;
		default:
			System.out.println("Error: Invalid Menu Selection.");
		}
	}

}
