package com.institute.resourcesProducer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ResourcesServiceImpl implements ResourcesService {
	
	Scanner s;

	HashMap<String, Float> withBiology = new HashMap<String, Float>();
	HashMap<String, Float> withMathematics = new HashMap<String, Float>();
	HashMap<String, Float> withEnglish = new HashMap<String, Float>();
	HashMap<String, Float> withIt = new HashMap<String, Float>();
		
	public ResourcesServiceImpl() {
		withBiology.put("A Brief History Of HumanKind", (float) 1800.0);
		withBiology.put("The Complete Human Body", (float) 2000.0);
		withMathematics.put("Real numbers", (float) 2500.0);
		withMathematics.put("fractions", (float) 1000.0);
		withEnglish.put("Grammer", (float) 4000.0);
		withMathematics.put("English quotes", (float) 2000.0);
		withIt.put("Artificial intelligence", (float) 3000.0);
		withIt.put("cross platform mobile apps", (float) 1500.0);
		
		s = new Scanner(System.in);
	}
	
	@Override
	public void addEducationResources() {
		
		System.out.println("1 - Biology");
		System.out.println("2 - Mathematics");
		System.out.println("3 - English");
		System.out.println("4 - Information Technology");
		
		System.out.println("Select a subject to add new Educational resources(1-4)");
		int subject = s.nextInt();
		
		System.out.println("Enter book name : ");
		String bname = s.next();
		System.out.println("Enter price ");
		float price = s.nextFloat();
		
		switch(subject) {
		
		case 1:
			withBiology.put(bname,price);
			break;
		case 2:
			withMathematics.put(bname,price);
			break;
		case 3:
			withEnglish.put(bname, price);
			break;
		case 4:
			withIt.put(bname, price);
			break;
		default:
			System.out.println("Error:Invalid menu selection");
		}
	}

	@Override
	public void displayPriceList() {
		
		System.out.println("1 - Biology");
		System.out.println("2 - Mathematics");
		System.out.println("3 - English");
		System.out.println("4 - Information Technology");
		
		System.out.println("Select a subject to display the educational resources(1-4)");
		int subject1 = s.nextInt();
		
		switch(subject1) {
		
		case 1:
			System.out.println("Available Educational Resources in Biology "+"\n");
			for(Map.Entry<String, Float> book1 : withBiology.entrySet()) {
				System.out.println(book1.getKey()+ " "+book1.getValue());
			}
			break;
		case 2:
			System.out.println("Available Educational Resources in Mathematics "+"\n");
			for(Map.Entry<String, Float> book2 : withMathematics.entrySet()) {
				System.out.println(book2.getKey()+ " "+book2.getValue());
			}
			break;
		case 3:
			System.out.println("Available Educational Resources in English "+"\n");
			for(Map.Entry<String, Float> book3 : withEnglish.entrySet()) {
				System.out.println(book3.getKey()+ " "+book3.getValue());
			}
			break;
		case 4:
			System.out.println("Available Tutorials in Information Technology "+"\n");
			for(Map.Entry<String, Float> book4 : withIt.entrySet()) {
				System.out.println(book4.getKey()+ " "+book4.getValue());
			}
			break;
		default:
			System.out.println("Error: Invalid Menu Selection.");
		}
	}

}
