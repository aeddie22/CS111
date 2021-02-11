//อาดีนัน อับดุลลี
//6209650719
package question4;

public class Novel implements ListableItem{

	private String name;
	private int dayRented;
	private int count;
	private int totalPrice;
	
	@Override
	public String getMessge() {
		return (name+"\tprice per day: "+totalPrice+"\trented for: "+dayRented);
	}

	@Override
	public int getCount() {
		count = dayRented*7;
		return count;
	}

	@Override
	public float getTotalPrice() {
		totalPrice = count;
		return totalPrice;
	}
	
	public Novel(String name, int dayRented) {
		this.name = name;
		this.dayRented = dayRented;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDayRented() {
		return dayRented;
	}

}
