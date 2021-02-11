package path;

public class TreasureMapTest {
	public static void main(String[] args) {
		
		TreasureMap tMap = new TreasureMap("N2;E3;S2;E7;E3;N4;W10");
		tMap.display();
		System.out.println("---createPaths---");
		tMap.createPaths("N1;W2");
		tMap.display();
	}
}
