//อาดีนัน อับดุลลี
//6209650719
package question2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		CalculateLoves cl = new CalculateLoves();
		Scanner sc = new Scanner(System.in);
		char yn;
		
		cl.checkName();
		do{
			cl.checkLoverName();
			cl.calLoves();
			cl.displayLoves();
			System.out.println("Want to calculate your love with another person? (Y/N)");
			yn = sc.next().charAt(0);
		}while(yn != 'N');
	
		sc.close();
	}
}
