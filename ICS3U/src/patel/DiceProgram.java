package patel;

/*DiceProgram.Java
 * This program rolls two dice for the user and then two for the computer and determines which roll was higher
 * Jitesh Patel
 * March 23, 2016
 */
import java.util.Scanner;

public class DiceProgram {

	public static void main(String[] args) {
		boolean z = true;

		while (z == true) {
			// declaring variables
			int dieOne = (int) (Math.random() * 6) + 1;
			int dieTwo = (int) (Math.random() * 6) + 1;
			int x;
			int y;
			String yesNo;

			Scanner input = new Scanner(System.in);

			// determining user values
			x = dieOne + dieTwo;
			System.out.println("You rolled: " + x);

			// re-rolling
			dieOne = (int) (Math.random() * 6) + 1;
			dieTwo = (int) (Math.random() * 6) + 1;

			// determining my values
			y = dieOne + dieTwo;
			System.out.println("I rolled " + y);

			// determining the victor
			if (x > y) {
				System.out.println("You win! Would you like to roll again?(Y/N)");
			} else if (x == y) {
				System.out.println("It's a tie! Would you like to roll again?(Y/N)");
			} else {
				System.out.println("I win! Would you like to roll again?(Y/N)");
			}
			yesNo = input.nextLine();
			if (yesNo.equals("Y")) {
				z = true;
			} else {
				z = false;
			}

		}

	}

}
