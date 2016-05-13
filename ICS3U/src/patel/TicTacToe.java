package patel;
//Jitesh Patel

//May 11, 2016
//This game has 2 ppl play tic tac toe

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		// declaring/initializing variables
		String[][] tttBoard = new String[3][3];
		boolean[][] checker = new boolean[3][3];
		boolean magicX = false;
		boolean magicO = false;
		tttBoard[0][0] = "";
		tttBoard[0][1] = "";
		tttBoard[0][2] = "";
		tttBoard[1][0] = "";
		tttBoard[1][1] = "";
		tttBoard[1][2] = "";
		tttBoard[2][0] = "";
		tttBoard[2][1] = "";
		tttBoard[2][2] = "";
		boolean win = false;
		int row;
		int column;
		boolean playAgain = true;
		String yesNo;

		Scanner scn = new Scanner(System.in);

		while (playAgain) {
			while (!win) {
				// X's turn
				if (!magicO) {
					System.out
							.println("Player one... what are the coordinates you would like to place the X(e.g. 3 1)");

					row = scn.nextInt();
					column = scn.nextInt();
					if (!checker[row - 1][column - 1]) {
						checker[row - 1][column - 1] = true;
						// plant x
						tttBoard[row - 1][column - 1] = "X";

						// display board
						System.out.println(tttBoard[0][0] + "\t" + tttBoard[0][1] + "\t" + tttBoard[0][2]);
						System.out.println(tttBoard[1][0] + "\t" + tttBoard[1][1] + "\t" + tttBoard[1][2]);
						System.out.println(tttBoard[2][0] + "\t" + tttBoard[2][1] + "\t" + tttBoard[2][2]);

						// check for winner
						if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " wins!");
							win = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " wins!");
							win = true;
						} else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0]
								&& !tttBoard[1][0].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " wins!");
							win = true;
						} else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][2] + " wins!");
							win = true;
						} else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " wins!");
							win = true;
						} else {
							win = false;
						}
						// checks for cats game
						if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") && !tttBoard[0][2].equals("")
								&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("")
								&& !tttBoard[1][2].equals("") && !tttBoard[2][0].equals("")
								&& !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) {
							win = true;
							System.out.println("Cat's game!");
						}
						magicX = false;
					} else {
						System.out.println("Those coordinates were already entered, please enter a valid set.");
						magicX = true;
					}
				}

				// O's turn
				if (!win && !magicX) { // checks if x has already won
					System.out
							.println("Player two... what are the coordinates you would like to place the O(e.g. 3 1)");

					row = scn.nextInt();
					column = scn.nextInt();

					if (!checker[row - 1][column - 1]) {
						checker[row - 1][column - 1] = true;
						// plant o
						tttBoard[row - 1][column - 1] = "O";

						// show board
						System.out.println(tttBoard[0][0] + "\t" + tttBoard[0][1] + "\t" + tttBoard[0][2]);
						System.out.println(tttBoard[1][0] + "\t" + tttBoard[1][1] + "\t" + tttBoard[1][2]);
						System.out.println(tttBoard[2][0] + "\t" + tttBoard[2][1] + "\t" + tttBoard[2][2]);

						// check for win
						if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " wins!");
							win = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " wins!");
							win = true;
						} else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0]
								&& !tttBoard[1][0].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " wins!");
							win = true;
						} else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][2] + " wins!");
							win = true;
						} else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " wins!");
							win = true;
						} else {
							win = false;
						}
						// checks for cats game
						if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") && !tttBoard[0][2].equals("")
								&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("")
								&& !tttBoard[1][2].equals("") && !tttBoard[2][0].equals("")
								&& !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) {
							win = true;
							System.out.println("Cat's game!");
						}
						magicO = false;
					} else {
						System.out.println("Those coordinates were already entered, please enter a valid set.");
						magicO = true;
					}
				}
			}
			System.out.println("Would you like to play again?(Y/N)");
			scn.nextLine();
			yesNo=scn.nextLine();
			if (yesNo.equalsIgnoreCase("N"))
			{
				System.out.println(":(");
				playAgain=false;
			}
			else
			{
				playAgain=true;
				tttBoard[0][0] = "";
				tttBoard[0][1] = "";
				tttBoard[0][2] = "";
				tttBoard[1][0] = "";
				tttBoard[1][1] = "";
				tttBoard[1][2] = "";
				tttBoard[2][0] = "";
				tttBoard[2][1] = "";
				tttBoard[2][2] = "";
				
				checker[0][0] = false;
				checker[0][1] = false;
				checker[0][2] = false;
				checker[1][0] = false;
				checker[1][1] = false;
				checker[1][2] = false;
				checker[2][0] = false;
				checker[2][1] = false;
				checker[2][2] = false;
				
				win=false;
				playAgain=true;
				magicX=false;
				magicO=false;
			}
			

		}
	}
}
