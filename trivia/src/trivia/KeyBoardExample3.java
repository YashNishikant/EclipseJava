package trivia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyBoardExample3 extends JPanel{
	public static double yvel;
	public static boolean start = false;
	public KeyBoardExample3() {
			KeyListener listener = new KeyListener() {
				@Override
				public void keyTyped(KeyEvent e) {
				}

				@Override
				public void keyPressed(KeyEvent e) {
    				if(FlappyBird2.run){
						if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_SPACE){
							if(FlappyBird2.run){
								if(FlappyBird2.canjump == true){
									yvel = -5;
									FlappyBird2.canjump = false;
								}
							} else {
								FlappyBird2.run = true;
								start = true;
							}
						}
					}
					if(e.getKeyCode() == KeyEvent.VK_P){
						FlappyBird2.score = 0;
						FlappyBird2.xb = 100;
						FlappyBird2.yb = 200;
						FlappyBird2.canjump = true;
						FlappyBird2.xpos = 800;
						FlappyBird2.ypos = 400;
						FlappyBird2.xpos2 = 1000;
						FlappyBird2.ypos2 = 400;
						FlappyBird2.xpos3 = 1200;
						FlappyBird2.ypos3 = (int)(Math.random()*300)+200;
						FlappyBird2.xpos4 = 1400;
						FlappyBird2.ypos4 = (int)(Math.random()*300)+200;
						FlappyBird2.run = true;
						yvel = 0;
					}
					if(e.getKeyCode() == KeyEvent.VK_Q){
						System.exit(1);
					}
				}

				@Override
				public void keyReleased(KeyEvent e) {
				}
			};
			addKeyListener(listener);
			setFocusable(true);
	}

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        KeyBoardExample3 k = new KeyBoardExample3();
		frame.add(k);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.add(new FlappyBird2());
        frame.setVisible(true);
    }

}

class FlappyBird2 extends JComponent {
	public static boolean canjump = true;
	public static boolean playagain = false;
	public static boolean quit = false;
	public static int xb = 100;
	public static int yb = 200;
	public static double yacc = 0.2;
	public static int xpos = 800;
	public static int ypos = 400;
	public static int xpos2 = 1000;
	public static int ypos2 = 400;
	public static int xpos3 = 1200;
	public static int ypos3 = (int)(Math.random()*300)+200;
	public static int xpos4 = 1400;
	public static int ypos4 = (int)(Math.random()*300)+200;
	public static int score = 0;
	public static boolean run = true;
	public static int xposvel = 3;
	int cloudx = 800;
	int cloudx2 = 1200;
	int cloudy = (int)(Math.random()*80);
	int cloudy2 = (int)(Math.random()*80);

