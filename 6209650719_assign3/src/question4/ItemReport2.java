//อาดีนัน อับดุลลี
//6209650719
package question4;

import java.util.ArrayList;

public class ItemReport2 {
	private String header;
	private ArrayList<ListableItem> ListableItem;
	
	public void addAllItem(ArrayList<ListableItem> item) {
		
	}
	
	public void addItem(ListableItem item) {
		item.getCount();
		item.getTotalPrice();
		item.getMessge();
		ListableItem.add(item);
	}
	
	public ItemReport2(String header) {
		this.header = header;
	}
	
	public ListableItem itemUnder(float price) {
		System.out.println("You need");
		return null;
	}

	public void printList() {
		System.out.println("------------- "+header+" -------------");
		
	}
}
