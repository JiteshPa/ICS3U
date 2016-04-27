package patel;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		String [] guess=new String []{"lion","tiger","poodle","ostrich","poodle", "elephant", "snake", "lizard", "ant","spider","dog","cat","hampster","bird","fish","horse","goat","turtle","unicorn","dragon"};
		Scanner scn=new Scanner (System.in);
		String yesNo;
		
		System.out.println("Hi, lets play a guessing game. Think of an animal.");
		System.out.println("Ready?(Y/N)");
		
		yesNo=scn.nextLine();
		
	
		
		if (yesNo.equals("Y"))
		{
			for(int i=20;i!=0;i--)
			{
				int x=(int)(Math.random()*i);
			}
		}
		
	}

}
