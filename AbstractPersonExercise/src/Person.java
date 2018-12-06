import java.util.Scanner;

/*
 * Person class (abstract).  
 * Author: Alex Patel
 * Purpose: Illustrate use of abstract classes
 */

public abstract class Person {

	private String myName;
	
	public void askName() {
		System.out.println("What is your name?");
		Scanner scan = new Scanner(System.in);
		myName = scan.nextLine();
	}
	
	public void giveName() {
		System.out.println("My name is: " + myName);
	}
	
	abstract void askQuestion();
	
	abstract void answerQuestion();

}




