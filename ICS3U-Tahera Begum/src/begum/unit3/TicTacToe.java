package begum.unit3;
/**
 * November 25, 2019
 * the tic tac toe game
 * @author Tahera Begum
 */

import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {

		//scanner
		Scanner sc = new Scanner(System.in);

		//2D array
		char [][] tttboard = new char [3][3];

		//loops the entire program 5 times
		for (int i = 0; i < 5; i++)
		{
			//asks the x player which row he wants his x to be
			System.out.println("First player enter which row number you want to put your X in from 0 to 2. No repeating places.");
			int r1 = sc.nextInt();

			//asks the x player which column he wants his x to be
			System.out.println("First player enter which column number you want to put your X in from 0 to 2. No repeating places.");
			int c1 = sc.nextInt();

			//puts the x where the x player wanted it
			tttboard [r1][c1] = 'x';


			//prints the tic tac toe chart
			for (int row = 0; row < tttboard.length; row++)

			{
				for (int col = 0; col < tttboard[row].length; col++)
				{

					System.out.print(tttboard [row] [col] + " | ");

				}
				System.out.println();
				System.out.println("-----------");
			}	

			//if statements to tell the x player if he won and then breaks out of the loop
			if (tttboard [0][0] == 'x' && tttboard [0][1] == 'x' && tttboard [0][2] == 'x')
			{
				System.out.println("You won!");
				break;
			}
			else if (tttboard [1][0] == 'x' && tttboard [1][1] == 'x' && tttboard [1][2] == 'x')
			{
				System.out.println("You won!");
				break;
			}
			else if (tttboard [2][0] == 'x' && tttboard [2][1] == 'x' && tttboard [2][2] == 'x')
			{
				System.out.println("You won!");
				break;
			}

			//
			else if (tttboard [0][0] == 'x' && tttboard [1][0] == 'x' && tttboard [2][0] == 'x')
			{
				System.out.println("You won!");
				break;
			}
			else if (tttboard [0][1] == 'x' && tttboard [1][1] == 'x' && tttboard [2][1] == 'x')
			{
				System.out.println("You won!");
				break;
			}
			else if (tttboard [0][2] == 'x' && tttboard [1][2] == 'x' && tttboard [2][2] == 'x')
			{
				System.out.println("You won!");
				break;
			}

			//
			else if (tttboard [0][0] == 'x' && tttboard [1][1] == 'x' && tttboard [2][2] == 'x')
			{
				System.out.println("You won!");
				break;
			}
			else if (tttboard [2][0] == 'x' && tttboard [1][1] == 'x' && tttboard [0][2] == 'x')
			{
				System.out.println("You won!");
				break;
			}


			//asks the o player which row he wants his x to be
			System.out.println("Second player enter which row number you want to put your O in. No repeating places.");
			int r2 = sc.nextInt();

			//asks the o player which column he wants his x to be
			System.out.println("Second player enter which column number you want to put your O in. No repeating places.");
			int c2 = sc.nextInt();

			tttboard [r2][c2] = 'o';

			//prints the tic tac toe chart
			for (int row = 0; row < tttboard.length; row++)

			{
				for (int col = 0; col < tttboard[row].length; col++)
				{

					System.out.print(tttboard [row] [col] + " | ");

				}
				System.out.println();
				System.out.println("-----------");


				//if statements to tell the o player if he won and then breaks out of the loop
				if (tttboard [0][0] == 'o' && tttboard [0][1] == 'o' && tttboard [0][2] == 'o')
				{
					System.out.println("You won!");
					break;
				}
				else if (tttboard [1][0] == 'o' && tttboard [1][1] == 'o' && tttboard [1][2] == 'o')
				{
					System.out.println("You won!");
					break;
				}
				else if (tttboard [2][0] == 'o' && tttboard [2][1] == 'o' && tttboard [2][2] == 'o')
				{
					System.out.println("You won!");
					break;
				}

				//
				else if (tttboard [0][0] == 'o' && tttboard [1][0] == 'o' && tttboard [2][0] == 'o')
				{
					System.out.println("You won!");
					break;
				}
				else if (tttboard [0][1] == 'o' && tttboard [1][1] == 'o' && tttboard [2][1] == 'o')
				{
					System.out.println("You won!");
					break;
				}
				else if (tttboard [0][2] == 'o' && tttboard [1][2] == 'o' && tttboard [2][2] == 'o')
				{
					System.out.println("You won!");
					break;
				}

				//
				else if (tttboard [0][0] == 'o' && tttboard [1][1] == 'o' && tttboard [2][2] == 'o')
				{
					System.out.println("You won!");
					break;
				}
				else if (tttboard [2][0] == 'o' && tttboard [1][1] == 'o' && tttboard [0][2] == 'o')
				{
					System.out.println("You won!");
					break;
				}
			}	
		}
		//closes scanner
		sc.close();

	}

}
