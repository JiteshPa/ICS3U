package patel;

import hsa_new.Console;

public class AdventureGame {

	public static void main(String[] args) throws InterruptedException {

		Console log = new Console(50, 150);

		String[][] userInput = new String[2][10];
		int gold;
		boolean sword;
		String riddle;
		int triesTroll = 2;
		boolean death = false;
		boolean playAgain = true;
		String replay;

		while (playAgain == true) {
			log.println(
					"Run run run! You are a thief who has just stolen gold from a castle! You come across two paths. One leads to a desert, one leads to a forest. Which path do you take? (forest/desert)");

			userInput[0][0] = log.readLine();

			if (userInput[0][0].equalsIgnoreCase("forest")) {
				log.println(
						"The gaurds chase you into the forest! You get to a clearing, and see a large tree. Do you hide in the tree or keep running? (hide in tree/keep running");

				userInput[0][1] = log.readLine();

				if (userInput[0][1].equalsIgnoreCase("hide in tree")) {
					log.println(
							"You successfully climb the tree. The guards are confused, they look around trying to find a trail for you. You see some rocks up on the tree. Unsure of how they got there, you pick one up and take aim. You could throw the rock and knock the guards out, but there's only a 1/3 chance of success. Do you take the risk?");
					userInput[0][2] = log.readLine();

					if (userInput[0][2].equalsIgnoreCase("Yes")) {
						int chance = (int) (Math.random() * 3);
						if (chance == 0 || chance == 1) {
							log.println("You miss, the guards spot you and kill you. You are dead.");
							death = true;
						} else {
							log.println(
									"You hit the guards and kill them. You climb down and steal some of their gold, along with a sword as a weapon");
							sword = true;
						}
					}
					log.println(
							"You come across a cross roads. One path leads to a bridge, the other goes to a yellow brick road. Where would you like to go, the bridge or the yellow brick road?");
					userInput[0][3] = log.readLine();
					if (userInput[0][3].equalsIgnoreCase("the bridge") && death == false) {
						log.println(
								"As you are beggening to cross, a troll blocks your path!You tell the troll that you wish to pass, and he says he'll let you if you can get his riddle right in three guess's. The riddle is: What gets wetter as it drys?");
						for (int i = 2; i == 0; i--) {
							riddle = log.readLine();
							if (riddle.equalsIgnoreCase("towel") && i == 3) {
								log.println("The troll says 'that is correct, you may procced!'");
								i = 0;

							} else if (riddle.equalsIgnoreCase("towel") && (i == 1 || i == 2)) {
								log.println(
										"The trool says 'correct, but you didnt get it on the first try! I know I said I'd give you 3 tries, but i lied.' The troll eats you, you are dead.");
							} else if (!riddle.equals("towel")) {
								log.println("The troll says 'wrong, try again.' You have " + i + " guesses left");
								triesTroll--;
							}

						}
						if (triesTroll == 0) {
							log.println(
									"The troll says 'Sorry, you're out of tries. I'm gonna eat you now.' You turn around and try to run, but see 3 guards approching. The troll notices them, looks at you and says 'dont move.' The troll lunges himself at the guards, but before you get a chance to run, the troll kills a gaurd and throws him at you. The two other gaurds kill the troll, and start approching you.");
							if (sword = true) {
								log.println(
										"You pull out the sword you found earlier, and charge at the guards. Useing your agility, you manage to kill both of them. You steal their gold and cross the bridge, seeing your house in the distance.");
							} else {
								log.println("With nothing to defend yourself, the guards kill you. You are dead.");
							}
						}
					} else if (userInput[0][3].equalsIgnoreCase("yellow brick road") && death == false) {
						log.println(
								"You come across a girl, a tin man, a scarecrow and a lion who all look familier. Before you can remmber from where, they all attack you. You are dead.");
						death = true;
					}
				} else if (userInput[0][1].equalsIgnoreCase("keep running")) {
					log.println("The guards catch up to you! They kill you. You are dead.");
				} else {
					log.println("Please enter a valid option.");

				}
			}
			else if (userInput[0][0].equalsIgnoreCase("desert"))
			{
				log.println("You come to a camel. Do you want to take it?");
				userInput[1][0]=log.readLine();
				if (userInput[1][0].equalsIgnoreCase("Yes"))
				{
					
				}
				else
				{
					log.println("You keep walking, and begen to feel tired. You start to feel thursty. You die of dehydration.");
					death=true;
				}
			}
			if (death = true) {
				log.println("Unfortunatly, you died.");
			} else {
				log.println("Congragulations! You win!");
			}
			log.println("Here are your choices:");
			for (int i=0;i<10;i++)
			{
				log.println("userInput"+userInput[0][1]);

				
			}
			
			log.println("Would you like to play again?");
			replay=log.readLine();
			if (replay.equalsIgnoreCase("No"))
			{
				playAgain=false;
			}
			
		}

	}

}
