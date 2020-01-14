package begum.finalproject;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {

		//scanner
		Scanner sc = new Scanner(System.in);

		//finds a random number for the first dice, a number from 1 to 6
		int dice1 = (int) (Math.random() * 6 + 1);

		//finds a random number for the second dice, a number from 1 to 6
		int dice2 = (int) (Math.random() * 6 + 1);

		//adds the number of dice one and dice 2 to find the total
		int total;
		total = dice1 + dice2;

		System.out.println("The dice rolled the number " + total);

		String [][] equa1 = new String [4][4];
		String equas1 = equations1(equa1);

		String [][] equa2 = new String [4][4];
		String equas2 = equations2(equa2);

		int [][] ans1 = new int [4][4];
		int answs1 = answers1(ans1);

		int [][] ans2 = new int [4][4];
		int answs2 = answers2(ans2);

		board1();

		System.out.println("Player 1, do any of your equations equal to " + total);
		String input = sc.next();

		If (input.equalsIgnoreCase("yes"))
		{
			System.out.println("In which column?");
			int col1 = sc.nextInt();
			System.out.println("In which row?");
			int row1 = sc.nextInt();

			If (answs1 [col1][row1] = total);
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

		board2();
		
		System.out.println("Player 2, do any of your equations equal to " + total);
		String input2 = sc.next();

		If (input.equalsIgnoreCase("yes"))
		{
			System.out.println("In which column?");
			int col2 = sc.nextInt();
			System.out.println("In which row?");
			int row2 = sc.nextInt();

			If (answs2 [col2][row2] = total);
			{
				System.out.println(correct);

				equas2 [col2][row2] = ‘bingo’;

				If (equas2 [0][0] == ‘bingo’ & equas2 [0][1] == ‘bingo’ & equas2 [0][2] == ‘bingo’ & equas2 [0][3] == ‘bingo’ 
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
		public static void board1(int [][]board1)
		{
			//prints board for player 1
			for (int row = 0; row <equa1.length; row++)
			{
				for (int col = 0; col < equa1[row].length; col++)
				{

					System.out.print(equa1 [row][col] + " | ");

				}
				System.out.println();
				System.out.println("-----------");
			}	

		}
		public static void board2(int [][]board2)
		{
			//prints board for player 2
		for (int row = 0; row <equa2.length; row++)
		{
			for (int col = 0; col < equa2[row].length; col++)
			{

				System.out.print(equa2 [row][col] + " | ");

			}
			System.out.println();
			System.out.println("-----------");
		}	

		
		}
	}		
