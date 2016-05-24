package patel;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * This program takes in two numbers and does the 4 basic operations with them
 * @author Jitesh Patel
 *@version 20/05/2016
 */

public class FunWithMath2 {
public static DecimalFormat df=new DecimalFormat("0.0");
	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
			System.out.println("Please enter two numbers.(a and b)");
			double num1=scn.nextInt();
			double num2=scn.nextInt();

			
			System.out.println("a*b="+(df.format(multiply(num1,num2))));
			System.out.println("a/b="+(df.format(divide(num1,num2))));
			System.out.println("a-b="+(df.format(subtract(num1,num2))));
			System.out.println("a+b="+(df.format(add(num1,num2))));

		
	}
	/**
	 * This method multiplies the first number by the second number
	 * @param num1 double
	 * @param num2 double
	 * @return The string to print
	 */
	public static double multiply (double num1, double num2)
	{
		double total=num1*num2;
		return total;
	}
	/**
	 * This method adds the two numbers
	 * @param num1 double
	 * @param num2 double
	 * @return The string to print
	 */
	public static double add (double num1, double num2)
	{
		double total=num1+num2;
		return total;
	}
	/**
	 * This method divides the first number by the second number
	 * @param num1 double
	 * @param num2 double
	 * @return The string to print
	 */
	public static double divide (double num1, double num2)
	{
		double total=num1/num2;
		return total;
	}
	/**
	 * This method subtracts the first number from the second number
	 * @param num1 double
	 * @param num2 double
	 *  @return The string to print
	 */
	public static double subtract (double num1, double num2)
	{
		double total=num1-num2;
		return total;
	}

}
