//อาดีนัน อับดุลลี
//6209650719

package question1;

import java.util.Date;
import java.util.Scanner;

public class MyAccountItem {
	private String[] receiveItems;
	private String[] expenseItems;
	private float[] receiveCost;
	private float[] expenseCost;
	private String[] dateR;
	private String[] dateE;
	Date now = new Date();
	Scanner sc = new Scanner(System.in);

	public String[] getReceiveItems() {
		int num = 0;
		System.out.print("Enter number of your Receive items > ");
		num = sc.nextInt();
		receiveItems = new String[num];
		for(int i = 0 ; i < num ; i++) {
			System.out.print(i+1 +".");
			receiveItems[i] = sc.next();
		}
		return receiveItems;
	}
	
	public String[] getExpenseItems() {
		int num = 0;
		System.out.print("Enter number of your Expense items > ");
		num = sc.nextInt();
		expenseItems = new String[num];
		for(int i = 0 ; i < num ;i++) {
			System.out.print(i+1 +".");
			expenseItems[i] = sc.next();
		}
		return expenseItems;
	}

	public void addReceiveCost() {
		receiveCost = new float[receiveItems.length];
		dateR = new String[receiveItems.length];
		for(int i = 0; i < receiveItems.length ; i++) {
			System.out.print(receiveItems[i] + " : ");
			receiveCost[i] = sc.nextFloat();
			System.out.print("Date > ");
			dateR[i] = sc.next();
		}
	}
	
	public void addExpenseCost() {
		expenseCost = new float[expenseItems.length];
		dateE = new String[expenseItems.length];
		for(int i = 0; i < expenseItems.length ; i++) {
			System.out.print(expenseItems[i] + " : ");
			expenseCost[i] = sc.nextFloat();
			System.out.print("Date > ");
			dateE[i] = sc.next();
		}
	}
	
	public void displayItems() {
		System.out.println("\nRecieveItems : ");
		for(int i = 0 ; i < receiveItems.length ; i++ ) {
			System.out.println(dateR[i]+" "+receiveItems[i]+"  +"+receiveCost[i]+" Bath");
		}
		System.out.println("ExpenseItems : ");
		for(int j = 0 ; j < expenseItems.length ; j++) {
			System.out.println(dateE[j]+" "+expenseItems[j]+"  (-"+expenseCost[j]+") Bath");
			
		}
	}
	
	public void searchRecevieItems() { // กด F
		String s;
		System.out.print("> ");
		s = sc.next();
		
		for(int i = 0 ; i < receiveItems.length ; i++) {
			if(receiveItems[i].substring(0).equals(s)) {
				System.out.println(dateR[i]+" "+receiveItems[i].substring(0)+" "+receiveCost[i]+" Bath");
			}
		}
	}
	
	public void searchExpenseItems() { // กด F
		String s;
		System.out.print("> ");
		s = sc.next();
		for(int i = 0 ; i < expenseItems.length ; i++) {
			if(expenseItems[i].substring(0).equals(s)) {
				System.out.println(dateE[i]+" "+expenseItems[i].substring(0)+" "+expenseCost[i]+" Bath");
			}
		}
	}
	
	public void calItems() { // กด C
		double sum1 = 0, sum2 = 0;
		for(int i = 0 ; i < receiveItems.length ; i++) {
			sum1 = sum1 + receiveCost[i];
		}
		for(int i = 0 ; i < expenseItems.length ; i++) {
			sum2 = sum2 + (-expenseCost[i]);
		}
		System.out.println("รวมรายรับ +"+sum1+"   "+"รวมรายจ่าย ("+sum2+")");
		if(sum1 < sum2) {
			System.out.println("ติดหนี้  -"+(sum2-sum1));
		}else if(sum1 > sum2) {
			System.out.println("เหลือเงิน  "+(sum1+sum2));
		}
	}
	

}
