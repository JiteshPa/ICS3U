package patel;
//Jitesh Patel
//May 11, 2016
//This program asks the user to think of an animal and then attempts to guess it

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		//Initializing variables
		String [] guess=new String []{"lion","tiger","poodle","ostrich","mouse", "elephant", "snake", "lizard", "ant","spider","dog","cat","hampster","bird","fish","horse","goat","turtle","unicorn","dragon"};
		boolean [] guessed =new boolean [20];
		Scanner scn=new Scanner (System.in);
		String yesNo;
		int i=0;
		

		
		
		
		//starting msg
		System.out.println("Hi, lets play a guessing game. Think of an animal.");
		System.out.println("Ready?(Y/N)");
		
		yesNo=scn.nextLine();
		
	
		
		if (yesNo.equalsIgnoreCase("Y"))
		{
			
			do
			{	
				//make random number
				int x=(int)(Math.random()*guess.length);
				
				//if guessed correctly
				if (!guessed[x]){
					guessed[x]=true;
					System.out.println("Is it a "+guess[x]+"? (Y/N)");
					yesNo=scn.nextLine();
					i++;
					if (yesNo.equalsIgnoreCase("Y"))
						System.out.println("I Win!!!!");
				}
				
				//if everything is alredy guessed
				if (i==guess.length)
				{
					System.out.println("I dont have any other guesses... you win :(");
					yesNo="Y";
				}
								
				
			}while (yesNo.equalsIgnoreCase("N"));
			
			
		}
		else
		{
			System.out.println(":(");
		}
	
		
	}

}
