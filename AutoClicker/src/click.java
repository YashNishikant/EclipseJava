import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class click {

	public static void main(String[] args) throws AWTException, InterruptedException {

		Robot bot = new Robot();

		Thread.sleep(5000);

		while (true) {

			bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(100);
			bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		}
	}

	/*
	 * public void keyPressed(KeyEvent e) { int i = e.getKeyCode();
	 * 
	 * if (i == KeyEvent.VK_INSERT) {
	 * 
	 * return;
	 * 
	 * }
	 * 
	 */

}
