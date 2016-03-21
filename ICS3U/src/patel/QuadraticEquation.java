package patel;

import java.text.DecimalFormat;
import java.util.Scanner;
/* QuadraticEquation.Java
 * This program provides the roots of a quadratic formula given the a,b and c values. 
 * Jitesh Patel
 * March 21, 2016
 */
public class QuadraticEquation {

	public static void main(String[] args) {
		
		//declaring variables  
		double a;
		double b;
		double c;
		double xOne;
		double xTwo;
		Scanner input = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");
		
		System.out.println("ax^2+bx+c is the standard form for the quadratic formula. This Program will calculate the x values of any quadratic equation.");
		
		//inputing values
		System.out.println("Please enter a valid a value(it must not be 0)");
		a = Double.parseDouble(input.nextLine());
		System.out.println("Please enter the b value");
		b = Double.parseDouble(input.nextLine());
		System.out.println("Please enter the c value");
		c = Double.parseDouble(input.nextLine());

		//calculations and output
		xOne=(b*b)-(4*a*c);
		xTwo=(b*b)-(4*a*c);
		if (xOne>0)
		{
			xOne=Math.sqrt(xOne);
			xOne=(b*-1)-xOne;
			xOne=xOne/(2*a);
			System.out.println("Root: "+decimal.format(xOne));	
			xTwo=Math.sqrt(xTwo);
			xTwo=(b*-1)+xTwo;
			xTwo=xTwo/(2*a);
			System.out.println("Root: "+decimal.format(xTwo));
		}
		else if (xOne==0)
		{
			xOne=Math.sqrt(xOne);
			xOne=(b*-1)-xOne;
			xOne=xOne/(2*a);
			System.out.println("Root: "+decimal.format(xOne));	
		
		}
		else
		{
			System.out.println("There are no real roots");
		}
		
		

	}

}
