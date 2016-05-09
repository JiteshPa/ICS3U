package patel;

import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {
		String guessWord;
		char guessLetter;
		String [] secretWordList={"lion","tiger","poodle","ostrich","mouse"};
		int x=(int)(Math.random()*secretWordList.length);
		Scanner scn=new Scanner (System.in);
		int numberGuess;
		
	    String dashes="";
	    for (int i=0;i<secretWordList[x].length();i++)
	    {
	    	dashes=dashes+"-";
	    }
	    System.out.println(dashes);
	    
	    do
	    {
	    	System.out.println("Please enter a letter(enter ! if you want to guess the word)");
	    	guessWord=scn.nextLine();
	    	
	    	if (guessWord=="!")
	    	{
	    		
	    	}
	    	else
	    	{
	    		num=secretWordList[x].indexof
	    	}
	    	
	    	
	    }while()
	    
	    
	}

}
