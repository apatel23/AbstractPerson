import java.util.Random;

/*
 * Person3 class (child #3 of Person)  
 * Author. Alex Patel
 * Purpose. Illustrate use of abstract classes
 */

public class Person3 extends Person {
	// this class uses 4 questions and answers chosen at random
	
	Random randomGenerator = new Random();
	private int randomNumber;
	
	@Override
	void askQuestion() {
		String questions[] = {"Where do you live?", "How long is a whale?",
				"What is the weather like today?", "How old are you?"};
		randomNumber = randomGenerator.nextInt(4);
		System.out.println(questions[randomNumber]);
		
	}

	@Override
	void answerQuestion() {
		String answers[] = {"I live in Denver", "I don't know", 
				"The weather is quite warm today", "I am 20 years old"};
		randomNumber = randomGenerator.nextInt(4);
		System.out.println(answers[randomNumber]);
	}

}
