package checkedException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestReadFile2 {
	
	//Define a Service Method.
	public int countAndDisplayData(String fileName) {
		File f1 = new File(fileName);
		try {
			Scanner sc = new Scanner(f1);
			System.out.println("Successful found: "+fileName+" !");
			sc.close();
			return 1;
		}catch(FileNotFoundException ex) {
			System.out.println("File named: "+fileName+" not found.");
			return 0;
		}
		
	}
	//Client of Service Method.
	public static void main(String[] args) {
		TestReadFile2 o = new TestReadFile2();
		int countData = o.countAndDisplayData("/Users/adeenunabdullee/eclipse-workspace/Test/src/checkedException/sample.data");
		System.out.println(countData);
	}
}
