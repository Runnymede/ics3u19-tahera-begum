package begum.unit3;
/**
 * November 25, 2019
 * prints how many times each number came up
 * @author Tahera Begum
 */

public class ThousandRolls {

	public static void main(String[] args) {



		int [] counter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		//displays the headings for total and number of rolls
		System.out.format("%-8s %-1s\n", "Total", "Number of Rolls");

		//does the loop for 10000 times
		for (int h = 0; h < 10000; h++)
		{


			//finds a random number for the first dice, a number from 1 to 6
			int dice1 = (int) (Math.random() * 6 + 1);

			//finds a random number for the second dice, a number from 1 to 6
			int dice2 = (int) (Math.random() * 6 + 1);

			//adds the number of dice one and dice 2 to find the total
			int total;
			total = dice1 + dice2;



			//if total equals 2
			if (total == 2)
			{
				//then adds one to the counter at the index of 0
				counter [0]++;
			}

			//if total equals 3
			else if (total == 3)
			{
				//then adds one to the counter at the index of 1
				counter [1]++;
			}

			//if total equals 4
			else if (total == 4)
			{
				//then adds one to the counter at the index of 2
				counter [2]++;
			}

			//if total equals 5
			else if (total == 5)
			{
				//then adds one to the counter at the index of 3
				counter [3]++;
			}

			//if total equals 6
			else if (total == 6)
			{
				//then adds one to the counter at the index of 4
				counter [4]++;
			}

			//if total equals 7
			else if (total == 7)
			{
				//then adds one to the counter at the index of 5
				counter [5]++;
			}

			//if total equals 8
			else if (total == 8)
			{
				//then adds one to the counter at the index of 6
				counter [6]++;
			}

			//if total equals 9
			else if (total == 9)
			{
				//then adds one to the counter at the index of 7
				counter [7]++;
			}

			//if total equals 10
			else if (total == 10)
			{
				//then adds one to the counter at the index of 8
				counter [8]++;
			}

			//if total equals 11
			else if (total == 11)
			{
				//then adds one to the counter at the index of 9
				counter [9]++;
			}

			//if total equals 12
			else if (total == 12)
			{
				//then adds one to the counter at the index of 10
				counter [10]++;
			}





		}

		//loops 11 times, as long as the length of counter
		for (int i = 0; i< counter.length; i++)
		{
			//displays the total, and the number of rolls
			System.out.format("%-8s %-8s\n" , i+2, counter[i]);
		}

	}

}
