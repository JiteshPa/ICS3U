package patel;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import hsa_new.Console;

public class testing {

	public static BufferedImage steveJobs=null;
	public static BufferedImage billGates=null;
	public static BufferedImage adamServ=null;
	public static BufferedImage questionScreen=null;
	static int x = 0, y = 0;
	static Console c=new Console (30,150);
	
	public static void main(String[] args) throws IOException {
		steveJobs = ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/steveJobs.jpg"));
		/*billGates = ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/billGates.jpg"));
		adamServ = ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/theSMan.jpg"));
		
		c.drawImage(steveJobs, 0, 0,  200, 161 , null);
	    c.drawImage(billGates, 0, 161,  200, 161 , null);
	    c.drawImage(adamServ, 0, 322,  200, 161 , null);*/
		questionScreen = ImageIO.read(WhoWantsToBeAMillionaire.class.getResourceAsStream("/questionScreenFinal.jpg"));
		c.drawImage(questionScreen, 0, 0,  c.getWidth() , c.getHeight() , null);
		
		
		
		c.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent me) {
				x = me.getX();
				y = me.getY();
				c.println(x + ", " + y);
			} 
		});
	 	
	}

}
