package begum.unit3;

public class ThousandRolls {

	public static void main(String[] args) {

		

		int [] counter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		//displays the headings for each column
		System.out.format("%-8s %-1s\n", "Total", "Number of Rolls");

		//does the loop for 5 times
		for (int h = 0; h < 10000; h++)
		{


			//finds a random number for the first dice, a number from 1 to 6
			int dice1 = (int) (Math.random() * 6 + 1);

			//finds a random number for the second dice, a number from 1 to 6
			int dice2 = (int) (Math.random() * 6 + 1);

			//adds the number of dice one and dice 2 to find the total
			int total;
			total = dice1 + dice2;




			if (total == 2)
			{
				counter [0]++;
			}
			else if (total == 3)
			{
				counter [1]++;
			}
			else if (total == 4)
			{
				counter [2]++;
			}
			else if (total == 5)
			{
				counter [3]++;
			}
			else if (total == 6)
			{
				counter [4]++;
			}
			else if (total == 7)
			{
				counter [5]++;
			}
			else if (total == 8)
			{
				counter [6]++;
			}
			else if (total == 9)
			{
				counter [7]++;
			}
			else if (total == 10)
			{
				counter [8]++;
			}
			else if (total == 11)
			{
				counter [9]++;
			}
			else if (total == 12)
			{
				counter [10]++;
			}




			
		}
		for (int i = 0; i< counter.length; i++)
			{
			//displays the number of first dice, second dice, and the total
			System.out.format("%-8s %-8s\n" , i+2, counter[i]);
			}

	}

}
