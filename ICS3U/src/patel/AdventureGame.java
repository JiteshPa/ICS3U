package patel;

//while(!Toolkit.getDefaultToolkit().prepareTmage(img1,img1.getWidth(null),img1.getHeight(null),null)));
//where img1 is the variable name of the image you want to load
import hsa_new.Console;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AdventureGame {

	public static void main(String[] args) throws InterruptedException {

		Console log = new Console(50, 150);

		String[][] userInput = new String[2][10];
		int gold = 25;
		boolean sword;
		String riddle;
		int triesTroll = 2;
		boolean death = false;
		boolean playAgain = true;
		String replay;
		String userGuess;
		int triesMummy = 3;
		

		try {
			
			// *****************************
			// THESE LINES CREATE THE CLIP TO PLAY THE MUSIC. 
			// Cut and paste them into your program, and change "theme.wav"
			// to the sound you want to play. 
			Clip theme = AudioSystem.getClip(); //create the clip object
			theme.open(AudioSystem.getAudioInputStream(new File("Stephen_Walking_It_Came_From_Planet_Earth_livelagu.wav"))); //open the given file for the clip


			System.out.println("OK, here comes some music!");
			

			// ************************
			// Include this line when you want the sound to start playing.
			theme.start();
			// Instead of using start you could alternatively use the loop function.
			// The following line will loop your music until stop is called.
			// theme.loop(Clip.LOOP_CONTINUOUSLY);
			// ************************

			// THE PROGRAM CONTINUES WHILE THE MUSIC PLAYS
			Thread.sleep(5000);
			System.out.println("Hope you like it!");
			Thread.sleep(500);
			
			
			// ************************
			// Include this line when you want the sound to stop playing.
			theme.stop();
			// ************************

			Thread.sleep(1000);
			System.out.println("Goodbye");  

		} catch (Exception e) {
			e.printStackTrace();
		}

		while (playAgain == true) {
			//castle 
			log.println("Run run run! You are a thief who has just stolen gold from a castle!");
			log.println("You come across two paths. One leads to a desert, one leads to a forest.");
			log.println("Which path do you take? (forest/desert)");
			// outside of forest and desert p
			userInput[0][0] = log.readLine();
			log.clear();

			if (userInput[0][0].equalsIgnoreCase("forest")) {
				//tree 
				log.println(
						"The gaurds chase you into the forest!");
				log.println("You get to a clearing, and see a large tree.");
				log.println(" Do you hide in the tree or keep running? (hide in tree/keep running");
				userInput[0][1] = log.readLine();
				log.clear();
				if (userInput[0][1].equalsIgnoreCase("hide in tree")) {
					//guards 
					log.println(
							"You successfully climb the tree.");
					log.println("The guards are confused, they look around trying to find a trail for you.");
					log.println("You see some rocks up on the tree.");
					log.println("Unsure of how they got there, you pick one up and take aim.");
					log.println("You could throw the rock and knock the guards out, but there's only a 1/3 chance of success.");
					log.println("Do you take the risk?");
					
					userInput[0][2] = log.readLine();
					log.clear();
					if (userInput[0][2].equalsIgnoreCase("Yes")) {
						int chance = (int) (Math.random() * 3);
						if (chance == 0 || chance == 1) {
							//body
							log.println("You miss, the guards spot you and kill you. You are dead.");
							death = true;

						} else {
							//dead guards
							log.println(
									"You hit the guards and kill them. You climb down and steal some of their gold, along with a sword as a weapon");
							sword = true;

						}
					}
					//bridge and yellow brick road
					log.println(
							"You come across a cross roads. One path leads to a bridge, the other goes to a yellow brick road. Where would you like to go?(bridge/yellow brick road)");
					userInput[0][3] = log.readLine();
					log.clear();
					if (userInput[0][3].equalsIgnoreCase("the bridge") && death == false) {
						//bridge with troll
						log.println(
								"As you are beggening to cross, a troll blocks your path!You tell the troll that you wish to pass, and he says he'll let you if you can get his riddle right in three guess's. The riddle is: What gets wetter as it drys?");
						for (int i = 2; i != 0; i--) {
							riddle = log.readLine();
							if (riddle.equalsIgnoreCase("towel") && i == 3) {
								log.println("The troll says 'that is correct, you may procced!'");
								i = 0;

							} else if (riddle.equalsIgnoreCase("towel")) {
								log.println(
										"The trool says 'correct, but you didnt get it on the first try! I know I said I'd give you 3 tries, but i lied.' The troll eats you, you are dead.");
							} else if (!riddle.equals("towel")) {
								log.println("The troll says 'wrong, try again.' You have " + i + " guesses left");
								triesTroll--;
							}
							log.clear();

						}
						if (triesTroll == 0) {
							log.println(
									// dead troll on bridge with guard standing over it
									"The troll says 'Sorry, you're out of tries. I'm gonna eat you now.' You turn around and try to run, but see 3 guards approching. The troll notices them, looks at you and says 'dont move.' The troll lunges himself at the guards, but before you get a chance to run, the troll kills a gaurd and throws him at you. The two other gaurds kill the troll, and start approching you.");
							if (sword = true) {
								//dead guards with guy standing over them
								log.println(
										"You pull out the sword you found earlier, and charge at the guards. Useing your agility, you manage to kill both of them. You steal their gold and cross the bridge, seeing your house in the distance.");
							} else {
								log.println("With nothing to defend yourself, the guards kill you. You are dead.");
							}
							log.clear();
						}
					} else if (userInput[0][3].equalsIgnoreCase("yellow brick road") && death == false) {
						//WoO ppl on yellow brick road with dead guy
						log.println(
								"You come across a girl, a tin man, a scarecrow and a lion who all look familier. Before you can remmber from where, they all attack you. You are dead.");
						death = true;
					} else {

					}
				} else if (userInput[0][1].equalsIgnoreCase("keep running")) {
					log.println("The guards catch up to you! They kill you. You are dead.");
				} else {
					log.println("Please enter a valid option.");

				}
			} else if (userInput[0][0].equalsIgnoreCase("desert")) {
				//camel
				log.println("You come to a camel. Do you want to take it?");
				userInput[1][0] = log.readLine();
				log.clear();
				if (userInput[1][0].equalsIgnoreCase("Yes")) {
					//pyramid
					log.println("You ride the camal until you approch a pyramid.");
					log.println("Do you enter?");
					userInput[1][1] = log.readLine();
					log.clear();
					if (userInput[1][1].equalsIgnoreCase("yes")) {
						log.println("You enter the pyramid, unaware of what awaits you.");
						//tunnel
						log.println("You come to a tunnel.");
						log.println("Would you like to enter the tunnel?");
						userInput[1][2] = log.readLine();
						log.clear();
						if (userInput[1][2].equalsIgnoreCase("yes")) {
							//golden idol
							log.println("You see a golden idol.");
							log.println("You take it and move on.");
							gold = gold + 10;
						}
						//mummy
						log.println("You keep walking until you come across a mummy.");
						log.println("The mummy says:");
						log.println(
								"'All who enter here DIE!... Unless you can guess my number thats between 1 and 5'");
						log.println("You have three guesses.");

						int mummyNumber = (int) (Math.random() * 3);
						for (int i = 0; i < triesMummy; i++) {
							userGuess = log.readLine();
							if (userGuess.equals(mummyNumber) && i == 3) {
								i = 0;
								//skeleton army
								log.println("Wow... you got it on the first try.");
								log.println("You must be a genuis!");
								log.println("I need a genuis like you, to lead my army of skeletons!");
								log.println("Go, lead my army and attack that wretched kingdom!");
								log.println("Power hungry, you lead the army to the kingdom.");
								log.println("You need a battle plan!");
								log.println("Will you lay seige to the castle, or assult it head on?(seige/assult)");
								userInput[1][3] = log.readLine();
								log.clear();
								if (userInput[1][3].equalsIgnoreCase("seige")) {
									//throne
									log.println(
											"You lay seige for three gruleng months, until the kingdom finally surrender.");
									Thread.sleep(2000);
									//princess
									log.println(
											"You take over as the new king, marry the princess, and live happily ever after...");
									Thread.sleep(2000);
									//throne room, mummy standing over dead guy
									log.println(
											"For all of two hours until the mummy comes back demanding the throne.");
									log.println("He kills you.");
									log.println("You are dead.");
									death = true;

								} else if (userInput[1][3].equalsIgnoreCase("assult")) {
									log.println("You charge your army at the castle.");
									log.println(
											"As bones start flying at you, you realize that all it takes is one hit to a skelleton to kill it.");
									log.println("The defenders of the castle kill your army and you");
									log.println("You are dead.");
									death = true;
								} else {
									log.println("Please enter a valid input.");
								}
							} else if (userGuess.equals(mummyNumber) && i == 2) {
								log.println("That is correct, you may leave.");
								//random portal in the middle of desert
								log.println("As you leave the pyramid, you come across a random portal.");
								log.println("Do you use it?");
								userInput[1][4] = log.readLine();
								log.clear();
								if (userInput[1][4].equalsIgnoreCase("yes")) {
									log.println("You use the portal and it drops you off at home.");
								} else {
									log.println("You keep walking for a while until you begen to feel thursty.");
									log.println("You died of dehydration.");
									death = true;
								}

							} else if (userGuess.equals(mummyNumber) && i == 1) {
								log.println("That is correct... however... I think I'm going to kill you anyways.");
								log.println("Yoou are dead.");
								death = true;
							} else {
								log.println("That's wrong.");
								log.println("You have " + i + " tries left.");
							}
						}
					}
				} else {
					log.println(
							"You keep walking, and begen to feel tired. You start to feel thursty. You die of dehydration.");
					death = true;
				}
			}
			if (death = true) {
				log.println("Unfortunatly, you died.");
			} else {
				log.println("Congragulations! You win!");
			}
			log.println("Here are your choices:");
			for (int i = 0; i < 10; i++) {
				log.println("userInput" + userInput[0][1]);
			}
			log.println("You accumulated " + gold + " gold on your journey.");
			log.println("Would you like to play again?");
			replay = log.readLine();
			if (replay.equalsIgnoreCase("No")) {
				playAgain = false;
				log.println("Well thats rude. :(");
			} else if (replay.equalsIgnoreCase("Yes")) {
				playAgain = true;
			}

		}

	}

}
