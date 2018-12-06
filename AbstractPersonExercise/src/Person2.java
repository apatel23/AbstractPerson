
/*
 * Person2 class (child #2 of Person)  
 * Author. Alex Patel
 * Purpose. Illustrate use of abstract classes
 */

public class Person2 extends Person {
	// this class uses 4 questions and answers, chosen in order
	
	private int count = 0;
	
	@Override
	void askQuestion() {
		String questions[] = {"Where do you live?", "How long is a whale?",
				"What is the weather like today?", "How old are you?"};
		System.out.println(questions[count]);
		if( count == 3 ) count = 0;
		else count++;
	}

	@Override
	void answerQuestion() {
		String answers[] = {"I live in Denver", "I don't know", 
				"The weather is quite warm today", "I am 20 years old"};
		System.out.println(answers[count]);
		if( count == 3 ) count = 0;
		else count++;
	}

}
