//อาดีนัน อับดุลลี
//6209650719
package question3;

import java.util.ArrayList;

public class ItemReport {
	private String header;
	private ArrayList<ShoppingItem> ShoppingItem ;
	
	public ItemReport(String header) {
		this.header = header;
	}
	
	public void addItems(ShoppingItem item) {
		ShoppingItem.add(item);
	}
	
	public void addAllItems(ArrayList <ShoppingItem> items) {
		for(int i = 0 ; i < ShoppingItem.size() ; i++) {
			ShoppingItem.get(i).getMessage();
		}
	}
	
	public ArrayList<ShoppingItem> itemUnder(float price) {
		return null;
	}
	
	public void printList() {
		System.out.println("----------- "+this.header+" -----------");
		ItemReport ir = new ItemReport(header);
		ir.addAllItems(ShoppingItem);
		//for(int i = 0 ; i < ShoppingItem.size() ; i++) {
		//	float total = ShoppingItem.get(i).getPricePerUnit();
		//	float pay = ShoppingItem.get(i).getTotalPrice();
		//	int count = ShoppingItem.get(i).getCount();
		//}
		System.out.println("---------------------------------------");
	}

}
