package exTest;

public class HouseTest {
	public static void main(String[] args) {
		SmartHouse sh2 = new SmartHouse(3);
		sh2.setLight(2, true);
		sh2.printLightStatus();
		System.out.println("-------------------");
		sh2.setLight("1;0;0");
		sh2.printLightStatus();
	}
}