    FlappyBird2() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while (true) {
					if(run){
						yb+=KeyBoardExample3.yvel;
						KeyBoardExample3.yvel+=yacc;
						xpos-=xposvel;
						xpos2-=xposvel;
						xpos3-=xposvel;
						xpos4-=xposvel;
						cloudx-=(xposvel+1);
						cloudx2-=(xposvel+1);
						if(KeyBoardExample3.yvel >= -3){
							canjump = true;
						}
						if(xpos <= -8){
							xpos = 800;
							ypos = (int)(Math.random()*300)+200;
							score++;
						}
						if(xpos2 <= -8){
							xpos2 = 800;
							ypos2 = (int)(Math.random()*300)+200;
							score++;
						}
						if(xpos3 <= -8){
							xpos3 = 800;
							ypos3 = (int)(Math.random()*300)+200;
							score++;
						}
						if(xpos4 <= -8){
							xpos4 = 800;
							ypos4 = (int)(Math.random()*300)+200;
							score++;
						}
						if(xb<xpos+40 && xb>xpos){
							if(yb<ypos || yb>ypos+130){
								run = false;
								score++;
							}
						}
						if(xb<xpos2+40 && xb>xpos2){
							if(yb<ypos2 || yb>ypos2+130){
								run = false;
								score++;
							}
						}
						if(xb<xpos3+40 && xb>xpos3){
							if(yb<ypos3 || yb>ypos3+130){
								run = false;
								score++;
							}
						}
						if(xb<xpos4+40 && xb>xpos4){
							if(yb<ypos4 || yb>ypos4+130){
								run = false;
								score++;
							}
						}
						if(yb<0){
							yb = 0;
						}
						if(yb>690){
							run = false;
						}
						if(cloudx<0){
							cloudx = 800;
							cloudy = (int)(Math.random()*80);
						}
						if(cloudx2<0){
							cloudx2 = 800;
							cloudy = (int)(Math.random()*80);
						}
					}
					repaint();
					try {
						Thread.sleep(15);
					} catch (Exception e) {}

                }
            }
        });

        t.start();
    }

    public void paint(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        int x = 2;

        if(run){
			//Background
			gg.setColor(new Color(0,145,255));
			gg.fillRect(0,0,800,800);

			gg.setColor(new Color(22,118,25));
			gg.fillRect(0,700,800,800);

			gg.setColor(Color.WHITE);
			gg.fillRect(cloudx,cloudy, 50,20);
			gg.fillRect(cloudx2, cloudy2, 50,20);

			//Bird
			Color darkyellow = new Color(255,205,0);
	        Color red = new Color(242,56,0);
	        Color brightyellow = new Color(255,255,0);

	        gg.setColor(Color.YELLOW);
	        gg.fillRect(xb + 6 * x, yb + x,3*x,x);
	        gg.fillRect(xb + 4*x, yb + 2*x,4*x,x);
	        gg.fillRect(xb + 5*x, yb + 3*x,3*x,x);
	        gg.fillRect(xb + 6*x, yb + 4*x,2*x,x);
	        gg.fillRect(xb + 7*x, yb + 5*x,2*x,x);
	        gg.fillRect(xb + 7*x, yb + 6*x,3*x,x);
	        gg.fillRect(xb + 6*x, yb + 7*x,3*x,x);

	        gg.setColor(darkyellow);
	        gg.fillRect(xb + 5*x, yb + 8*x,3*x,x);
	        gg.fillRect(xb + 3*x, yb + 9*x,6*x,x);
	        gg.fillRect(xb + 5*x, yb + 10*x,5*x,x);

	        gg.setColor(Color.BLACK);
	        gg.fillRect(xb + 6*x, yb + 0,6*x,x);
	        gg.fillRect(xb + 4*x, yb + x, 2*x,x);
	        gg.fillRect(xb + 3*x, yb + 2*x,x,x);
	        gg.fillRect(xb + x, yb + 3*x,4*x,x);
	        gg.fillRect(xb + 0, yb + 4*x,x,3*x);
	        gg.fillRect(xb + 5*x, yb + 4*x,x,x);
	        gg.fillRect(xb + 6*x, yb + 5*x,x,2*x);
	        gg.fillRect(xb + 5*x, yb + 7*x,x,x);
	        gg.fillRect(xb + x, yb + 7*x,x,x);
	        gg.fillRect(xb + 2*x, yb + 8*x,3*x,x);
	        gg.fillRect(xb + 2*x, yb + 9*x,x,x);
	        gg.fillRect(xb + 3*x, yb + 10*x,2*x,x);
	        gg.fillRect(xb + 5*x, yb + 11*x,5*x,x);
	        gg.fillRect(xb + 9*x, yb + x,x,x);
	        gg.fillRect(xb + 8*x, yb + 2*x,x,3*x);
	        gg.fillRect(xb + 9*x, yb + 5*x,x,x);
	        gg.fillRect(xb + 10*x, yb + 6*x,6*x,x);
	        gg.fillRect(xb + 12*x, yb + x,x,x);
	        gg.fillRect(xb + 13*x, yb + 2*x,x,x);
	        gg.fillRect(xb + 14*x, yb + 3*x,x,3*x);
	        gg.fillRect(xb + 16*x, yb + 7*x,x,x);
	        gg.fillRect(xb + 10*x, yb + 8*x,6*x,x);
	        gg.fillRect(xb + 15*x, yb + 9*x,x,x);
	        gg.fillRect(xb + 10*x, yb + 10*x,5*x,x);
	        gg.fillRect(xb + 8*x, yb + 8*x,x,x);
	        gg.fillRect(xb + 9*x, yb + 7*x,x,x);
	        gg.fillRect(xb + 9*x, yb + 9*x,x,x);
	        gg.fillRect(xb + 12*x, yb + 3*x,x,2*x);

	        gg.setColor(red);
	        gg.fillRect(xb + 10*x, yb + 7*x,6*x,x);
	        gg.fillRect(xb + 10*x, yb + 9*x,5*x,x);
	        gg.fillRect(xb + 9*x, yb + 8*x,x,x);

	        gg.setColor(Color.WHITE);
	        gg.fillRect(xb + x, yb + 4*x,4*x,2*x);
	        gg.fillRect(xb + 5*x, yb + 5*x,x,x);
	        gg.fillRect(xb + 2*x, yb + 6*x,3*x,x);
	        gg.fillRect(xb + 10*x, yb + x,2*x,x);
	        gg.fillRect(xb + 9*x, yb + 2*x,4*x,x);
	        gg.fillRect(xb + 9*x, yb + 3*x,3*x,2*x);
	        gg.fillRect(xb + 13*x, yb + 3*x,x,3*x);
	        gg.fillRect(xb + 10*x, yb + 5*x,3*x,x);

	        gg.setColor(brightyellow);
	        gg.fillRect(xb + x, yb + 6*x,x,x);
	        gg.fillRect(xb + 2*x, yb + 7*x,3*x,x);
        	gg.fillRect(xb + 5*x, yb + 6*x,x,x);

			//Rest
			gg.setColor(Color.RED);
			gg.setFont(new Font("TimesRoman", Font.PLAIN,20));
			gg.drawString("Score: " + score, 650,20);
			gg.setColor(Color.GREEN);
			gg.fillRect(xpos,0, 30,ypos);
			gg.fillRect(xpos,ypos+130, 30, 670-ypos);
			gg.fillRect(xpos2,0, 30,ypos2);
			gg.fillRect(xpos2,ypos2+130, 30, 670-ypos2);
			gg.fillRect(xpos3,0, 30,ypos3);
			gg.fillRect(xpos3,ypos3+130, 30, 670-ypos3);
			gg.fillRect(xpos4,0,30,ypos4);
			gg.fillRect(xpos4,ypos4+130, 30, 670-ypos4);
		}
		if(!run){
			gg.setColor(Color.BLUE);
			gg.setFont(new Font("TimesRoman", Font.PLAIN,60));
			gg.drawString("Score: " + score, 80,400);
			gg.setFont(new Font("TimesRoman", Font.PLAIN,40));
			gg.drawString("Press p to play again.", 80,600);
			gg.drawString("Press q to quit.", 80, 650);
		}
  }

}
