package th.ac.tu.cs.domain;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> cage ; 
	
	public Zoo() {
		
	}
	
	public ArrayList<Animal> getAnimal(){
		return cage;
	}
	
	public void addAnimal(Animal a) {
		if(cage == null) {
			cage =  new ArrayList<Animal>();
		}
		cage.add(a);
		
	}
}
