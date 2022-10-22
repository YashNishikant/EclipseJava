import java.awt.Color;
import java.awt.Graphics;

public class Gas_Giant extends Planet{

	private int x;
	private int y;
	private int r;
	
	public Gas_Giant(int x, int y, int r, boolean l, String c) {
		super(x, y, r, l, c);
		this.x = x;
		this.y = y;
		this.r = r;
		
	}

	public void Draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, r/50000, r/50000);
	}
	
}
