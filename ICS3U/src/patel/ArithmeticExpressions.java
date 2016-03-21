package patel;

import java.util.Scanner;
/* ArithmeticExpressions.Java
 * This program asks the user to input five numbers and then does various operations useing those numbers
 * Jitesh Patel
 * March 10, 2016
 */

public class ArithmeticExpressions {

	public static void main(String[] args) {
		// declaring the five numbers
		int numOne;
		int numTwo;
		int numThree;
		int numFour;
		int numFive;
		//declaring the answers to the operations 
		int sum;
		int sub;
		int pro;
		double quotient;
		int rem;
		int pow;
		double squareRoot;

		Scanner input = new Scanner(System.in);
		
		
		//Taking in the 5 numbers
		System.out.println("Hello there! Please enter a number.");
		numOne = Integer.parseInt(input.nextLine());

		System.out.println("Please enter a second number.");
		numTwo = Integer.parseInt(input.nextLine());

		System.out.println("Please enter a third number.");
		numThree = Integer.parseInt(input.nextLine());

		System.out.println("Please enter a forth number.");
		numFour = Integer.parseInt(input.nextLine());

		System.out.println("Please enter a fifth number.");
		numFive = Integer.parseInt(input.nextLine());
		
		//Calculations 
		sum = numOne + numTwo + numThree + numFour + numFive;
		sub = numThree - numTwo;
		pro = numOne * numFive;
		quotient = (double)(numFour / numTwo);
		rem = numFour % numTwo;
		pow = (int) Math.pow(numOne, numThree);
		squareRoot = Math.sqrt(numFive);
		
		//outputing answers 
		System.out.println("The sum of these numbers is " + sum);
		System.out.println("The second number subtracted from the third number is  " + sub);
		System.out.println("The product of the first and fifth numbers is " + pro);
		System.out.println("The forth number divided by the second is " + quotient);
		System.out.println("The remainder when the fourth number is divided by the second number is  " + rem);
		System.out.println("The first number to the power of the third number is " + pow);
		System.out.println("The square root of the fifth number is " + squareRoot);

	}

}
