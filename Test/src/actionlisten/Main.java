package actionlisten;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Main {
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		
		final int DELAY = 1000;
		Timer t = new Timer(DELAY, hw);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}
