//อาดีนัน อับดุลลี
//6209650719
package question2;

import java.time.LocalDate;

public class Person {
	private String name;
	private String lastName;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	
	public Person(String pName,String pLast,int pBd,int pBm,int pBy) {
		name = pName;
		lastName = pLast;
		birthDay = pBd;
		birthMonth = pBm;
		birthYear = pBy;
		/*String[] p2 = p.split(";");
		String[] pName = p2[0].split(" ");
		String[] pBirth = p2[1].split("/");
		name = pName[0];
		lastName = pName[1];
		birthDay = Integer.parseInt(pBirth[0]);
		birthMonth = Integer.parseInt(pBirth[1]);
		birthYear = Integer.parseInt(pBirth[2]);*/	
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getBirthDayBE() { 
		int BE = birthYear + 543;
		String birthDayBE = String.format("%td/%td/%tY",birthDay, birthMonth, BE);
		return birthDayBE;
	}
	
	public int getBirthDay() {
		return birthDay;
	}
	
	public int getBirthMonth() {
		return birthMonth;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public int getAge() {
		LocalDate date = LocalDate.now();
		int age = date.getYear() - birthYear;
		return age;
	}

}
