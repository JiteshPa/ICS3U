package patel;

import java.util.Scanner;

/* MotherProgram.Java
 * This program determines a mothers age at birth based on her birth year and her child birth year
 * Jitesh Patel
 * March 8, 2016
 */
public class MotherProgram {
	/**
	 *Main Method
	 **/
	public static void main(String[] args) {
		boolean z=true;
		
		while(z==true)
		{
		Scanner input = new Scanner(System.in);
		String name; //user's name
		int userBirth; //user's birth year
		String motherName; //user's mother's name
		int motherBirth; //mother's birth year
		int motherAge;//mothers age

		System.out.println("What is your name?");
		name = input.nextLine();

		System.out.println("Hello " + name + "! What year were you born in?");
		userBirth = Integer.parseInt(input.nextLine());

		System.out.println(userBirth + ", thats great! Now, what is your mothers name?");
		motherName = input.nextLine();

		System.out.println(motherName + ", that's a great name! What year was she born in?");
		motherBirth = Integer.parseInt(input.nextLine());

		motherAge = userBirth - motherBirth;
		System.out.println(motherBirth + "? That means she was " + motherAge + " years old when you were born!");
		System.out.println("Would you like to go again?(Y/N)");
		String yesNo = input.nextLine();
		if (yesNo.equals("Y")) {
			z = true;
		} else {
			z = false;
		}

		}
	}

}
