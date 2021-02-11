//อาดีนัน อับดุลลี
//6209650719
package question2;

import java.util.Scanner;

public class CalculateLoves {
	private String name1; 
	private String name2;
	private String lastname1;
	private String lastname2;
	private int loves;
	private int loves1;
	private int loves2;
	private String luv;
	
	Scanner sc = new Scanner(System.in);

	public int checkName() {
		System.out.println("Enter your name and birthdate in format: Name Lastname;dd/mm/yyyy");
		Person pr = new Person(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		name1 = pr.getName().toUpperCase();
		lastname1 = pr.getLastName().toUpperCase();
		int luv = 0;
		for(int i = 0 ; i < name1.length() ; i++) {
			if(name1.charAt(i) == 'L') {
				luv = luv + 2;
			}else if(name1.charAt(i) == 'O') {
				luv = luv + 1;
			}else if(name1.charAt(i) == 'V') {
				luv = luv + 0;
			}else if(name1.charAt(i) == 'E') {
				luv = luv + 2;
			}else if(name1.charAt(i) == 'S') {
				luv = luv + 0;
			}
		}for(int i = 0 ; i < lastname1.length() ; i++) {
			if(lastname1.charAt(i) == 'L') {
				luv = luv + 2;
			}else if(lastname1.charAt(i) == 'O') {
				luv = luv + 1;
			}else if(lastname1.charAt(i) == 'V') {
				luv = luv + 0;
			}else if(lastname1.charAt(i) == 'E') {
				luv = luv + 2;
			}else if(lastname1.charAt(i) == 'S') {
				luv = luv + 0;
			}
		}
		loves1 = luv;
		return loves1;
	}
	
	public int checkLoverName() {
		System.out.println("Enter name and birthdate of your lover in format: Name Lastname;dd/mm/yyyy");
		Person pr2 = new Person(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		name2 = pr2.getName().toUpperCase();
		lastname2 = pr2.getLastName().toUpperCase();
		int luv = 0;
		for(int i = 0 ; i < name2.length() ; i++) {
			if(name2.charAt(i) == 'L') {
				luv = luv + 2;
			}else if(name2.charAt(i) == 'O') {
				luv = luv + 1;
			}else if(name2.charAt(i) == 'V') {
				luv = luv + 0;
			}else if(name2.charAt(i) == 'E') {
				luv = luv + 2;
			}else if(name2.charAt(i) == 'S') {
				luv = luv + 0;
			}
		}
		for(int i = 0 ; i < lastname2.length() ; i++) {
			if(lastname2.charAt(i) == 'L') {
				luv = luv + 2;
			}else if(lastname2.charAt(i) == 'O') {
				luv = luv + 1;
			}else if(lastname2.charAt(i) == 'V') {
				luv = luv + 0;
			}else if(lastname2.charAt(i) == 'E') {
				luv = luv + 2;
			}else if(lastname2.charAt(i) == 'S') {
				luv = luv + 0;
			}
		}
		loves2 = luv;
		return loves2;
	}
	
	public void calLoves() {
		loves = loves1 + loves2;
		
		if(loves >= 20) {
			luv = "Good";
		}else if(loves < 20){
			luv = "Bad";
		}
	}
	
	public void displayLoves() {
		System.out.println("Calculate love compatibility between"+name1+" "+lastname1+" and "+name2+" "+lastname2);
		System.out.print("\tThe love percentage is: "+loves+"%\n");
		System.out.print("\tThe zodiac compatibility is: "+luv+"\n");
	}
}

