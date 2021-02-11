//อาดีนัน อับดุลลี
//6209650719
package question3;

import java.util.Scanner;

public class ItemReportTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a,b;
		System.out.println("What is the name of this shopping list");
		a = sc.next();
		ItemReport i = new ItemReport(a);
		do {
			System.out.println("Add more item(name;price per unit;count) or exit (e)");
			b = sc.nextLine();
			if(b.charAt(1) == ';') {
				ShoppingItem sh = new ShoppingItem(b);
				i.addItems(sh);
			}if(b.equalsIgnoreCase("e")) {
				i.printList();
				i.itemUnder(20);
				System.exit(0);
				sc.close();
			}
			
		}while(true);
	}

}
