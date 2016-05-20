package patel;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * This program takes in two numbers and does the 4 basic operations with them
 * @author Jitesh Patel
 *@version 20/05/2016
 */

public class FunWithMath {
public static DecimalFormat df=new DecimalFormat("0.0");
	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		System.out.println("Would you like to use numbers that have decimals, or whole numbers?(D/W)");
		String ans=scn.nextLine();
		if (ans.equalsIgnoreCase("w"))
		{
			System.out.println("Please enter two numbers.(a and b)");
			int num1=scn.nextInt();
			int num2=scn.nextInt();
			multiply(num1,num2);
			add(num1,num2);
			divide(num1,num2);
			subtract(num1,num2);
		}
		else
		{
			System.out.println("Please enter two numbers.(a and b)");
			double num1=scn.nextInt();
			double num2=scn.nextInt();
			multiply2(num1,num2);
			add2(num1,num2);
			divide2(num1,num2);
			subtract2(num1,num2);
		}
	}
	/**
	 * This method multiplies the two numbers
	 * @param num1 int
	 * @param num2 int
	 */
	public static void multiply (int num1, int num2)
	{
		System.out.println("a*b="+(df.format(num1*num2)));
	}
	/**
	 * This method adds the two numbers
	 * @param num1 int
	 * @param num2 int
	 */
	public static void add (int num1, int num2)
	{
		System.out.println("a+b="+(df.format(num1+num2)));
	}
	/**
	 * This method divides the first number by the second number
	 * @param num1 int
	 * @param num2 int
	 */
	public static void divide (int num1, int num2)
	{
		System.out.println("a/b="+(df.format((double)num1/(double)num2)));
	}
	/**
	 * This method subtracts the first number from the second number
	 * @param num1 int
	 * @param num2 int
	 */
	public static void subtract (int num1, int num2)
	{
		System.out.println("a-b="+(df.format(num1-num2)));
	}
	/**
	 * This method multiplies the two numbers
	 * @param num1 double
	 * @param num2 double
	 */
	
	public static void multiply2 (double num1, double num2)
	{
		System.out.println("a*b="+(df.format(num1*num2)));
	}
	/**
	 * This method adds the two numbers
	 * @param num1 double
	 * @param num2 double
	 */
	public static void add2 (double num1, double num2)
	{
		System.out.println("a+b="+(df.format(num1+num2)));
	}
	/**
	 * This method divides the first number by the second number
	 * @param num1 double
	 * @param num2 double
	 */
	public static void divide2 (double num1, double num2)
	{
		System.out.println("a/b="+(df.format((double)num1/(double)num2)));
	}
	/**
	 * This method subtracts the first number from the second number
	 * @param num1 double
	 * @param num2 double
	 */
	public static void subtract2 (double num1, double num2)
	{
		System.out.println("a-b="+(df.format(num1-num2)));
	}

}
