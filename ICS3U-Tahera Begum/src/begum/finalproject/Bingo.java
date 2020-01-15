package begum.finalproject;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {

		//scanner
		Scanner sc = new Scanner(System.in);

		String [][] board1 = new String [4][4];
		equations1(board1);
		displayBoard1(board1);
		

		String [][] board2 = new String [4][4];
		equations2(board2);
		displayBoard2(board2);

		int [][] ans1 = new int [4][4];
		answers1(ans1);

		int [][] ans2 = new int [4][4];
		answers2(ans2);

		int total = dice();

	
		System.out.println("Player 1, do any of your equations equal to " + total);
		String input = sc.next();

		if (input.equalsIgnoreCase("yes"))
		{
			System.out.println("In which column?");
			int col1 = sc.nextInt();
			System.out.println("In which row?");
			int row1 = sc.nextInt();

			if (ans1 [col1][row1] = total);
			{
				System.out.println(correct);

				equas1 [col1][row1] = ‘bingo’;

				If (equas1 [0][0] == ‘bingo’ & equas1 [0][1] == ‘bingo’ & equas1 [0][2] == ‘bingo’ & equas1 [0][3] == ‘bingo’ 
						& equas1 [1][0] == ‘bingo’ & equas1 [1][1] == ‘bingo’ & equas1 [1][2] == ‘bingo’ & equas1 [1][3] == ‘bingo’ 
						& equas1 [2][0] == ‘bingo’ & equas1 [2][1] == ‘bingo’ & equas1 [2][2] == ‘bingo’ & equas1 [2][3] == ‘bingo’ 
						& equas1 [3][0] == ‘bingo’ & equas1 [3][1] == ‘bingo’ & equas1 [3][2] == ‘bingo’ & equas1 [3][3] == ‘bingo’ )
				{
					System.out.println("Player 1 won");
					break;
				}

			}
			else
			{
				System.out.println("incorrect");
			}
		}


		System.out.println("Player 2, do any of your equations equal to " + total);
		String input2 = sc.next();

		if (input.equalsIgnoreCase("yes"))
		{
			System.out.println("In which column?");
			int col2 = sc.nextInt();
			System.out.println("In which row?");
			int row2 = sc.nextInt();

			if (ans2 [col2][row2] = total);
			{
				System.out.println(correct);

				equas2 [col2][row2] = ‘bingo’;

				if (equas2 [0][0] == ‘bingo’ & equas2 [0][1] == ‘bingo’ & equas2 [0][2] == ‘bingo’ & equas2 [0][3] == ‘bingo’ 
						& equas2 [1][0] == ‘bingo’ & equas2 [1][1] == ‘bingo’ & equas2 [1][2] == ‘bingo’ & equas2 [1][3] == ‘bingo’ 
						& equas2 [2][0] == ‘bingo’ & equas2 [2][1] == ‘bingo’ & equas2 [2][2] == ‘bingo’ & equas2 [2][3] == ‘bingo’ 
						& equas2 [3][0] == ‘bingo’ & equas2 [3][1] == ‘bingo’ & equas2 [3][2] == ‘bingo’ & equas2 [3][3] == ‘bingo’)
				{
					System.out.println("Player 2 won");
					break;
				}

			}
			else
			{
				System.out.println("incorrect");
			}
		}
		public static void equations1(String [][]board1)
		{
			board1[0][0] = '22/11';
			board1[0][1] = '16/8';
			board1[0][2] = '5+6';
			board1[0][3] = '14-6';
			board1[1][0] = '12-3';
			board1[1][1] = '15-12';
			board1[1][2] = '3+4';
			board1[1][3] = '56/7';
			board1[2][0] = '984/123';
			board1[2][1] = '';
			board1[2][2] = '';
			board1[2][3] = '';
			board1[3][0] = '';
			board1[3][1] = '';
			board1[3][2] = '';
			board1[3][3] = '';
		}
		public static void equations2(String [][]board1)
		{
			
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
				System.out.println("--------------------------");
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
				System.out.println("--------------------------");
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
