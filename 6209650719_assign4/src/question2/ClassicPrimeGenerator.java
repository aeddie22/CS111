//อาดีนัน อับดุลลี
//6209650719
package question2;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ClassicPrimeGenerator implements PrimeNumberGenerator,ActionListener{
	
	private int round;
	private ArrayList<Integer> primes;
	
	public ClassicPrimeGenerator() {
		primes = new ArrayList<Integer>();
		primes.set(0, 2);
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<Integer> generatePrimes(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getPrime(int n) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
