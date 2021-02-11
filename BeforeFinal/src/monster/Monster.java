package monster;

public class Monster {
	public String name;
	public int hp,atk;

	public Monster() {
		
	}

	public Monster(String m){
		try{
			String[] a = m.split(";");
			name = a[0];
			hp = Integer.parseInt(a[1]);
			atk = Integer.parseInt(a[2]);
			
		}catch(Exception e) {
			
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public String toString() {
		return name+" hp="+hp+","+" atk="+atk;
	}
	
	public void fight(Monster another) {
		hp -= another.atk;
	}

}

