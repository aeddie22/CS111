package tuzoo;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> cage;
	private int[] data = {1,2,3,4,5};
	
	public Zoo() {
		
	}
	public void addAnimal(Animal a) {
		if(cage == null) {
			cage = new ArrayList<Animal>();
		}
		cage.add(a);
		for(int int_val : data) {
			System.out.println(int_val);
		}
	}
}
