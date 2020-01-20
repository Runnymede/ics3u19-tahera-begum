package begum.finalproject;
/*
 * September 18, 2019
 * 2 player game of bingo
 * the first one to complete their board wins
 * to complete the board you're given equations have to match the number the dice rolls
 * @author Tahera Begum
 */

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {

		//scanner
		Scanner sc = new Scanner(System.in);

		//an array for the board player 1 will be using
		String [][] board1 = new String [4][4];

		//an array for all the player 1's answers to the given equations 
		int [][] ans1 = new int [4][4];

		//answers for player 1's equations were assigned in the answer1 method 
		answers1(ans1);


		//an array for the board player 2 will be using
		String [][] board2 = new String [4][4];

		//displays the equations for player 2 from the method
		equations2(board2);

		//answers for player 2's equations were assigned in the answer1 method 
		int [][] ans2 = new int [4][4];
		answers2(ans2);

		//displays the equations for player 1 from the method
		equations1(board1);


		//loops until someone wins
		int loop = 1;
		while(loop == 1)
		{

			//the number the dice rolled
			int diceTotal = dice();

			//displays the vertical and horizontal lines for the player 1's board
			displayBoard1(board1);

			//asks player 1 if there's a match between the number the dice rolled and to any of their equations
			System.out.println("Player 1, do any of your equations equal to " + diceTotal + ". Enter yes or no.");
			//user enters yes or no
			String input1 = sc.next();


			//if the player 1 enters yes
			if (input1.equalsIgnoreCase("yes"))
			{

				//asks the player 1 in which column there match is in
				System.out.println("In which row? And don't forget they start from 0 right to 3.");
				int row1 = sc.nextInt();

				//asks the player 1 in which row there match is in
				System.out.println("In which column? And don't forget they start from 0 down to 3.");
				int col1 = sc.nextInt();

				//checks if player 1 is correct
				if (ans1 [row1][col1] == diceTotal)
				{
					//if player 1 is correct the computer displays correct
					System.out.println("correct");
					//and replaces the equation with bingo on the board
					board1 [row1][col1] = "bingo  ";

					//checks to see if the player 1 completed their board
					if (board1 [0][0] == "bingo" & board1 [0][1] == "bingo" & board1 [0][2] == "bingo" & board1 [0][3] == "bingo" 
							& board1 [1][0] == "bingo" & board1 [1][1] == "bingo" & board1 [1][2] == "bingo" & board1 [1][3] == "bingo" 
							& board1 [2][0] == "bingo" & board1 [2][1] == "bingo" & board1 [2][2] == "bingo" & board1 [2][3] == "bingo" 
							& board1 [3][0] == "bingo" & board1 [3][1] == "bingo" & board1 [3][2] == "bingo" & board1 [3][3] == "bingo")
					{
						//if the player completed their board it tells the players player 1 won, and game's over
						System.out.println("Player 1 won, game over!");
						//and breaks out of the loop
						break;
					}

				}
				//if player 1 is incorrect and equation doesn't match the number the dice rolled
				else
				{
					//the computer displays incorrect
					System.out.println("incorrect");
				}
			}

			//if the player 1 enters no
			else if (input1.equalsIgnoreCase("no"))
			{
				//the computer displays Maybe next time
				System.out.println("Maybe next time!");
			}

			//if the player 1 enters anything else
			else 
			{
				//the computer displays Only yes or no
				System.out.println("Only yes or no.");
			}



			//displays the vertical and horizontal lines for the player 2's board
			displayBoard2(board2);

			//asks player 1 if there's a match between the number the dice rolled and to any of their equations
			System.out.println("Player 2, do any of your equations equal to " + diceTotal);
			//user enters yes or no
			String input2 = sc.next();

			//if the player 2 enters yes
			if (input2.equalsIgnoreCase("yes"))
			{
				//asks the player 2 in which column there match is in
				System.out.println("In which row? And don't forget they start from 0 right to 3.");
				int row2 = sc.nextInt();
				//asks the player 2 in which row there match is in
				System.out.println("In which column? And don't forget they start from 0 down to 3.");
				int col2 = sc.nextInt();

				//checks if player 2 is correct
				if (ans2 [row2][col2] == diceTotal)
				{
					//if player 2 is correct the computer displays correct
					System.out.println("correct");
					//and replaces the equation with bingo on the board
					board2 [row2][col2] = "bingo";

					//checks to see if the player 2 completed their board
					if (board2 [0][0] == "bingo" & board2 [0][1] == "bingo" & board2 [0][2] == "bingo" & board2 [0][3] == "bingo" 
							& board2 [1][0] == "bingo" & board2 [1][1] == "bingo" & board2 [1][2] == "bingo" & board2 [1][3] == "bingo" 
							& board2 [2][0] == "bingo" & board2 [2][1] == "bingo" & board2 [2][2] == "bingo" & board2 [2][3] == "bingo" 
							& board2 [3][0] == "bingo" & board2 [3][1] == "bingo" & board2 [3][2] == "bingo" & board2 [3][3] == "bingo")
					{
						//if the player 2 completed their board it tells the players player 2 won, and game's over
						System.out.println("Player 2 won, game over!");
						//and breaks out of the loop
						break;
					}

				}
				//if player 2 is incorrect and equation doesn't match the number the dice rolled
				else
				{
					//the computer displays incorrect
					System.out.println("incorrect");
				}
			}

			//if the player 1 enters no
			else if (input1.equalsIgnoreCase("no"))
			{
				//the computer displays Maybe next time
				System.out.println("Maybe next time!");
			}

			//if the player 1 enters anything else
			else 
			{
				//the computer displays Only yes or no
				System.out.println("Only yes or no.");
			}
		}
		//closes scanner
		sc.close();
	}

	/**
	 * it rolls the dice
	 * @return total - the number the dice rolled
	 */
	public static int dice()
	{

		//finds a random number for the first dice, a number from 1 to 6
		int dice1 = (int) (Math.random() * 6 + 1);

		//finds a random number for the second dice, a number from 1 to 6
		int dice2 = (int) (Math.random() * 6 + 1);

		//adds the number of dice one and dice 2 to find the total
		int total;
		total = dice1 + dice2;

		//displays the number the dice rolled
		System.out.println("The dice rolled the number " + total);

		return total;

	}
	
	/**
	 * displays the equations on the board 1
	 * @param board1 - an array to display the board for player 1
	 */
	public static void equations1(String [][]board1)
	{
		//assigns all the equations to the player 1's board
		board1[0][0] = "22/11  ";
		board1[0][1] = "16/8   ";
		board1[0][2] = "5+6    ";
		board1[0][3] = "14-6   ";
		board1[1][0] = "12-3   ";
		board1[1][1] = "15-12  ";
		board1[1][2] = "3+4    ";
		board1[1][3] = "56/7   ";
		board1[2][0] = "984/123";
		board1[2][1] = "1x8    ";
		board1[2][2] = "2x2    ";
		board1[2][3] = "3+4    ";
		board1[3][0] = "16-5   ";
		board1[3][1] = "86-74  ";
		board1[3][2] = "36/6   ";
		board1[3][3] = "104-92 ";
	}
	
	/**
	 * displays the equations on the board 2
	 * @param board2 - an array to display the board for player 2
	 */
	public static void equations2(String [][]board2)
	{
		//assigns all the equations to the player 2's board
		board2[0][0] = "18/6 ";
		board2[0][1] = "5x2  ";
		board2[0][2] = "12-3 ";
		board2[0][3] = "4+6  ";
		board2[1][0] = "1x8  ";
		board2[1][1] = "16-5 ";
		board2[1][2] = "18/9 ";
		board2[1][3] = "17-11";
		board2[2][0] = "3+4  ";
		board2[2][1] = "7-2  ";
		board2[2][2] = "3+3  ";
		board2[2][3] = "9-5  ";
		board2[3][0] = "9/3  ";
		board2[3][1] = "7+2  ";
		board2[3][2] = "1+1  ";
		board2[3][3] = "8+3  ";
	}
	
	/**
	 * displays the lines on the board 1
	 * @param board1 - an array to display the board for player 1
	 */
	public static void displayBoard1(String [][]board1)
	{
		//prints board for player 1
		for (int row = 0; row <board1.length; row++)
		{
			for (int col = 0; col < board1[row].length; col++)
			{
				//displays the vertical lines on the board
				System.out.print(board1 [row][col] + " | ");

			}
			System.out.println();
			//displays the horizontal lines on the board
			System.out.println("---------------------------------------");
		}	

	}
	
	/**
	 * displays the lines on the board 2
	 * @param board2 - an array to display the board for player 2
	 */
	public static void displayBoard2(String [][]board2)
	{
		//prints board for player 2
		for (int row = 0; row <board2.length; row++)
		{
			for (int col = 0; col < board2[row].length; col++)
			{
				//displays the vertical lines on the board
				System.out.print(board2 [row][col] + " | ");

			}
			System.out.println();
			//displays the horizontal lines on the board
			System.out.println("-------------------------------");
		}	

	}

	/**
	 * all the answers to player 1's board
	 * @param ans1 - an array to check if the player 1's answers are correct
	 */
	public static void answers1(int [][] ans1)
	{
		//declares all the answers to the equations in an array for player 1
		ans1[0][0] = 2;
		ans1[0][1] = 2;
		ans1[0][2] = 11;
		ans1[0][3] = 8;
		ans1[1][0] = 9;
		ans1[1][1] = 3;
		ans1[1][2] = 7;
		ans1[1][3] = 8;
		ans1[2][0] = 8;
		ans1[2][1] = 8;
		ans1[2][2] = 4;
		ans1[2][3] = 6;
		ans1[3][0] = 11;
		ans1[3][1] = 12;
		ans1[3][2] = 6;
		ans1[3][3] = 1;
	}

	/**
	 * all the answers to player 2's board
	 * @param ans2 - an array to check if the player 2's answers are correct
	 */
	public static void answers2(int [][] ans2)
	{
		//declares all the answers to the equations in an array for player 2
		ans2[0][0] = 3;
		ans2[0][1] = 10;
		ans2[0][2] = 9;
		ans2[0][3] = 10;
		ans2[1][0] = 8;
		ans2[1][1] = 11;
		ans2[1][2] = 2;
		ans2[1][3] = 6;
		ans2[2][0] = 7;
		ans2[2][1] = 5;
		ans2[2][2] = 6;
		ans2[2][3] = 4;
		ans2[3][0] = 3;
		ans2[3][1] = 9;
		ans2[3][2] = 2;
		ans2[3][3] = 11;
	}
}		
