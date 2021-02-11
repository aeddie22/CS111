//อาดีนัน อับดุลลลี
//6209650719
package question5;

import java.util.Scanner;

public class Test {
	public static void main (String[] agrs) {
		Box box = new Box();
		SlopeFloor slf = new SlopeFloor();
		Scanner input = new Scanner(System.in);
		double temp1,temp2,temp3;

		System.out.print("Enter box wesight : ");
		temp1 = input.nextDouble();
		box.setWeight(temp1);
		System.out.print("Enter slope(degree) : ");
		temp2 = input.nextDouble();
		slf.setSlopeFloor(temp2);
		System.out.print("Enter fraction : ");
		temp3 = input.nextDouble();
	
		System.out.println("You need "+ slf.getMinForce(box, temp3)	+" nwetons of force to push the box up the ramp.");
		
		input.close();
	}
}
