import java.util.ArrayList;


public class BadNews {
	private ArrayList<String> quotes = new ArrayList();
	

	
	public void dontBeSoSerious(){
		System.out.println("Whenever you feel sad, just remember that somewhere there in this world there's an idiot pulling a door that says 'PUSH'");

		System.out.println("I always wanted to be a procrastinator, I just never got around to it");
		
	}
	
	public void countTo100() {
		for (int i = 0; i < 100; i++)
			System.out.println(i);
		System.out.println(100);
	}
	
	public void addQuotes(){
		quotes.add("Jokes about German sausage are the wurst");
		quotes.add("Be kind to your dentist, He has fillings to");
	}
	
	public void someQuotes(){
		System.out.println("Here is a list of some Quotes (WARNING: Not all are funny)");
		for (String quote : quotes)
			System.out.println(quote);
	}

	public void  demotivator () {
		System.out.println("These jokes suck!");
	}
	
	public void goAway() {
		System.out.println("Let's Hear YOU tell some jokes");
		//fixed that mess up spelling.
		// Don't tell me how to spell when you can't use proper English
	}
	
	public void someOtherFucntion () {
		System.out.println("Oh my god dude!");
	}
	
	public void dontTellMe(){
		System.out.println("God is a name, aka proper noun.  so it needs to be CAPITALIZED"); 
		System.out.println("IS THAT CONFRINATIONAL");
		System.out.println("That reminds me of that song 'go to church by some rapepr");
	}
	
	public static void main(String[] args) {

		BadNews justKidding = new BadNews();
		
		justKidding.dontBeSoSerious();
		justKidding.addQuotes();
		justKidding.someQuotes();
		justKidding.demotivator();
		justKidding.goAway();
		justKidding.someOtherFucntion();
		justKidding.dontTellMe();
		justKidding.countTo100();
		

	}

}





