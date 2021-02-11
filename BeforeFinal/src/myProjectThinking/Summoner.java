package myProjectThinking;

import java.util.InputMismatchException;

public class Summoner implements Ability {

	protected String name;
	protected int hp;
	protected int atk;
	protected String elm;
	
	public Summoner() {}
	
	public Summoner(String data) throws InputMismatchException {
		try {
			String[] a = data.split(";");
			name = a[0];
			hp = Integer.parseInt(a[1]);
			atk = Integer.parseInt(a[2]);
			elm = a[3];
		}catch(Exception e) {
			System.out.println("");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getHP() {
		return hp;
	}
	
	public int getATK() {
		return atk;
	}
	
	public String getELM() {
		return elm;
	}
	
	public String toString() {
		return name+" hp = "+hp+" atk = "+atk+" element = "+elm;
	}

	@Override
	public void attack(Summoner another) {
		// TODO Auto-generated method stub
		hp -= another.atk;
		
	}

	@Override
	public void recover(int drug) {
		// TODO Auto-generated method stub
		hp += drug;
	}
	
	public void elements() {
	
	}

}
