package patel;
//Jitesh Patel

//May 11, 2016
//This game has 2 ppl play tic tac toe

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		// declaring/initializing variables
		String[][] tttBoard = new String[3][3];
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

		Scanner scn = new Scanner(System.in);

		while (!win) {
			// X's turn
			System.out.println("Player one... what are the coordinates you would like to place the X(e.g. 3 1)");

			row = scn.nextInt();
			column = scn.nextInt();

			// plant x
			tttBoard[row - 1][column - 1] = "X";

			// display board
			System.out.println(tttBoard[0][0] + "\t" + tttBoard[0][1] + "\t" + tttBoard[0][2]);
			System.out.println(tttBoard[1][0] + "\t" + tttBoard[1][1] + "\t" + tttBoard[1][2]);
			System.out.println(tttBoard[2][0] + "\t" + tttBoard[2][1] + "\t" + tttBoard[2][2]);

			// check for winner
			if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2] && !tttBoard[0][2].equals("")) {
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
					&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("") && !tttBoard[1][2].equals("")
					&& !tttBoard[2][0].equals("") && !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) {
				win = true;
				System.out.println("Cat's game!");
			}

			// O's turn
			if (!win) { // checks if x has already won
				System.out.println("Player two... what are the coordinates you would like to place the O(e.g. 3 1)");

				row = scn.nextInt();
				column = scn.nextInt();

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
						&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("") && !tttBoard[1][2].equals("")
						&& !tttBoard[2][0].equals("") && !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) {
					win = true;
					System.out.println("Cat's game!");
				}
			}
		}

	}
}
