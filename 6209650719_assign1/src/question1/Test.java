//อาดีนัน อับดุลลลี
//6209650719
package question1;

public class Test{
	public static void main(String[] args) {
		
		Cookie cookie1 = new Cookie();
		Cookie cookie2 = new Cookie();
		Cookie cookie3 = new Cookie();
		Cookie cookie4 = new Cookie();

		cookie1.setName("Chocolate Chip Cookie");
		cookie2.setName("Peanut Butter Cookie");
		cookie3.setName("Oatmeal Cookie");
		cookie4.setName("Oatmeal Resin Cookie");
		
		cookie1.setPrice(25);
		cookie2.setPrice(18);
		cookie3.setPrice(27);
		cookie4.setPrice(30);
		
		System.out.println("Price includes VAT : ");
		System.out.println(cookie1.getName()+" = "+cookie1.getPrice() );
		System.out.println(cookie2.getName()+" = "+cookie2.getPrice() );
		System.out.println(cookie3.getName()+" = "+cookie3.getPrice() );
		System.out.println(cookie4.getName()+" = "+cookie4.getPrice() );
	}

}
