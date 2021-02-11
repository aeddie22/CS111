package vectortest;

public class Vector {
	
	private int[] values ;
	
	public Vector(int[] arr) {
		this.values = arr ;
	}
	
	public Vector add(int[] arr2) {
		int[] arr3 = new int[arr2.length];
		for(int i = 0 ; i < arr3.length ; i++) {
			arr3[i] = arr3[i] + arr2[i]; 
		}
		return new Vector(arr3);
	}
	
	public double magnitude() {
		double sum =0 ;
		
		for (int elm: values) {
			sum = sum + Math.pow(elm,2.0) ;
		}
		return Math.sqrt(sum);
	}
	
	public static void main(String[] args) {
		int[] arr1 ={2, 4, -2};
		int[] arr2 = {3, 5, 9};
		
		Vector v1 = new Vector(arr1) ; 
		Vector v3 = v1.add(arr2);
		System.out.println("Summation of two Vector is : "+v3);
		System.out.println("Magnitude of vector :" + v3.magnitude());
	}


}
