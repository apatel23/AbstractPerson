import java.util.ArrayList;
/*
 * Party class.  
 * Author. Cyndi Rader
 * Edited by: Alex Patel
 * Purpose. Illustrate use of abstract classes
 */

public class Party {
	// Person is an abstract class
	private ArrayList<Person> people = new ArrayList<Person>();
	// Reminder: constant values are typically public and static (only one copy)
	public static final int MAX_QUESTIONS = 15;
	
	public Party() {
		// Add your person objects here.
		Person p1 = new Person1();
		Person p2 = new Person2();
		Person p3 = new Person3();
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		
    }
	
	public void partyTime() {
		// For simplicity, we'll just have people "ask" a question of the next
		// person in the list. 
		int questionPerson = 0;
		int answerPerson = 1;
		// For simplicity, just doing a fixed number of questions
		int questionsAsked = 0;
		while (questionsAsked < MAX_QUESTIONS) {
			// display the question and answer
			people.get(questionPerson).askQuestion();
			people.get(answerPerson).answerQuestion();
			System.out.println();
			// set up for the next round
			questionsAsked++;
			questionPerson = (questionPerson + 1) % people.size();
			answerPerson = (answerPerson + 1) % people.size();			
		}
	}
	
	public void introductions() {
		// Note that this function makes use of methods defined in the 
		// parent class
		for (Person p : people) {
			p.askName();
			p.giveName();
		}
		System.out.println("Welcome to the party, let's chat!\n");
	}
	
	public static void main(String[] args) {
		Party party = new Party();
		party.introductions();
		party.partyTime();
	}
	
}


