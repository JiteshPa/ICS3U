package patel;

/*MarkProgram.Java
 * This program asks the user to input all marks that need grading. It then grades the marks and outputs the letter grade associated with that mark.
 * Jitesh Patel
 * March 30, 2016
 */
import java.util.Scanner;

public class MarkProgram {

	public static void main(String[] args) {
		
		//declaring variables
		Scanner input = new Scanner(System.in);
		int t;
		
		// Getting the number of marks
		System.out.println("Hello! Please enter the number of marks you will be inputing today.");
		t=input.nextInt();
		
		//array
		int [] inputedMarks=new int [t];
		
		//user inputs marks
		System.out.println("Please enter the marks.");
		for (int i=0;i<t;i++)
		{
			inputedMarks[i]=input.nextInt();
		}
		
		//outputing grades
		System.out.println("The letter grades are:");
		for (int i=0;i<t;i++)
		{
			if (100>=inputedMarks[i]&&inputedMarks[i]>=80)
			{
				System.out.println("A");
			}
			else if (79>=inputedMarks[i]&&inputedMarks[i]>=70)
			{
				System.out.println("B");
			}
			else if (69>=inputedMarks[i]&&inputedMarks[i]>=60)
			{
				System.out.println("C");
			}
				
			else if (59>=inputedMarks[i]&&inputedMarks[i]>=50)
			{
				System.out.println("D");
			}
				
			else if (49>=inputedMarks[i]&&inputedMarks[i]>=0)
			{
				System.out.println("F");
			}
				
			else
			{
				System.out.println("X");
			}
				
				
		}

	}

}
