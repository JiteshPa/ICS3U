package patel;
import java.util.Scanner;
/* NameProgram.Java
 * This program asks the user for their name, 70% of the time it loves the name, 30% of the time it hates the name.
 * Jitesh Patel
 * March 23, 2016
 */
public class NameProgram {

	public static void main(String[] args) {
		
		//declaring variables  
		String userName;
		Scanner input=new Scanner(System.in);
		int x=(int)(Math.random()*10);
		
		//user input
		System.out.println("What is your name?");
		userName=input.nextLine();
		
		//deciding if the name is bad or good
		if (x<=2)
		{
			System.out.println(userName+".... I HATE THAT NAME!");
		}
		else
		{
			System.out.println(userName+", thats my favourite name!");
		}
	
		

	}

}
