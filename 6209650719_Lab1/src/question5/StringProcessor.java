package question5;

import java.util.Scanner;
public class StringProcessor {
	public void printTextOnConsole(String s,int times) {
		for(int i= 1 ; i <= times; i++ ) {
			System.out.println(s);
		}
	}
	public boolean isPalidrome(String s) {
		int length = s.length();
		int head = 0 , tail = s.length()-1;
		for(int i = 0;i < length ;i++) {
			if(s.charAt(head) == s.charAt(tail)){
				head++;
				tail--;
			}else
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter what you want : ");
		String s = scan.next();
		System.out.print("Enter your fun=cking time : ");
		int times = scan.nextInt();
		StringProcessor member = new StringProcessor();
		member.printTextOnConsole(s, times);
		System.out.print("isPalidrome : "+member.isPalidrome(s));
		scan.close();
		
	}

}
