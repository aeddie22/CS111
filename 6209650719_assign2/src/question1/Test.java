//อาดีนัน อับดุลลี
//6209650719
package question1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) { // TEST
		
		//วัตถุที่สร้างขึ้นของคลาส
		PersonalAccountingSofware member = new PersonalAccountingSofware();
		MyAccount member2 = new MyAccount();
		MyAccountItem member3 = new MyAccountItem();
		Scanner sc = new Scanner(System.in);
		
		//ตัวแปรที่สร้างขึ้นมา
		char menu1 = 0;
		char menu2;
		char menu3;
	
		while(menu1 != 'X') { 
			//คำสั่งของโปรแกรม
			member.start(menu1);
			menu1 = sc.next().charAt(0);
	
			switch(menu1) {
			case 'I':
				member2.getFirstName();
				member2.getLastName();
				member2.getAccountNumber();
				member3.getReceiveItems();
				member3.getExpenseItems();
				break;
			case 'N':
				for(int i = 0 ; i < 2 ; i++) {
					System.out.print("กรุณาเลือก + หรือ - เพื่อเพิ่มรายรับและรายจ่าย > ");
					menu2 = sc.next().charAt(0);
					switch(menu2) {
					case '+':
						member3.addReceiveCost();
						break;
					case '-':
						member3.addExpenseCost();
						break;
					}
				}
				member3.displayItems();
				break;
			case 'F':
					System.out.print("กรุณาเลือก + หรือ - เพื่อค้นหารายรับและรายจ่าย > ");
					menu3 = sc.next().charAt(0);
					switch(menu3) {
					case '+':
						member3.searchRecevieItems();
						break;	
					case '-':
						member3.searchExpenseItems();
						break;
				}
				break;
			case 'C':
				member3.calItems();
				break;
			case 'X':
				System.exit(0); // จบโปรแกรม
				break;
				}
		}
		sc.close();	
	}

}
