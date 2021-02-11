package th.ac.tu.cs.domain;

import java.util.ArrayList;

//import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Elephant e = new Elephant();
		// Declared Type of Object e = Elephant
		// e could be as declared type of types related
		// type of e could be Elephant or Animal
		Tiger t = new Tiger();
		Bird b = new Bird();
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(e);
		zoo.addAnimal(t);
		zoo.addAnimal(b);
		
		ArrayList<Animal> animalInZoo = zoo.getAnimal();
		ArrayList<Mammal> list1 = new ArrayList<Mammal>();
		ArrayList<Animal> list2 = new ArrayList<Animal>();
		
		for(Animal animal : animalInZoo) {
			if(animal instanceof Mammal) {
				list1.add((Mammal)animal);//อย่าลืม casting เพราะ animal ยังไม่มีความสัมพันธ์กับ Mammal
			}else {
				list2.add(animal);
			}
		}
		
		
//		e.eat();
//		e.getDetail();
//		e.dragLog();
		
//		Animal animal = (Animal)e;
//		animal.eat();
//		animal.getDetail();
		
//		Animal animal1 = new Elephant();//real object is an elephant
		// declared type of object animal1 = Animal
//		animal1.eat();
//		animal1.getDetail();
		
//		((Elephant)animal1).dragLog();//animal1 casting to elephant
		
//		animal1 = new Tiger();//real object is a tiger
//		((Tiger)animal1).bite();
	}
}
