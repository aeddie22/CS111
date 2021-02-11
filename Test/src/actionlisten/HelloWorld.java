package actionlisten;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld implements ActionListener {
	private int count = 1;
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld!"+count);
		count++;
		for (int i = 1; i <= 5; i++) {
			try {
				Toolkit.getDefaultToolkit().beep();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
