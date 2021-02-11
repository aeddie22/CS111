package myProjectThinking;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*ActionListener count = (ActionListener) new CountBeforePlay();
		
		Timer time = new Timer(1000 , count);
		
		time.setRepeats(true);
		time.start();
		
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);*/
		Scanner sc = new Scanner(System.in);
		SummonerGame smg = new SummonerGame();
		try {
			
			System.out.print("Enter your file : ");
			String a = sc.nextLine();
			smg.readSummonFromFile("/Users/adeenunabdullee/eclipse-workspace/BeforeFinal/src/myProjectThinking/"+a);
			smg.autoPlay();
			
		}catch(Exception e) {
			
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	
	}
}
