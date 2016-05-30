package patel;

import java.util.Scanner;

public class PrimeNumber {
	public static int x;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter a number.");
		x = scn.nextInt();
		if (x == 1) {
			System.out.println("The number is not prime");
		} else {
			System.out.println(isDivisable(x));
		}

	}

	public static String isDivisable(int x) {
		boolean checker = false;
		for (int i = 2; i != x; i++) {
			if (x % i == 0) {
				checker = true;
			}
		}
		if (checker) {
			return "The number is not prime";
		} else {
			return "The number is prime";
		}
	}

}
