//อาดีนัน อับดุลลลี
//6209650719
package question4;

public class Vehicle {
	private double distance;
	private double efficiency;
	
	public void setDistance(double dis) {
		distance = dis;
	}
	public double getDistance() {
		return distance;
	}
	public void setEfficiency(double eff) {
		efficiency = eff;
	}
	public double getEfficiency() {
		return efficiency;
	}
	public double getConsumptionPerYear() {
		double counsumptionPerYear = distance/efficiency;
		return counsumptionPerYear;
	}
	public double getConsumption(double range) {
		double consumption = range/efficiency;
		return consumption;
	}
	public double getCO2EmissionPerKM() {
		double CO2EmissionPerKM = 2392.5/12.5;
		return CO2EmissionPerKM;
	}
	public double getCO2Emission() {
		double CO2Emission = getCO2EmissionPerKM() * distance / Math.pow(10,6);
		return CO2Emission;
	}
}
