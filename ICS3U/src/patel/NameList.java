package patel;
/*Jitesh Patel
 * April 26, 2016
 * This program takes in a list of names, then prints them out forwards and backwards
 */

import java.util.Scanner;

public class NameList {

	public static void main(String[] args) {
		
		//declaring variables 
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of names");
		int x=Integer.parseInt(scn.nextLine());
		
		String [] names=new String [x];
		
		
		System.out.println("Please enter all of the names.");
		//user enters name
		for (int i=0;i<x;i++)
		{
			names[i]=scn.nextLine();
		}
		//outputs names in order
		for (int i=0;i<x;i++)
		{
			System.out.println(names[i]);
		}
		//outputs names in reverse
		for (int i=x-1;i>=0;i--)
		{
			System.out.println(names[i]);
		}
		
		
		

	}

}
