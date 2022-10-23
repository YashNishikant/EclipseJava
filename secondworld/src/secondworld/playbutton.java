package secondworld;


import java.awt.Rectangle;

public class playbutton {

	int x;
	int y;
	
	public playbutton(){
		
	x = 880;
	y = 550;
		
	}
	
	public Rectangle bounds() {

		return (new Rectangle(x, y, 80, 80));

	}
	
}
