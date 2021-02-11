package exTest;

public class SmartHouse {
	
	private boolean[] lights;
	
	public SmartHouse(int number) {
		lights = new boolean[number];
	}
	
	public void setLight(int lightNo, boolean status) {
		lights[lightNo] = status;
	}
	
	public void setLight(String status) {
		String[] a = status.split(";");
		for(int i = 0 ; i < lights.length ; i++) {
			if(a[i].charAt(0) == '1') {
				lights[i] = true;
			}else if(a[i].charAt(0) == '0') {
				lights[i] = false;
			}
		}
	}
	
	public void printLightStatus() {
		for(int i = 0 ; i < lights.length ; i++) {
			if(lights[i] == true) {
				System.out.println("Light "+i+" is ON");
			}else if(lights[i] == false) {
				System.out.println("Light "+i+" is OFF");
			}
			
		}
	}
}
