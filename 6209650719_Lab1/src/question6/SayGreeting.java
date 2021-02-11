package question6;

import java.util.Scanner;

public class SayGreeting {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number for Select language : ");
		num = scan.nextInt();
		do{
			if(num == 1 ) {
				System.out.println("สวัสดี");
				break;
			}else if(num == 2){
				System.out.println("Hello");
				break;
			}else if(num == 3) {
				System.out.println("Bonjour");
				break;
			}else if(num != 1|| num != 2 || num != 3){
				System.out.println("Please try again !");
				System.out.print("Enter Number for Select language : ");
				num = scan.nextInt();
			}
		}while(num != 1|| num != 2 || num != 3);
		scan.close();
		
	}

}
