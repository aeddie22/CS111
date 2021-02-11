package th.ac.tu.cs.domain;

public class Tiger implements Animal,Mammal {

	@Override
	public void eat() {
		System.out.println("Tiger eats Meat.");
	}

	@Override
	public String getDetail() {		
		return "tiger";
	}

	public void bite() {
		System.out.println("Tiger bites.");
	}

	public String feedBabayWith() {
		// TODO Auto-generated method stub
		return "Milk";
	}
	
}
