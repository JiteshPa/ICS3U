package patel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import hsa_new.Console;


public class WhoWantsToBeAMillionaire {
	
	public static BufferedImage titleScreen=null;
	public static BufferedImage questionScreen=null;
	
	
	
	public static boolean AP;
	public static boolean PF;
	public static boolean FF;
	public static float[] hsbColours = new float[3];
	
	//for the mouse click
	public static int x = 0, y = 0;
	
	/**
	 * This is the main method. It does most of the work,and calls all of the otehr methods
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Setting up the console
		Console menu = new Console(40, 150);
		Color.RGBtoHSB(63, 71, 204, hsbColours);
		//to check if they quit
		boolean quit=false;
		
		//question and answer arrays
		String []questions=new String [15];
		String []incorrect1=new String [15];
		String []incorrect2=new String [15];
		String []incorrect3=new String [15];
		String []correct=new String [15];
		//money array
		int [] money=new int[15];
		
		//Initializing money values 
		money[0]=100;
		money[1]=200;
		money[2]=300;
		money[3]=500;
		money[4]=1000;
		money[5]=2000;
		money[6]=4000;
		money[7]=8000;
		money[8]=16000;
		money[9]=32000;
		money[10]=64000;
		money[11]=125000;
		money[12]=250000;
		money[13]=500000;
		money[14]=1000000;
		
		boolean win=false;
		
		//main pictures
		titleScreen = ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/titleScreen.jpg"));
		questionScreen = ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/questionScreenFinal.jpg"));
		
		//declaring questions and answers 
		 questions[0] = "Who was the first Prime Minister of Canada?"; incorrect1[0] = "John F. Kennedy"; incorrect2[0] = "Ronald Ragein"; incorrect3[0] = "Ronald McDonald"; correct[0] = "John A. McDonald";

         questions[1] = "Who were the Axis Powers?"; incorrect1[1] = "Germany, Russia, France"; incorrect2[1] = "Britain, France, U.S."; incorrect3[1] = "Canada, U.S., France"; correct[1] = "Germany, Italy, Japan";

         questions[2] = "When was D-Day?"; incorrect1[2] = "April 6, 1944"; incorrect2[2] = "August 6, 1944"; incorrect3[2] = "May 6, 1944"; correct[2] = "June 6, 1944";

         questions[3] = "What report declared that the British colonies should be autonomous?"; incorrect1[3] = "The Empire Report"; incorrect2[3] = "The Oliver Report"; incorrect3[3] = "The Christopher Report"; correct[3] = "The Balfour Report";

         questions[4] = "Who was the Prime Minister of Canada for both World Wars?"; incorrect1[4] = "Pierre Truedeau"; incorrect2[4] = "Richard Nixon"; incorrect3[4] = "R.B. Benet"; correct[4] = "Mackenzie King";

         questions[5] = "What was the name of the atomic bomb project?"; incorrect1[5] = "Miami Project"; incorrect2[5] = "Ottawa Project"; incorrect3[5] = "New York Project"; correct[5] = "Manhattan Project";

         questions[6] = "Which of the following wasn't part of the *Big Five* in the United Nations?"; incorrect1[6] = "France"; incorrect2[6] = "China"; incorrect3[6] = "U.S.A."; correct[6] = "Japan";

         questions[7] = "What was a long term cause for WW2?"; incorrect1[7] = "The assassination of JFK"; incorrect2[7] = "MANIA"; incorrect3[7] = "Capitalism vs Communism"; correct[7] = "The Treaty of Versailles";

         questions[8] = "Which of the following was not part of the Cold War"; incorrect1[8] = "Communism vs Capitalism"; incorrect2[8] = "The Space Race"; incorrect3[8] = "The Cuban Missile Crisis"; correct[8] = "The Suez Canal Crisis";

         questions[9] = "What were the twenties known as?"; incorrect1[9] = "Booming"; incorrect2[9] = "Golden"; incorrect3[9] = "Dirty"; correct[9] = "Roaring";

         questions[10] = "In what year did aboriginals get the right to vote in Canada?"; incorrect1[10] = "1980"; incorrect2[10] = "1950"; incorrect3[10] = "1970"; correct[10] = "1960";

         questions[11] = "What was Canada's *Defining Moment* during WW1?"; incorrect1[11] = "Somme"; incorrect2[11] = "Passendale"; incorrect3[11] = "Cambria"; correct[11] = "Vimy Ridge";

         questions[12] = "Which of the following was a political party created during the Great Deppresion?"; incorrect1[12] = "Social Services Party"; incorrect2[12] = "Socalist Party"; incorrect3[12] = "The Socialist Party of Canada"; correct[12] = "Social Credit Party";

         questions[13] = "What is 'Conscription'?"; incorrect1[13] = "A political ideology"; incorrect2[13] = "A bill banning alcohol"; incorrect3[13] = "A city in Russia"; correct[13] = "Mandatory military service";

         questions[14] = "Which of the following cities is today known as St.Petersbrough?"; incorrect1[14] = "Dunkirk"; incorrect2[14] = "Munich"; incorrect3[14] = "Stalingrad"; correct[14] = "Leningrad";

         
         
         menu.clear();
         menu.setTextBackgroundColor(Color.getHSBColor(hsbColours[0], hsbColours[1], hsbColours[2]));
         menu.setTextColor(Color.YELLOW);
         menu.drawImage(titleScreen, 0, 0,  menu.getWidth() , menu.getHeight() , null);
         
         
         
         while (true)
         {
        	 mouseClick(menu);
        	 Thread.sleep(10);
        	 
        	 if ((419<=x&&x<=647)&&(360<=y&&y<=469))
        	 {
        		 reset();
        		 break;
        	 }
         }
        
         
         for (int i=0;i<questions.length;i++)
         {
        	 //seting up the general question screen
    		 menu.clear();
        	 menu.drawImage(questionScreen, 0, 0,  menu.getWidth() , menu.getHeight() , null);
        	 menu.drawLine(870, 800-(44*i), 1049, 800-(44*i));
        	 menu.setCursor(9,15);
        	 menu.print(questions[i]);
        	 menu.setCursor(27,13);
        	 menu.print("A");
        	 menu.setCursor(27,52);
        	 menu.print("B");
        	 menu.setCursor(36,13);
        	 menu.print("C");
        	 menu.setCursor(36,52);
        	 menu.print("D");
        	 menu.setCursor(31,46);
     	 	 menu.print("Exit");

        	 
        	 
        	 //displaying answers
        	 int rnd=(int) (Math.random() * 4);
        	 
        	 if (rnd==0)
        	 {
        		menu.setCursor(27,15);
        	 	menu.print(incorrect1[i]);
        	 
        	 	menu.setCursor(27,54);
        	 	menu.print(incorrect2[i]);
        	 
        	 	menu.setCursor(36,15);
        	 	menu.print(incorrect3[i]);
        	 
        	 	menu.setCursor(36,54);
        	 	menu.print(correct[i]);
        	 }
        	 else if (rnd==1)
        	 {
        		menu.setCursor(27,15);
        	 	menu.print(incorrect2[i]);
        	 
        	 	menu.setCursor(27,54);
        	 	menu.print(correct[i]);
        	 
        	 	menu.setCursor(36,15);
        	 	menu.print(incorrect3[i]);
        	 
        	 	menu.setCursor(36,54);
        	 	menu.print(incorrect1[i]);
        	 }
        	 else if (rnd==2)
        	 {
        		menu.setCursor(27,15);
        	 	menu.print(correct[i]);
        	 
        	 	menu.setCursor(27,54);
        	 	menu.print(incorrect1[i]);
        	 
        	 	menu.setCursor(36,15);
        	 	menu.print(incorrect2[i]);
        	 
        	 	menu.setCursor(36,54);
        	 	menu.print(incorrect3[i]);
        	 }
        	 else 
        	 {
        		menu.setCursor(27,15);
        	 	menu.print(incorrect3[i]);
        	 
        	 	menu.setCursor(27,54);
        	 	menu.print(incorrect2[i]);
        	 
        	 	menu.setCursor(36,15);
        	 	menu.print(correct[i]);
        	 
        	 	menu.setCursor(36,54);
        	 	menu.print(incorrect1[i]);
        	 	
        	 }
        	 reset();
        	 
        //user input (life line or answer)	 
        while (true)
        {
    
           mouseClick(menu);
           Thread.sleep(10);	 
           if (((x>413&&x<703)&&(y>748&&y<838))||((324<=x&&x<=284)&&(352<=y&&y<=451))||((546<=x&&x<=720)&&(352<=y&&y<=451)&&!AP)||((x>413&&x<703)&&(y>748&&y<838))||((x>406&&x<695)&&(y>558&&y<646))||((x>90&&x<381)&&(y>557&&y<647))||((x>90&&x<381)&&(y>748&&y<838))||((x>124&&x<285)&&(y>352&&y<451)&&!FF)||((324<=x&&x<=486)&&(352<=y&&y<=449)&&!PF)||((x>324&&x<461)&&(y>663&&y<728)))
           {
        	   break;
           }
        }
        
        
        	 
         //50:50
		 if ((x>124&&x<285)&&(y>352&&y<451)&&!FF) 
		 {
			 fiftyFifty(menu,rnd);
			 reset();
			 while(true)
			 {
				 mouseClick(menu);
				 Thread.sleep(10);
				 if (((x>413&&x<703)&&(y>748&&y<838))||((x>406&&x<695)&&(y>558&&y<646))||((x>90&&x<381)&&(y>557&&y<647))||((x>90&&x<381)&&(y>748&&y<838)))
				 {
					 break;
				 }
			 }
		 }
		 //PAF
		 else if ((324<=x&&x<=486)&&(352<=y&&y<=449)&&!PF)  
		 {
			 phoneAFriend(correct[i],incorrect1[i]);
			 reset();
			 while(true)
			 {
				 mouseClick(menu);
				 Thread.sleep(10);
				 if (((x>413&&x<703)&&(y>748&&y<838))||((x>406&&x<695)&&(y>558&&y<646))||((x>90&&x<381)&&(y>557&&y<647))||((x>90&&x<381)&&(y>748&&y<838)))
				 {
					 break;
				 }
			 }
		 }
		 //AP
		 else if ((546<=x&&x<=720)&&(352<=y&&y<=451)&&!AP) 
		 {
			 audiencePoll(rnd);
			 reset();
			 while(true)
			 {
				 mouseClick(menu);
				 Thread.sleep(10);
				 if (((x>413&&x<703)&&(y>748&&y<838))||((x>406&&x<695)&&(y>558&&y<646))||((x>90&&x<381)&&(y>557&&y<647))||((x>90&&x<381)&&(y>748&&y<838)))
				 {
					 break;
				 }
			 }
		 }
		 //exit 
		 else if ((x>324&&x<461)&&(y>663&&y<728))
		 {
			quit=true;
			endGame(menu,money[i],quit);
		 }
         if(((x>413&&x<703)&&(y>748&&y<838))||((x>406&&x<695)&&(y>558&&y<646))||((x>90&&x<381)&&(y>557&&y<647))||((x>90&&x<381)&&(y>748&&y<838)))
         {
        	 if (checkAnswer(rnd))
        	 {
        		 menu.clear();
        		 menu.setCursor(9,15);
        	 	 menu.print("That is correct!");
        	 	 Thread.sleep(1000);
        	 	 menu.clear();
        	 }
        	 else
        	 {
        		 menu.print("Sorry, that's incorrect");
        		 endGame(menu,money[i-1],quit);        		 
        	 } 
         } 
 		
        }  
        endGame(menu,1000001,quit); 
         
	}
	
	/**
	 * This method is for the 50:50 lifeline.
	 * @param Console menu
	 * @param int rnd
	 */
	public static void fiftyFifty (Console menu, int rnd){

		 FF=true;
		 //d
		 if (rnd==0)
		 {
			  //a
			  menu.setCursor(27,13);
			  menu.print("                       ");
			  //c
			  menu.setCursor(36,13);
			  menu.print("                       ");
		 }
		 //b
		 else if (rnd==1)
		 {
			  //d
			  menu.setCursor(36,52);
			  menu.print("                       ");
			  //c
			  menu.setCursor(36,13);
			  menu.print("                       ");
		 }
		 //a
		 else if (rnd==2)
		 {
			  //b
			  menu.setCursor(27,52);
			  menu.print("                       ");
			  //d
			  menu.setCursor(36,52);
			  menu.print("                       ");
		 }
		 //c
		 else
		 {
			  //a
			  menu.setCursor(27,13);
			  menu.print("                       ");
			  //d
			  menu.setCursor(36,52);
			  menu.print("                       ");
		 } 
	}
	/**
	 * This method is for the phone a friend lifeline.
	 * @param String correct
	 * @param String incorrect
	 * @throws IOException 
	 */
	public static void phoneAFriend (String correct, String incorrect) throws InterruptedException, IOException{
		//phone a friend console
		Console callScreen=new Console (40,50);
		//seting up the three friends
		BufferedImage steveJobs=ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/steveJobs.jpg"));
		BufferedImage billGates= ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/billGates.jpg"));
		BufferedImage adamServ=ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/theSMan.jpg"));
		callScreen.drawImage(steveJobs, 0, 0,  200, 161 , null);
		callScreen.drawImage(billGates, 0, 161,  200, 161 , null);
	    callScreen.drawImage(adamServ, 0, 322,  200, 161 , null);
		//setting the checker to false
		 PF=true;
		 
		 //wait for them to click on one of the three
		 while(true)
		 {
			 mouseClick(callScreen);
			 Thread.sleep(10);
			 if ((x>12&&x<214)&&(y>73&&y<556))
			 {
				 break;
			 }
		 }
		 callScreen.clear();
		 //depending on who is clicked, output persons picture and comment
		 if ((x>12&&x<214)&&(y>73&&y<234))
		 {
			 callScreen.drawImage(steveJobs, 0, 0,  200, 161 , null);
			 callScreen.setCursor(30,2);
			 callScreen.print("I dont know the correct answer.");
		 }
		 else if ((x>12&&x<214)&&(y>235&&y<395))
		 {
			 callScreen.drawImage(billGates, 0, 161,  200, 161 , null);
			 callScreen.setCursor(30,2);
			 callScreen.print("I think it's ether "+correct+" or "+incorrect+".");
		 }
		 else if ((x>12&&x<214)&&(y>396&&y<556))
		 {
			 callScreen.drawImage(adamServ, 0, 322,  200, 161 , null);
			 callScreen.setCursor(30,2);
			 callScreen.print("Easy, the correct answer is "+correct+".");
		 }
		 Thread.sleep(4000);
		 callScreen.close();
		 
		
		
	}
	/**
	 * This method is for the audience poll lifeline.
	 * @param int rnd
	 */
	public static void audiencePoll (int rnd) throws InterruptedException{
		//making the audience poll console
		Console audiencePoll=new Console(5,25);
		audiencePoll.setTextBackgroundColor(Color.getHSBColor(hsbColours[0], hsbColours[1], hsbColours[2]));
		audiencePoll.setTextColor(Color.YELLOW);
		//setting the checker to false
		AP=true;
		//depending on the value of random, making up a poll chart to show the correct answer 
		if (rnd==0)
		{
			audiencePoll.println("-------------------------");
			audiencePoll.println("|  A  |  B  |  C  |  D  |");
			audiencePoll.println("-------------------------");
			audiencePoll.println("|  "+20+" |  "+15+" |  "+10+" |  "+55+" |");
			audiencePoll.println("-------------------------");
		
		}	
		else if (rnd==1)
		{
			audiencePoll.println("-------------------------");
			audiencePoll.println("|  A  |  B  |  C  |  D  |");
			audiencePoll.println("-------------------------");
			audiencePoll.println("|  "+10+" |  "+70+" |  "+10+" |  "+10+" |");
			audiencePoll.println("-------------------------");
		}		
		else if (rnd==2)
		{
			audiencePoll.println("-------------------------");
			audiencePoll.println("|  A  |  B  |  C  |  D  |");
			audiencePoll.println("-------------------------");
			audiencePoll.println("|  "+25+" |  "+25+" |  "+25+" |  "+25+" |");
			audiencePoll.println("-------------------------");
		}
		else
		{
			audiencePoll.println("-------------------------");
			audiencePoll.println("|  A  |  B  |  C  |  D  |");
			audiencePoll.println("-------------------------");
			audiencePoll.println("|  "+30+" |  "+25+" |  "+45+" |  "+5+" |");
			audiencePoll.println("-------------------------");
		}
		//closing teh console after 3 seconds
		Thread.sleep(3000);
		audiencePoll.close();
	
	}
	/**
	 * This method is for mouse clicks.
	 * @param Console c
	 */
	public static void mouseClick (Console c){
		//wait for mouse click
		c.addMouseListener(new MouseAdapter() { 
 			public void mousePressed(MouseEvent me) {
 				x = me.getX();
 				y = me.getY();
 			} 
 		});
		
	}
	/**
	 * This method checks the user inputed answer
	 * @param rnd
	 * @return boolean
	 */
	public static boolean checkAnswer(int rnd){
		//depending on the random number and what is clicked on by the user, return true or false
		 if (rnd==0&&(x>413&&x<703)&&(y>748&&y<838))
		 {
			 return true;
		 }
		 else if (rnd==1&&(x>406&&x<695)&&(y>558&&y<646))
		 {
			 return true;
		 }
		 else if (rnd==2&&(x>90&&x<381)&&(y>557&&y<647))
		 {
			 return true;
		 }
		 else if (rnd==3&&(x>90&&x<381)&&(y>748&&y<838))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}
	/**
	 * This method ends the game.
	 * @param Console menu
	 * @param int cash
	 */
	public static void endGame(Console menu, int cash,boolean quit) throws InterruptedException{
		//set up the end of the game
		menu.clear();
		menu.setTextBackgroundColor(Color.getHSBColor(hsbColours[0], hsbColours[1], hsbColours[2]));
		menu.setTextColor(Color.YELLOW);
		menu.setCursor(1,1);
		menu.println("Game Over");
		//depending on the cash amount they were on, output their winnings
		if (cash<=1000)
		{
			menu.println("Sorry, you win nothing :(");
		}
		else if (cash>1000&&cash<=32000)
		{
			menu.println("You won $1000.");
		}
		else if (cash>32000&&cash<=1000000)
		{
			menu.println("You won $32000");
		}
		else if (quit=true)
		{
			menu.println("You win $"+cash);
		}
		else 
		{
			menu.println("Congratulations! You are a millionare!");
		}
		
		Thread.sleep(1000);
		menu.close();
		
	}
	/**
	 * This method resets the x and y values.
	 */
	public static void reset(){
		x=0;
		y=0;
	}

}