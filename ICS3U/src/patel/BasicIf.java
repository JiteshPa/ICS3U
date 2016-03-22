package patel;

import java.util.Scanner;
/* BasicIf.Java
 * This program asks the user for a number, then checks if the number is positive or negative, and if its divisible by 0
 * Jitesh Patel
 * March 22, 2016
 */
public class BasicIf {

	public static void main(String[] args) {
		
		//declaring variables  
		int enteredNumber;
		Scanner input=new Scanner(System.in);
		
		//user inputs a whole number
		System.out.println("Please input a whole number");
		enteredNumber=Integer.parseInt(input.nextLine());
		
		//first check, if number is positive, negative or 0
		if (enteredNumber>0)
		{
			System.out.println("The nuumber you entered is positive");
		}
		else if (enteredNumber==0)
		{
			System.out.println("The number you entered was 0");
		}
		else
		{
			System.out.println("The number you entered is negative");
		}
		
		//modulating the number
		enteredNumber=enteredNumber%7;
		
		//second check, if number is divisible by 7 and not 0
		if (enteredNumber==0&&enteredNumber!=0)
		{
			System.out.println("The number you entered is divisible by 7");
		}
		else
		{
			System.out.println("The number you entered is not divisible by 7, there is a reminder of "+Math.abs(enteredNumber));
		}
			
		

	}

}
