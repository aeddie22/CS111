//อาดีนัน อับดุลลี
//6209650719
package question4;

public class Cartoon implements ListableItem{

	private int volumeNo;
	private int dayRented;
	private float price;
	private String name;
	private int count;
	private int totalPrice;
	@Override
	public String getMessge() {
		return (name+" vol. "+volumeNo+"\tprice per day: "+totalPrice+"\trented for: "+dayRented);
	}

	@Override
	public int getCount() {
		count = (int) (price/10);
		return count;
	}

	@Override
	public float getTotalPrice() {
		totalPrice = count*dayRented;
		return totalPrice;
	}
	
	public Cartoon(String name,int volumeNo,int dayRented,float price) {
		this.name = name;
		this.volumeNo = volumeNo;
		this.dayRented = dayRented;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getVolumeNo() {
		return volumeNo;
	}
	
	public int getDayRented() {
		return dayRented;
	}
	
	public float getPrice() {
		return price;
	}

}
