//อาดีนัน อับดุลลี
//6209650719
package question1;

import java.util.Scanner;
import java.util.Random;

public class MyAccount {
	private String firstName;
	private String lastName;
	private int accountNumber;
	
	Scanner sc = new Scanner(System.in);

	public String getFirstName() {
		System.out.print("กรุณากรอกชื่อของคุณ : ");
		firstName = sc.next();
		return firstName;
	}
	
	public String getLastName() {
		System.out.print("กรุณากรอกนามสกุลของคุณ : ");
		lastName = sc.next();
		return lastName;
	}
	
	public int getAccountNumber() {
		int max = 1000000000;
		Random rand = new Random();
		accountNumber = rand.nextInt(max+1000000000); // ทำให้ดป็นแค่ค่าบวก
		System.out.print("เลขที่บัญชีของคุณคือ > " + accountNumber+"\n");
		return accountNumber;
	}
}
