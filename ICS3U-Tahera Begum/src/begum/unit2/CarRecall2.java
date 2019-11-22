package begum.unit2;
/**
 * October 28, 2019
 * CarRecall application that prompts a customer for the model number of their
 * car to find out if it is defective, but  modified to allow the user to 
 * input as many model numbers as needed.
 * @author Tahera Begum
 */
import java.util.Scanner;
public class CarRecall2 {

	public static void main(String[] args) {
		

		//Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//allows the user to enter model or quit
		System.out.println("Enter the car's model number or 0 to quit.");


		//variable
		int model = sc.nextInt();
		
		
		//loops to allow the user to input as many model numbers as needed or quit.
		while (model !=0)
		{
			
		
		//assigns if defective or not
		String defective;
		switch (model)
		
		//says it's defective and needs repair if it's the following model numbers
		{
		case 199: defective = "Your car is defective. It must be repaired."; 
		
		case 179: defective = "Your car is defective. It must be repaired."; 
		
		case 189: defective = "Your car is defective. It must be repaired.";
		
		case 190: defective = "Your car is defective. It must be repaired.";
		
		case 191: defective = "Your car is defective. It must be repaired.";
		
		case 192: defective = "Your car is defective. It must be repaired.";
		
		case 193: defective = "Your car is defective. It must be repaired.";
		
		case 194: defective = "Your car is defective. It must be repaired.";
	
		case 195: defective = "Your car is defective. It must be repaired.";
		
		case 221: defective = "Your car is defective. It must be repaired.";
		
		case 780: defective = "Your car is defective. It must be repaired.";
		break;
		
		//says it's not defective if it's not the above model numbers
		default: defective = "Your car is not defective.";
		break;
		}
		System.out.println(defective);
		
		//changing the value of the variable before looping back
		System.out.println("Enter another car's model number or 0 to quit.");
		model = sc.nextInt();
		}
		
		//says bye if user wants to quit
		System.out.println("Bye.");
		
		sc.close();
	}

}