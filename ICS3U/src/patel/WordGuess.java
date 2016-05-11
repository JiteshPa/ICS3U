package patel;

import java.util.Scanner;
//Jitesh Patel
//May 11, 2016


public class WordGuess {
	

	public static void main(String[] args) {
		String guessWord;
		String [] secretWordList={"lion","tiger","dog","ostrich","mouse"};
		int x=(int)(Math.random()*secretWordList.length);
		Scanner scn=new Scanner (System.in);
	    String dashes="";
	    
	    System.out.println("Guess the word!");
	    
	    for (int i=0;i<secretWordList[x].length();i++)
	    {
	    	dashes=dashes+"-";
	    }
	    System.out.println(dashes);
	    
	    do
	    {
	    	int counter=0;
	    	System.out.println("Please enter a letter(enter ! if you want to guess the word)");
	    	guessWord=scn.nextLine();
	    	
	    	if (guessWord.equalsIgnoreCase("!"))
	    	{
	    		System.out.println("What do you think the word is?");
	    		guessWord=scn.nextLine();
	    		if (guessWord.equalsIgnoreCase(secretWordList[x]))
	    		{
	    			System.out.println("Congrats, you're right!");
	    		}
	    		else
	    		{
	    			System.out.println("Sorry that's wrong.");
	    			System.out.println(dashes);
	    		}
	    		
	    	}
	    	else
	    	{
	    		int num = secretWordList[x].indexOf(guessWord);
	    		
	    		if (num==-1)
	    		{
	    			System.out.println("Sorry, that letter isn't in the word. Please pick another letter");
	    			System.out.println(dashes);
	    		}
	    		else 
	    		{
	    			dashes=dashes.substring(0, num)+guessWord+dashes.substring(num+1,secretWordList[x].length());
	    			System.out.println(dashes);
	    			for(int i=0;i<dashes.length();i++)
		    		{
		    			if (dashes.charAt(i)!='-')
		    			{
		    				counter++;
		    			}
		    			if (counter==secretWordList[x].length())
		    			{
		    				System.out.println("Congrats, you guessed all the letters");
		    				guessWord=secretWordList[x];
		    			}
		    		}
	    		}
	    		
	    		
	    	}
	    	
	    	
	    }while(!guessWord.equalsIgnoreCase(secretWordList[x]));
	    
	    
	}

}
