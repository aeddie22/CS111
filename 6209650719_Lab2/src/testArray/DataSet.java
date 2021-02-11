package testArray;

public class DataSet {
	private double[] data;
	private int dataSize;
	
	public DataSet() {
		data = new double[100];
		dataSize = 0;
	}
	
	public void add(double x) {
		if(dataSize >= data.length) {
			double[]data2 = new double[data.length*2];
			System.arraycopy(data, 0, data2, 0, data.length);
			data = data2;
		}
		data[dataSize] = x;
		dataSize++;
		
	}
	
	public double getAverage() {
		double total = 0;
		for (double elm : data) {
			total = total + elm;
		}
		return total/dataSize;
	}
	
	
	public static void main(String[] args) {
		DataSet set = new DataSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(100);
		set.add(4);
		set.add(39);
		System.out.println(set.getAverage());
	}

}
