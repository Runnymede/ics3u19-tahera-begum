package begum.unit2;
/**
 * November 12, 2019
 *  displays five random rolls of two dice where each die is numbered from 1 to 6 
 *  also shows the total of each roll
 * @author Tahera Begum
 */

public class DiceRolls {

	public static void main(String[] args) {
		
		//displays the headings for each column
		System.out.format("%-8s %-8s %-1s\n", "dice1", "dice2", "total");
		
		//does the loop for 5 times
		for (int h = 0; h < 5; h++)
		{
			
			//finds a random number for the first dice, a number from 1 to 6
			int dice1 = (int) (Math.random() * 6 + 1);
			
			//finds a random number for the second dice, a number from 1 to 6
			int dice2 = (int) (Math.random() * 6 + 1);
			
			//adds the number of dice one and dice 2 to find the total
			int total;
			total = dice1 + dice2;
			
			//displays the number of first dice, second dice, and the total
			System.out.format("%-8s %-8s %-1s\n", dice1, dice2, total);
		}


	}

}
