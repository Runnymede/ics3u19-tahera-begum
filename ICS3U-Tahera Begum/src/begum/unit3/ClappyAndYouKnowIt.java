package begum.unit3;
/**
 * November 25, 2019
 * prints out lyrics to "if you're happy and you know it" with 10 verses with different actions
 * @author Tahera Begum
 */

public class ClappyAndYouKnowIt {

	public static void main(String[] args) {
		
		
		//an array that stores 10 different actions
		String [] action = {"clap your hands", "stomp your feet", "spin around", "squat down", "jump up and down",
				"dance around", "skip away", "shake your hips", "run real fast", "walk real slow"};
		
		//loops 10 times
		for (int i = 0; i < 10; i++)
		{
			//prints one verse each time it goes through the loop with a different action
			System.out.println("If your happy and you know it " + action [i]);
			System.out.println("If your happy and you know it " + action [i]);
			System.out.println("If your happy and you know it and you really want to show it.");
			System.out.println("If your happy and you know it " + action [i]);
			//prints an extra line to separate the verses
			System.out.println();
		}
		

	}

}
