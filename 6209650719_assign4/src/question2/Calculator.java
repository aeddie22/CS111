//อาดีนัน อับดุลลี
//6209650719
package question2;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

public class Calculator {

	public static ArrayList<Integer> generatePrimeNumbers(PrimeNumberGenerator generator,int n) {
		
		ArrayList<Integer> primes = null;
		Timer timer = new Timer(n, (ActionListener) generator);
		timer.setRepeats(false);
		int round = 1;
		try {
			while(round <= n) {
				timer.start();
				do {
					Thread.sleep(100);
				}while(timer.isRunning()==true);
			round++;
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return primes;
	}
	
	public ArrayList<Integer> generatePrimes(int n){
		
		return null;
		
	}
	
	public int getPrime(int n) {
		return 0;
	}
}
