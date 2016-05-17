package patel;

//Jitesh Patel
//May 17, 2016
//This program prints out the word "MISSISSIPPI" vertically in big capital letters that are made of capital letters
public class MississippiProgram {

	//prints out letters
	public static void main(String[] args) {
		drawM();
		drawI();
		drawS();
		drawS();
		drawI();
		drawS();
		drawS();
		drawI();
		drawP();
		drawP();
		drawI();
	}
	//makes an "M" out of "M"s
	public static void drawM()
	{
		System.out.println("M     M");
		System.out.println("MM   MM");
		System.out.println("M  M  M");
		System.out.println("M     M");
		System.out.println("M     M");
		System.out.println("");
	}
	//makes an "I" out of "I"s
	public static void drawI()
	{
		System.out.println("IIIIIII");
		System.out.println("   I   ");
		System.out.println("   I   ");
		System.out.println("   I   ");
		System.out.println("IIIIIII");
		System.out.println("");
	}
	//makes an "S" out of "S"s
	public static void drawS()
	{
		System.out.println("SSSSSSS");
		System.out.println("S      ");
		System.out.println("   S   ");
		System.out.println("      S");
		System.out.println("SSSSSSS");
		System.out.println("");
	}
	//makes an "P" out of "P"s
	public static void drawP()
	{
		System.out.println("PPPPPPP");
		System.out.println("P     P");
		System.out.println("PPPPPPP");
		System.out.println("P      ");
		System.out.println("P      ");
		System.out.println("");
	}

}
