package fix;

public class fixing {
	public static void main(String[] args) {

		Point[] points = new Point[10];

		int[] x = new int[10];
		int[] y = new int[10];

		String[] colors = new String[] { "blue", "red", "yellow", "magenta", "cyan", "hue", "pink", "black", "white", "grey" };

		for (int i = 0; i < 10; i++) {
			points[i] = new Point();
			x[i] = i + 2;
			y[i] = i + 4;
		}

		Game1 game1 = new Game1();
		game1.Play(points, x, y, colors);
	}
}
class Point {

	public void Draw(int x, int y, String color)
	{

		System.out.println(color + " " + x + " " + y);
	}
}

class Game1 {
	public void Play(Point[] points, int[] x, int[] y, String[] colors)
	{
		for (int i = 0; i < 10; i++) {
			points[i].Draw(x[i], y[i], colors[i]);
		}
	}
}
