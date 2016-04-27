package patel;
/*Jitesh Patel
 * April 26, 2016
 * This program rolls 2 dice 10000 times and output the number of times each number is rolled
 */

public class DiceArray {

	public static void main(String[] args) {
		int dieOne;
		int dieTwo;
		int x;

		String[] roll = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		int[] total = new int[11];

		for (int i = 0; i != 10000; i++) {
			dieOne = (int) (Math.random() * 6) + 1;
			dieTwo = (int) (Math.random() * 6) + 1;
			x = dieOne + dieTwo;

			if (x == 2) {
				total[0]++;
			}
			if (x == 3) {
				total[1]++;
			}
			if (x == 4) {
				total[2]++;
			}
			if (x == 5) {
				total[3]++;
			}
			if (x == 6) {
				total[4]++;
			}
			if (x == 7) {
				total[5]++;
			}
			if (x == 8) {
				total[6]++;
			}
			if (x == 9) {
				total[7]++;
			}
			if (x == 10) {
				total[8]++;
			}
			if (x == 11) {
				total[9]++;
			}
			if (x == 12) {
				total[10]++;
			}
		}
		System.out.println("Total      Number of Rolls");
		for (int i = 0; i != 11; i++) {
			System.out.println(roll[i] + "          " + total[i]);
		}

	}

}
