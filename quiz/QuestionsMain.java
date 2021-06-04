package com.assignment1.quiz;

import java.util.Scanner;

public class QuestionsMain {
	
public static void main(String[] args) {
	

		String question1 = "Which of the following is not OOPS concept in Java?\n" 
		+ " a. Inheritance\n b.Encapsulation\n c.Polymorphism\n d. Compilation\n";

		String question2 = " Which of the following is a type of polymorphism in Java?\n" 
		+ " a. Compile time polymorphism\n b. Execution time polymorphism\n c. Multiple polymorphism\n d.Multilevel polymorphism\n";
		
		String question3 = "An expression involving byte, int, and literal numbers is promoted to which of these?\n" 
				+ " a.  int\n b. long\n c. double\n d. boolean\n";
		
		String question4 = " Which concept of Java is a way of converting real world objects in terms of class?\n" 
				+ " a. Polymorphism\n b.  Encapsulation\n c. Abstraction\n d.Inheritance\n";
		
		String question5 = "Which of these coding types is used for data type characters in Java?\n" 
				+ " a. ASCII\n b. UNICODE\n c. NONE\n d.All of the above\n";
		
		String question6 = " When does Exceptions in Java arises in code sequence?\n" 
				+ " a.  Run Time\n b. Compilation Time\n c.  Can Occur Any Time\n d. None of the mentioned\n";
		
		String question7 = "Which of these keywords is used to manually throw an exception?\n" 
				+ " a. try\n b. finally\n c.  throw\n d. catch\n";
		
		String question8 = "Which method can be defined only once in a program?\n" 
				+ " a. main method\n b. finalize method\n c. static method\n d. private method\n";
		
		String question9 = "Which of this keyword must be used to inherit a class?\n"
				+ " a.  super\n b. this\n c. extent\n d.extends\n";
		
		String question10 = " What is the default value of a char in Java?\n" 
				+ " a. space \n b. 0\n c.  false\n d. null\n";

		Question[] questions = { 
				new Question(question1, "d"),
				new Question(question2, "a"),
				new Question(question3, "a"),
				new Question(question4, "c"),
				new Question(question5, "b"),
				new Question(question6, "a"),
				new Question(question7, "c"),
				new Question(question8, "a"),
				new Question(question9, "c"),
				new Question(question10, "a")
				};
		takeTest(questions);
}
		
		public static void takeTest(Question[] questions) {
			int score = 0;
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < questions.length; i++) {
				System.out.println(questions[i].question);
				String answer = sc.nextLine();
				if (answer.equals(questions[i].answer)) {
					score++;
				}
			}
			float scr=(float)score/questions.length;
			float percentage=scr*100f;
			System.out.println("you got " + score + " out of" + questions.length);
			System.out.println("you got "+percentage+"%");
			if(percentage<=33) {
				System.out.println("Your preformance is  bad");
				System.err.println("Not eligiable for next round");
			}
			else
				if(percentage<=54) {
					System.out.println("Your preformance is  poor");
					System.err.println("Not eligiable for next round");
					
				}
				else
					if(percentage<=60) {
						System.out.println("Your preformance is  good");
						System.err.println("Eligiable for next round");
					}
					else
						if(percentage<=75) {
							System.out.println("Your preformance is  very good");
							System.err.println("Eligiable for next round");
						}
						else {
							System.out.println("Your preformance is  excellent");
			               System.err.println("Eligiable for next round");
			               }
		}

}
