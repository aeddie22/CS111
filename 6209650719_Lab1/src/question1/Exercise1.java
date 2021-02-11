package question1;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		Calculator member1 = new Calculator();
		member1.printSummationBetween(x, y);
		member1.CountOddNumberBetween(x, y);
		member1.CountEvenNumberBetween(x, y);
		
		scan.close();
		}
}
