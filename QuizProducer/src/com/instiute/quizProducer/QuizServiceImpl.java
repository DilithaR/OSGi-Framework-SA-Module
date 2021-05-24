package com.instiute.quizProducer;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizServiceImpl implements QuizService {

	private ArrayList<QuizModel> biologyQ;
	private ArrayList<QuizModel> mathematicsQ;
	private ArrayList<QuizModel> informationTechnologyQ;
	private ArrayList<QuizModel> englishQ;
	
	Scanner sbj;
	
	
	private String[][] biologyQnA = {
			{"The human heart is?", "Neurogenic", "Myogenic heart CC", "Pulsa ting heart"},
			{"Spermology is the study of?","Seed CC","Leaf","Fruit"},
			{"Who is known as father of Zoology?","Darwin","Lamark","Aristotle CC"},
			{"Animal without red blood cells?","Frog","Earthworm CC","Snake"},
			{"The energy released by 1 gram of glucose is","6 kcal","5 kcal","4 kcal CC"},
	};
	private String[][] mathematicsQnA = {
			  {"The human heart is?", "Neurogenic", "Myogenic heart CC", "Pulsating heart"},
			  {"Spermology is the study of?","Seed CC","Leaf","Fruit"},
			  {"Who is known as father of Zoology?", "Darwin","Lamark", "Aristotle CC"},
			  {"Animal without red blood cells?","Frog","Earthworm CC","Snake"},
			  {"The energy released by 1 gram of glucose is","6 kcal","5 kcal","4 kcal CC"},
	};
	private String[][] informationTechnologyQnA = {
			  {"The human heart is?", "Neurogenic", "Myogenic heart CC", "Pulsating heart"},
			  {"Spermology is the study of?","Seed CC","Leaf","Fruit"},
			  {"Who is known as father of Zoology?","Darwin","Lamark","Aristotle CC"},
			  {"Animal without red blood cells?","Frog","Earthworm CC","Snake"},
			  {"The energy released by 1 gram of glucose is","6 kcal","5 kcal","4 kcal CC"},
	};
	private String[][] englishQnA = {
			  {"The human heart is?", "Neurogenic", "Myogenic heart CC", "Pulsating heart"},
			  {"Spermology is the study of?","Seed CC","Leaf","Fruit"},
			  {"Who is known as father of Zoology?","Darwin","Lamark","Aristotle CC"},
			  {"Animal without red blood cells?","Frog","Earthworm CC","Snake"},
			  {"The energy released by 1 gram of glucose is","6 kcal","5 kcal","4 kcal CC"},
	};

	public QuizServiceImpl() {
		
		sbj = new Scanner(System.in);
		
		biologyQ = new ArrayList<QuizModel>();
		mathematicsQ = new ArrayList<QuizModel>();
		informationTechnologyQ = new ArrayList<QuizModel>();
		englishQ = new ArrayList<QuizModel>();

		for(int i = 0; i < 5;i++) {
			QuizModel bio = new QuizModel(biologyQnA[i][0],biologyQnA[i][1],biologyQnA[i][2],biologyQnA[i][3]);
			biologyQ.add(bio);
		}
		
		for(int i = 0; i < 5;i++) {
			QuizModel mathematics = new QuizModel(mathematicsQnA[i][0],mathematicsQnA[i][1],mathematicsQnA[i][2],mathematicsQnA[i][3]);
			mathematicsQ.add(mathematics);
			
		}
		
		for(int i = 0; i < 5;i++) {
			QuizModel informationTechnology = new QuizModel(informationTechnologyQnA[i][0],informationTechnologyQnA[i][1],informationTechnologyQnA[i][2],informationTechnologyQnA[i][3]);
			informationTechnologyQ.add(informationTechnology);
			
		}
		
		for(int i = 0; i < 5;i++) {
			QuizModel english = new QuizModel(englishQnA[i][0],englishQnA[i][1],englishQnA[i][2],englishQnA[i][3]);
			englishQ.add(english);
			
		}
	}	
	
	@Override
	public void addQuiz() {
		
		char moreQ;
		do{
			int subject;
			
			System.out.print("1 - Biology");
			System.out.print("2 - Mathematics");
			System.out.print("3 - English");
			System.out.print("4 - Information Technology");
				
			while(true) {
				System.out.println("Select a subject to add new Quiz(1-4)");
				subject = sbj.nextInt();
					
				if(subject > 0 && subject < 5) break;
				else System.out.println("Invalid input.please try again.");
			}
			
			QuizModel question = new QuizModel();
			
			System.out.print("Enter Question : ");
			question.setQuestion(sbj.nextLine());
			System.out.print("Enter 1st wrong answer : ");
			question.setQuestion(sbj.nextLine());
			System.out.print("Enter 2st wrong answer : ");
			question.setQuestion(sbj.nextLine());
			System.out.print("Enter the correct answer : ");
			question.setQuestion(sbj.nextLine());
			
			switch(subject) {
			
			case 1:
				biologyQ.add(question);
				break;
			case 2:
				mathematicsQ.add(question);
				break;
			case 3:
				informationTechnologyQ.add(question);
				break;
			case 4:
				englishQ.add(question);
				break;
				
			}
			
			
		
			System.out.println("Do you want to add more questions?(Y/N)");
			moreQ = sbj.nextLine().charAt(0);
		
		}while(moreQ == 'Y' || moreQ == 'y');
	}

	@Override
	public void takeQuiz() {
		
		char moreQ;
		
		do{
			int subject;
			ArrayList<QuizModel> temp = null;
			
			System.out.print("1 - Biology");
			System.out.print("2 - Mathematics");
			System.out.print("3 - English");
			System.out.print("4 - Information Technology");
				
			while(true) {
				System.out.println("Select a subject to take quiz on(1-4)");
				subject = sbj.nextInt();
					
				if(subject > 0 && subject < 5) break;
				else System.out.println("Invalid input.please try again.");
			}
			
			switch(subject) {
			
			case 1:
				temp = biologyQ;
				break;
			case 2:
				temp = mathematicsQ;
				break;
			case 3:
				temp = informationTechnologyQ;
				break;
			case 4:
				temp = englishQ;
				break;
				
			}
			
			for(QuizModel qm:temp) {
				qm.takeQuestion();
			}
		
			System.out.println("Do you want to face another questionnaire?(Y/N)");
			moreQ = sbj.nextLine().charAt(0);
		
		}while(moreQ == 'Y' || moreQ == 'y');
	}
}
