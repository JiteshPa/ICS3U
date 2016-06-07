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
	public static int rnd;
	
	public static int x = 0, y = 0;
	static Console menu = new Console(40, 150);
	
	
	/*menu.setCursor(121,599);
 	menu.println(incorrect1[i]);
 
 	menu.setCursor(431,599);
 	menu.println(incorrect2[i]);
 
 	menu.setCursor(121,788);
 	menu.println(incorrect3[i]);
 
 	menu.setCursor(431,788);
 	menu.println(correct[i]);*/
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		
		
		String []questions=new String [15];
		String []incorrect1=new String [15];
		String []incorrect2=new String [15];
		String []incorrect3=new String [15];
		String []correct=new String [15];
		
		boolean checker=false;
		
		//public static BufferedImage bridgePic = null;
		titleScreen = ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/titleScreen.jpg"));
		questionScreen = ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/questionScreenFinal.jpg"));
		//log.drawImage(castlePic, 0, 0, 1920 / 3, 1200 / 3, null);
		
		 questions[0] = "Who was the first Prime Minister of Canada?"; incorrect1[0] = "John F. Kennedy"; incorrect2[0] = "Ronald Ragein"; incorrect3[0] = "Ronald McDonald"; correct[0] = "John A. McDonald";

         questions[1] = "Who were the Axis Powers?"; incorrect1[1] = "Germany, Russia, France"; incorrect2[1] = "Britain, France, U.S."; incorrect3[1] = "Canada, U.S., France"; correct[1] = "Germany, Italy, Japan";

         questions[2] = "When was D-Day?"; incorrect1[2] = "April 6, 1944"; incorrect2[2] = "August 6, 1944"; incorrect3[2] = "May 6, 1944"; correct[2] = "June 6, 1944";

         questions[3] = "What was a short term cause for WW1?"; incorrect1[3] = "The invasion of France"; incorrect2[3] = "The invasion of Poland"; incorrect3[3] = "The assassination of Winston Churchill"; correct[3] = "The assassination of Archduke Franz Ferdinand";

         questions[4] = "Who was the Prime Minister of Canada for both World Wars?"; incorrect1[4] = "Pierre Truedeau"; incorrect2[4] = "Richard Nixon"; incorrect3[4] = "R.B. Benet"; correct[4] = "Mackenzie King";

         questions[5] = "What was the name of the atomic bomb project?"; incorrect1[5] = "Miami Project"; incorrect2[5] = "Ottawa Project"; incorrect3[5] = "New York Project"; correct[5] = "Manhattan Project";

         questions[6] = "Which of the following is not part of the *Big Five* countries in the United Nations?"; incorrect1[6] = "France"; incorrect2[6] = "China"; incorrect3[6] = "U.S.A."; correct[6] = "Japan";

         questions[7] = "What was a long term cause for WW2?"; incorrect1[7] = "The assassination of JFK"; incorrect2[7] = "MANIA"; incorrect3[7] = "Capitalism vs Communism"; correct[7] = "The Treaty of Versailles";

         questions[8] = "Which of the following was not part of the Cold War"; incorrect1[8] = "Communism vs Capitalism"; incorrect2[8] = "The Space Race"; incorrect3[8] = "The Cuban Missile Crisis"; correct[8] = "The Suez Canal Crisis";

         questions[9] = "What were the twenties known as?"; incorrect1[9] = "Booming"; incorrect2[9] = "Golden"; incorrect3[9] = "Dirty"; correct[9] = "Roaring";

         questions[10] = "In what year did aboriginals get the right to vote in Canada?"; incorrect1[10] = "1980"; incorrect2[10] = "1950"; incorrect3[10] = "1970"; correct[10] = "1960";

         questions[11] = "What was Canada's *Defining Moment* during WW1?"; incorrect1[11] = "Somme"; incorrect2[11] = "Passendale"; incorrect3[11] = "Cambria"; correct[11] = "Vimy Ridge";

         questions[12] = "Which of the following was a political party created during the Great Deppresion?"; incorrect1[12] = "Social Services Party"; incorrect2[12] = "Socalist Party"; incorrect3[12] = "The Socialist Party of Canada"; correct[12] = "Social Credit Party";

         questions[13] = "When was D-Day?"; incorrect1[13] = "April 6, 1944"; incorrect2[13] = "August 6, 1944"; incorrect3[13] = "May 6, 1944"; correct[13] = "June 6, 1944";

         questions[14] = "Which of the following cities is today known as St.Petersbrough?"; incorrect1[14] = "Dunkirk"; incorrect2[14] = "Munich"; incorrect3[14] = "Stalingrad"; correct[14] = "Leningrad";

         
         
         menu.clear();
         menu.setTextBackgroundColor(Color.BLUE);
         menu.setTextColor(Color.YELLOW);
         menu.drawImage(titleScreen, 0, 0,  menu.getWidth() , menu.getHeight() , null);
         
        
         
         while (true)
         {
        	 mouseClick();
        	 Thread.sleep(10);
        	 if ((419<=x&&x<=647)&&(360<=y&&y<=469))
        	 {
        		 break;
        	 }
         }
        
         
         for (int i=0;i<questions.length;i++)
         {
    		 menu.clear();
        	 menu.drawImage(questionScreen, 0, 0,  menu.getWidth() , menu.getHeight() , null);
        	 menu.setCursor(9,15);
        	 menu.print(questions[i]);
        	 Thread.sleep(5000);
        	 
        	 rnd=(int) (Math.random() * 3);
        	 
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
        	 if (rnd==1)
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
        	 Thread.sleep(5000);
        	 while (true)
             {
            	 mouseClick();
            	 Thread.sleep(10);
            	 if ((0<=x&&x<=100000)&&(0<=y&&y<=100000))
            	 {
            		 break;
            	 }
             }
        	 
         
         
         
         
         
         
 		//50:50
 		 if ((123<=x&&x<=284)&&(352<=y&&y<=451)) 
 		 {
 			 fiftyFifty();
 		 }
 		 //PAF
 		 if ((324<=x&&x<=284)&&(352<=y&&y<=451))  
 		 {
 			 phoneAFriend();
 		 }
 		 //AP
 		 if ((546<=x&&x<=720)&&(352<=y&&y<=451)) 
 		 {
 			 audiencePoll();
 		 }
 		
         }
         
         
         
         
         
         
	}
	
	public static void fiftyFifty (){

		 if (rnd==0)
		 {
			 
		 }
		 else if (rnd==1)
		 {
			 
		 }
		 else if (rnd==2)
		 {
			 
		 }
		 else
		 {
			 
		 }
	}
	public static void phoneAFriend (){
		Console callScreen=new Console (40,150);
		
	}
	public static void audiencePoll (){
		Console audiencePoll=new Console(40,150);
		if (rnd==0)
		{
		 audiencePoll.println("_________________________");
		 audiencePoll.println("|     |     |     |     |");
		}
		else if (rnd==1)
		{
			 
		}
		else if (rnd==2)
		{
			 
		}
		else
		{
			 
		}
	
	}
	public static void mouseClick (){
		menu.addMouseListener(new MouseAdapter() { 
 			public void mousePressed(MouseEvent me) {
 				x = me.getX();
 				y = me.getY();
 				//menu.println(x + ", " + y);
 			} 
 		});
		
	}
	public static boolean checkAnswer(){
		 if (rnd==0)
		 {
			 return true;
		 }
		 else if (rnd==1)
		 {
			 return true;
		 }
		 else if (rnd==2)
		 {
			 return true;
		 }
		 else if (rnd==3)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}

}
