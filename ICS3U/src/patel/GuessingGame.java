package patel;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		String [] guess=new String []{"lion","tiger","poodle","ostrich","mouse", "elephant", "snake", "lizard", "ant","spider","dog","cat","hampster","bird","fish","horse","goat","turtle","unicorn","dragon"};
		boolean [] guessed =new boolean [20];
		Scanner scn=new Scanner (System.in);
		String yesNo;
		int i=0;
		

		
		
		
		
		System.out.println("Hi, lets play a guessing game. Think of an animal.");
		System.out.println("Ready?(Y/N)");
		
		yesNo=scn.nextLine();
		
	
		
		if (yesNo.equalsIgnoreCase("Y"))
		{
			
			do
			{	
				
				int x=(int)(Math.random()*guess.length);
				
				if (!guessed[x]){
					guessed[x]=true;
					System.out.println("Is it a "+guess[x]+"? (Y/N)");
					yesNo=scn.nextLine();
					i++;
					if (yesNo.equals("Y"))
						System.out.println("I Win!!!!");
				}
				
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
