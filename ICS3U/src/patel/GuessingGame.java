package patel;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		String [] guess=new String []{"lion","tiger","poodle","ostrich","poodle", "elephant", "snake", "lizard", "ant","spider","dog","cat","hampster","bird","fish","horse","goat","turtle","unicorn","dragon"};
		boolean [] guessed =new boolean [20];
		Scanner scn=new Scanner (System.in);
		String yesNo;
		

		
		
		
		
		System.out.println("Hi, lets play a guessing game. Think of an animal.");
		System.out.println("Ready?(Y/N)");
		
		yesNo=scn.nextLine();
		
	
		
		if (yesNo.equals("Y"))
		{
			
			do
			{	
				//loop
				int x=(int)(Math.random()*20);
				if (!guessed[x]){
					
					guessed[x]=true;
					System.out.println("Is it a "+guess[x]+"? (Y/N)");
					yesNo=scn.nextLine();
				}
				
				
				
			}while (yesNo.equals("N"));
			
				System.out.println("I Win!!!!");
		}
	
		
	}

}