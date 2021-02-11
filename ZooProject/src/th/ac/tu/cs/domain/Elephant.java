package th.ac.tu.cs.domain;

public class Elephant implements Animal,Mammal {

	@Override
	public void eat() {
		System.out.println("Elephant eats Grass.");
	}

	@Override
	public String getDetail() {
		return "elephant";
	}
	
	public void dragLog() {
		System.out.println("Elephant drags logs.");
	}

	@Override
	public String feedBabayWith() {
		// TODO Auto-generated method stub
		return "Milk";
	}
}
