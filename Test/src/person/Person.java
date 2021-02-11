package person;

public class Person {
	//Data Abstraction
	private String name;
	private int score;
	private int positionX;
	private int positionY;
	
	//Function Abstraction
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int aScore) {
		score = aScore;
	}
	public void move(int toPositionX,int toPositionY) {
		positionX = toPositionX;
		positionY = toPositionY;
	}
	/*public int showPosiotion() {
		return positionX,positionY;
	}*/

	public static void main(String[] args) {
		Person jane = new Person();
		Person tommy = new Person();
		Person mike = new Person();
		
		jane.setName("Jane");
		jane.setScore(10);
		jane.move(5, 3);
		tommy.setName("Tommy");
		tommy.setScore(4);
		tommy.move(5, 8);
		mike.setName("Mike");
		mike.setScore(13);
		mike.move(1, 2);
		System.out.println(jane.name+" "+jane.score+" "+jane.positionX+" "+jane.positionY);
	}

}


