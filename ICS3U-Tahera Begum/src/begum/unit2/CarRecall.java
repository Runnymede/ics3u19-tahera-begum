package begum.unit2;
/**
 * October 7, 2019
 * CarRecall application that prompts a customer for the model number of their
 * car to find out if it is defective.
 * @author Tahera Begum
 */
import java.util.Scanner;
public class CarRecall {

	public static void main(String[] args) {
		

		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//asks the user for model number
		System.out.println("Enter the car's model number");


		//variables
		int model = sc.nextInt();
		String defective;

		//assigns if the car is defective or not
		switch (model)
		{
		
		//says it's defective and needs repair if it's the following model numbers
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
		sc.close();
	}

}
