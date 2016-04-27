package patel;
/*Jitesh Patel
 * April 26, 2016
 * This program sings the song "If you're happy and you know it" with 10 phrases
 */

public class HappySong {

	public static void main(String[] args) {
		String [] verse=new String [] {"clap your hands","stomp your feet","jump up and down", "sing a song","fist pump","shift left", "shift right","shakle your left leg", "shake your right leg", "smile"};
		for (int i=0;i!=10;i++)
		{
			System.out.println("If you're happy and you know it "+verse[i]);
			System.out.println("If you're happy and you know it "+verse[i]);
			System.out.println("If you're happy and you know it and you really want to show it");
			System.out.println("If you're happy and you know it "+verse[i]);
			System.out.println("");
		}
	}

}
