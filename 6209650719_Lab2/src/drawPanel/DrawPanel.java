package drawPanel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setPaint(Color.BLUE);
		g2d.drawLine(30, 200, 200, 200);

		g2d.setColor(Color.RED);
		g2d.fillRect(10, 10, 90, 60);
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillOval(0, 200, 60, 60);
		
		int w = getWidth();
		int h = getHeight();

		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			int x = Math.abs(r.nextInt()) % w;
			int y = Math.abs(r.nextInt()) % h;
			g2d.setPaint(Color.GREEN);
			g2d.fillOval(x, y, 30, 30);
			g2d.setPaint(Color.BLACK);
			g2d.drawString("("+x+","+y+")", x, y);
		}

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Draw My Figure");
		frame.setSize(500, 500);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Container contentPane = frame.getContentPane();
		contentPane.add(new DrawPanel());
		frame.setVisible(true);
	}
}