//อาดีนัน อับดุลลลี
//6209650719
package question5;

public class SlopeFloor {
	public final double GRAVITY = 9.8;
	private double slope;
	
	public void setSlopeFloor(double aSlope) {
		slope = aSlope;
	}
	public double getSlopeFloor() {
		return Math.toRadians(slope);
	}
	public double getMinForce(Box box,double friction) {
		double mg = box.getWeight()*GRAVITY;
		double sin = Math.sin(getSlopeFloor());
		double cos = Math.cos(getSlopeFloor());
		double force = mg * sin + friction * mg * cos;
		return force;
	}

}
