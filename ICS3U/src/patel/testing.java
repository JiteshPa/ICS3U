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

	public static BufferedImage questionScreen=null;
	static int x = 0, y = 0;
	static Console c=new Console (40,150);
	
	public static void main(String[] args) throws IOException {
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
