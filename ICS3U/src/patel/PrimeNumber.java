package patel;

import java.util.Scanner;

public class PrimeNumber {
	//global variable
	public static int x;

	/**
	 * This is the main method. It takes in a number from the user.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//scanner
		Scanner scn = new Scanner(System.in);

		//input prompts
		System.out.println("Please enter a number.");
		x = scn.nextInt();
		
		if (isPrime(x))
		{
			System.out.println(x+" is prime.");
		}
		else
		{
			System.out.println(x+" is not prime.");
		}

	}
	
	/**
	 * This method checks if the number inputed is divisible by the counter (i)
	 * @param x-int
	 * @param i-int
	 * @return boolean true means it's divisible, false means it's not divisible
	 */
	public static boolean isDivisible(int x, int i) {
		
		//checks if the number has a remainder 
		if(x%i!=0)
		{
			return (false);
		}
	
		return(true);
	
	}
	/**
	 * This method checks if the number inputed is a prime number
	 * @param x-int
	 * @return boolean true means it's prime, false means it's not prime
	 */
	public static boolean isPrime(int x){
		//checks if the inputed number is 0 or 1 (not prime)
		if(x==0||x==1)
		{
			return(false);
		}
		//checking if the number inputed is prime
		for(int i=2;i<x;i++)
		{
			if(isDivisible(x, i)==true)
			{
				return (false);
			}
		}
		return(true);
	}

}
