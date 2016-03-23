package patel;
/*DiceProgram.Java
 * This program rolls two dice for the user and then two for the computer and determines which roll was higher
 * Jitesh Patel
 * March 23, 2016
 */
public class DiceProgram {

	public static void main(String[] args) {
		
		//declaring variables  
		int dieOne=(int)(Math.random()*6)+1;
		int dieTwo=(int)(Math.random()*6)+1;
		int x;
		int y;
		
		//determining user values
		x=dieOne+dieTwo;
		System.out.println("You rolled: "+x);
		
		//re-rolling
		dieOne=(int)(Math.random()*6)+1;
		dieTwo=(int)(Math.random()*6)+1;
		
		//determining my values 
		y=dieOne+dieTwo;
		System.out.println("I rolled "+y);
		
		//deciding the victor 
		if (x>y)
		{
			System.out.println("You win!");
		}
		else if (x==y)
		{
			System.out.println("It's a tie!");
		}
		else
		{
			System.out.println("I win!");
		}
	}

}
