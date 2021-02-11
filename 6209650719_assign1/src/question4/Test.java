//อาดีนัน อับดุลลลี
//6209650719
package question4;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		Scanner input = new Scanner(System.in);
		double temp1,temp2;
		
		System.out.print("Enter your car's distance : ");
		temp1 = input.nextDouble();
		car.setDistance(temp1);
		System.out.print("Enter your car's efficiency : ");
		temp2 = input.nextDouble();
		car.setEfficiency(temp2);
		
		System.out.println("Your car's profile : ");
		System.out.println("\t"+"Efficiency (km/l): "+car.getEfficiency());
		System.out.println("\t"+"Distance (km/year): "+car.getDistance());
		System.out.println("\t"+"Consumption for 100 km (liter): "+car.getConsumption(100));
		System.out.println("\t"+"Consumption per year (liter): "+car.getConsumptionPerYear());
		System.out.println("\t"+"CO2 emission (g/km): "+car.getCO2Emission());
		System.out.println("\t"+"CO2 emission per year (tons): "+car.getCO2EmissionPerKM());
		
		input.close();
	}
}
