//อาดีนัน อับดุลลี
//6209650719
package question3;

import java.util.Random;

public class ClassList {
	private String fileName;
	private int numberOfStudents;
	private int[] numberOfStudentsWithGrade = new int[8];
	
	public ClassList(String cls, int num) {
		ClassList c1 = new ClassList(fileName, 0);
		fileName = cls;
		numberOfStudents = num;
		c1.generateStudentRecordsToFile();
		
		
	}
	
	private void generateStudentRecordsToFile() {
		Random rand1 = new Random();
		Random rand2 = new Random();
		int i = 1111111111 + rand1.nextInt(999999999);
		int j = rand2.nextInt(100);
		System.out.println("student number : "+i);
		System.out.println("studetn score : "+j);
	}
	
	public int[] countGrade(String n, int l, int u) {
		for(int i = 0 ; i < numberOfStudents ; i++) {
			if(l >= 80 && u <= 100) {
				return numberOfStudentsWithGrade;
			}else if(l >= 70 && u <= 79 ) {
				
			}else {
				
			}
		}
		return numberOfStudentsWithGrade;
	}
}
