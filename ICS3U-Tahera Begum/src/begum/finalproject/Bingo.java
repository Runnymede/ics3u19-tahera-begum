package begum.finalproject;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {

		//scanner
		Scanner sc = new Scanner(System.in);

		//the number the dice rolled
		int diceTotal = dice();

		//an array for the board player 1 will be using
		String [][] board1 = new String [4][4];
		//displays the equations for player 1 from the method
		equations1(board1);
		//displays the vertical and horizontal lines of the player 1's board
		displayBoard1(board1);
		//an array for all the player 1's answers to the equations 
		int [][] ans1 = new int [4][4];
		//answers were assigned in the answer1 method 
		answers1(ans1);


		//asks player 1 if there's a match between the number the dice rolled and the answer to any of their equations
		System.out.println("Player 1, do any of your equations equal to " + diceTotal + ". Enter yes or no.");
		//user enters yes or no
		String input1 = sc.next();

		//if the user enters yes
		if (input1.equalsIgnoreCase("yes"))
		{

			//asks the player 1 in which column there match is in
			System.out.println("In which column? And don't forget they start from 0 down to 3.");
			int col1 = sc.nextInt();
			//asks the player 1 in which row there match is in
			System.out.println("In which row? And don't forget they start from 0 right to 3.");
			int row1 = sc.nextInt();

			//checks if player 1 is correct
			if (ans1 [col1][row1] == diceTotal)
			{
				//if player 1 is correct the computer displays correct
				System.out.println("correct");

				//
				board1 [col1][row1] = "bingo";

				if (board1 [0][0] == "bingo" & board1 [0][1] == "bingo" & board1 [0][2] == "bingo" & board1 [0][3] == "bingo" 
						& board1 [1][0] == "bingo" & board1 [1][1] == "bingo" & board1 [1][2] == "bingo" & board1 [1][3] == "bingo" 
						& board1 [2][0] == "bingo" & board1 [2][1] == "bingo" & board1 [2][2] == "bingo" & board1 [2][3] == "bingo" 
						& board1 [3][0] == "bingo" & board1 [3][1] == "bingo" & board1 [3][2] == "bingo" & board1 [3][3] == "bingo")
				{
					System.out.println("Player 1 won");
					//					break;
				}

			}
			else
			{
				System.out.println("incorrect");
			}
		}

		String [][] board2 = new String [4][4];
		equations2(board2);
		displayBoard2(board2);
		int [][] ans2 = new int [4][4];
		answers2(ans2);


		System.out.println("Player 2, do any of your equations equal to " + diceTotal);
		String input2 = sc.next();

		if (input2.equalsIgnoreCase("yes"))
		{
			System.out.println("In which column?");
			int col2 = sc.nextInt();
			System.out.println("In which row?");
			int row2 = sc.nextInt();

			if (ans2 [col2][row2] == diceTotal)
			{
				System.out.println("correct");

				board2 [col2][row2] = "bingo";

				if (board2 [0][0] == "bingo" & board2 [0][1] == "bingo" & board2 [0][2] == "bingo" & board2 [0][3] == "bingo" 
						& board2 [1][0] == "bingo" & board2 [1][1] == "bingo" & board2 [1][2] == "bingo" & board2 [1][3] == "bingo" 
						& board2 [2][0] == "bingo" & board2 [2][1] == "bingo" & board2 [2][2] == "bingo" & board2 [2][3] == "bingo" 
						& board2 [3][0] == "bingo" & board2 [3][1] == "bingo" & board2 [3][2] == "bingo" & board2 [3][3] == "bingo")
				{
					System.out.println("Player 2 won");
					//					break;
				}

			}
			else
			{
				System.out.println("incorrect");
			}
		}
		//closes scanner
		sc.close();
	}
	public static void equations1(String [][]board1)
	{
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
	public static void equations2(String [][]board2)
	{
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
	public static void displayBoard1(String [][]board1)
	{
		//prints board for player 1
		for (int row = 0; row <board1.length; row++)
		{
			for (int col = 0; col < board1[row].length; col++)
			{

				System.out.print(board1 [row][col] + " | ");

			}
			System.out.println();
			System.out.println("---------------------------------------");
		}	

	}
	public static void displayBoard2(String [][]board2)
	{
		//prints board for player 2
		for (int row = 0; row <board2.length; row++)
		{
			for (int col = 0; col < board2[row].length; col++)
			{

				System.out.print(board2 [row][col] + " | ");

			}
			System.out.println();
			System.out.println("--------------------------------------");
		}	

	}

	public static int dice()
	{
		//finds a random number for the first dice, a number from 1 to 6
		int dice1 = (int) (Math.random() * 6 + 1);

		//finds a random number for the second dice, a number from 1 to 6
		int dice2 = (int) (Math.random() * 6 + 1);

		//adds the number of dice one and dice 2 to find the total
		int total;
		total = dice1 + dice2;

		System.out.println("The dice rolled the number " + total);

		return total;

	}

	public static void answers1(int [][] ans1)
	{
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

	public static void answers2(int [][] ans2)
	{
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
