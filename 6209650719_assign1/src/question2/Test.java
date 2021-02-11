//อาดีนัน อับดุลลลี
//6209650719
package question2;

public class Test {
	public static void main(String[] agrs) {
		
		Pokemon pokemon1 = new Pokemon();
		Pokemon pokemon2 = new Pokemon();
		Pokemon pokemon3 = new Pokemon();
		Pokemon pokemon4 = new Pokemon();
		Pokemon pokemon5 = new Pokemon();
		//Pokemon pokemon6 = new Pokemon();
		
		pokemon1.setName("Charmander");
		pokemon1.setType("Fire");
		pokemon1.setCategory("Lizard");
		pokemon1.setWeight(18.7);
		
		pokemon2.setName("Pikachu");
		pokemon2.setType("Electric");
		pokemon2.setCategory("Mouse");
		pokemon2.setWeight(13.2);

		pokemon3.setName("Bulbasaur");
		pokemon3.setType("Grass");
		pokemon3.setCategory("Seed");
		pokemon3.setWeight(15.2);

		pokemon4.setName("Squirtle");
		pokemon4.setType("Water");
		pokemon4.setCategory("Tiny Turtle");
		pokemon4.setWeight(19.8);

		pokemon5.setName("Sudowoodo");
		pokemon5.setType("Rock");
		pokemon5.setCategory("Imitation");
		pokemon5.setWeight(83.8);
		
		System.out.println("Name : "+pokemon1.getName());
		System.out.println("Type :"+pokemon1.getType());
		System.out.println("Category : "+pokemon1.getCategory());
		System.out.println("Weight : "+pokemon1.getWeight()+" lbs");
		System.out.println("\t");
		System.out.println("Name : "+pokemon2.getName());
		System.out.println("Type :"+pokemon2.getType());
		System.out.println("Category : "+pokemon2.getCategory());
		System.out.println("Weight : "+pokemon2.getWeight()+" lbs");
		System.out.println("\t");
		System.out.println("Name : "+pokemon3.getName());
		System.out.println("Type :"+pokemon3.getType());
		System.out.println("Category : "+pokemon3.getCategory());
		System.out.println("Weight : "+pokemon3.getWeight()+" lbs");
		System.out.println("\t");
		System.out.println("Name : "+pokemon4.getName());
		System.out.println("Type :"+pokemon4.getType());
		System.out.println("Category : "+pokemon4.getCategory());
		System.out.println("Weight : "+pokemon4.getWeight()+" lbs");
		System.out.println("\t");
		System.out.println("Name : "+pokemon5.getName());
		System.out.println("Type :"+pokemon5.getType());
		System.out.println("Category : "+pokemon5.getCategory());
		System.out.println("Weight : "+pokemon5.getWeight()+" lbs");
		
	}
}
