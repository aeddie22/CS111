package tuzoo;

public class Mani {
	public static void main(String[] args) {
		Elephant e = new Elephant();
		Zoo zoo = new Zoo();
		zoo.addAnimal(e);
		Tiger t = new Tiger();
		zoo.addAnimal(t);
		Bird b = new Bird();
		zoo.addAnimal(b);
	}
}
