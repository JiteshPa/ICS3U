package patel;

import hsa_new.Console;

public class AdventureGame {

	public static void main(String[] args) throws InterruptedException {

		Console log = new Console(50, 150);

		String[][] userInput = new String[2][10];
		int gold;
		boolean sword;

		log.println("Run run run! You are a theif who has just stolen gold from a castle! You come across two paths. One leads to a desert, one leads to a forest. Which path do you take?");

		userInput[0][0] = log.readLine();

		if (userInput[0][0].equalsIgnoreCase("forest"))
		{
			log.println("The gaurds chase you into the forest! You get to a clearing, and see a large tree. Do you hide in the tree or keep running?");
			
			userInput[0][1] = log.readLine();

			if (userInput[0][1].equalsIgnoreCase("hide in trees"))
			{
				log.println("You successfully climb the tree. The guards are confused, they look around trying to find a trail for you. You see some rocks up on the tree. Unsure of how they got there, you pick one up and take aim. You could throw the rock and knock the guards out, but there's only a 1/3 chance of success. Do you take the risk?");
				userInput[0][2]=log.readLine();
				
				if (userInput[0][2].equalsIgnoreCase("Yes"))
				{
					int chance= (int) (Math.random() * 3);
					if (chance==0||chance==1)
					{
						log.println("You miss, the guards spot you and kill you. You are dead.");
					}
					else
					{
						log.println("You hit the guards and kill them. You climb down and steal some of their gold, along with a sword as a wepon");
						sword=true;
					}
				}
				log.println("You come across a cross roads. One path leads to a bridge, the other goes to a yellow brick road. Where would you like to go, the bridge or the yellow brick road?");
				userInput[0][3]=log.readLine();
				if (userInput[0][3].equalsIgnoreCase("the bridge"))
				{
					log.println("As you are beggening to cross, a troll blocks your path!You tell the troll that you wish to pass, and he says he'll let you if you can get his riddle right in three guess's. The riddle is: What gets wetter as it drys?");
				}
            }
			else if (userInput[0][1].equalsIgnoreCase("keep running")) 
			{
				log.println("The guards catch up to you! They kill you. You are dead.");
			} 
			else 
			{
				System.out.println("Please enter a valid option.");

			}
		}

	}

}
