
/*
 * Person1 class (child #1 of Person)  
 * Author. Alex Patel
 * Purpose. Illustrate use of abstract classes
 */

public class Person1 extends Person {

	// This class uses the same question/answer combination 
	@Override
	void askQuestion() {
		System.out.println("Where is your favorite place to visit?");
	}

	@Override
	void answerQuestion() {
		System.out.println("Chicago is my favorite place to visit");
	}

}

