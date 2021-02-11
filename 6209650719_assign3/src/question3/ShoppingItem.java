//อาดีนัน อับดุลลี
//6209650719
package question3;

public class ShoppingItem {
	private String name;
	private float pricePerUnit;
	private int count;
	private float totalPrice;
	

	public float getTotalPrice() {
		totalPrice = pricePerUnit*count;
		return totalPrice;
	}
	
	public String getName() {
		return name;
	}
	
	public float getPricePerUnit() {
		return pricePerUnit;
	}
	
	public int getCount() {
		return count;
	}
	
	public ShoppingItem(String itemInfo) {
		String[] a = itemInfo.split(";");
		String b = a[0];
		String c = a[1];
		String d = a[2];
		name = b;
		pricePerUnit = Integer.parseInt(c);
		count = Integer.parseInt(d);
	}

	public String getMessage() {
		return (name+"  price:"+pricePerUnit+"  count:"+count+" items");
	}
}
