package beep;

import java.awt.*;

public class Beep {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			try {
				Toolkit.getDefaultToolkit().beep();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


