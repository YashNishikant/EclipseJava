package gamekinda;


import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class panel{
	DrawRacers racers;
	JFrame frame;
	boolean showText=false;
	String racerPlaces="";
	int textX,textY,textSize;

	public panel(int x,int y){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(x, y);

	}


	public void repaint(){
		frame.repaint();
	}


	public void delay(int x){
		try{
			Thread.sleep(x);
		}catch(Exception e){}
	}

	public void showText(boolean b){
		showText=b;
	}

	public void setPlaces(String s,int x,int y,int size){
		racerPlaces=s;
		textX=x;
		textY=y;
		textSize=size;
	}


	public class DrawRacers extends JPanel{
		BufferedImage image1,image2;
		int racerOnex,racerOney,racerTwox,racerTwoy;

		public DrawRacers(String racerPathOne,String racerPathTwo,String racerPathThree){
			setBackground(Color.BLACK);
			try{
			image1=ImageIO.read(new File(racerPathOne));
			image2=ImageIO.read(new File(racerPathTwo));
			}catch(IOException e){}

		}


		public void changeRacer1Position(int x,int y){
			racerOnex=x;
			racerOney=y;
		}

		public void changeRacer2Position(int x,int y){
			racerTwox=x;
			racerTwoy=y;
		}

		 @Override
		 public void paintComponent(Graphics g) {
		 	super.paintComponent(g);
			g.drawImage(image1,racerOnex,racerOney,null,null);
			g.drawImage(image2,racerTwox,racerTwoy,null,null);
			g.setColor(Color.WHITE);
			if (showText==true){
				g.setFont(new Font("TimesRoman", Font.PLAIN, textSize));
				g.drawString(racerPlaces,textX,textY);
			}
    	}
	}


}
