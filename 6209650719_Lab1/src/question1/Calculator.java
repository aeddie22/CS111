package question1;

public class Calculator {
	public void printSummationBetween(int x, int y) {
		int result = 0;
		for(int i = x; i < y;i++) {
			result = result + i;
		}
		System.out.println(result);
	}
	
	public void CountOddNumberBetween(int x, int y) {
		int odd = 0;
		for(int i = x; i < y; i++) {
			if(i%2 == 1) {
				odd++;
			}
		}
		System.out.println(odd);
	}
	public void CountEvenNumberBetween(int x,int y) {
		int even = 0;
		for(int i = x; i < y; i++) {
			if(i%2 == 0) {
				even++;
			}
		}
		System.out.println(even);
	}

	public void CountEvenNumberBetween1(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
	
}
