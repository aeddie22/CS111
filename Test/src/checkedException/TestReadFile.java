package checkedException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestReadFile {
    //Define a Service Method.
    public int countAndDisplayData(String fileName) throws FileNotFoundException, 
            InputMismatchException, InvalidInputValueException {
        //สร้าง object ประเภท File เพื่อเชื่อมต่อกับ ไฟล์ชื่อ fileName
        File f1 = new File(fileName);
        Scanner sc = null ;
        int count = 0 ;
        //สร้าง Scanner object เพื่อเชื่อมต่อกับ object ประเภท File เพื่อใช้เป็น data source
        //Scanner scanner = new Scanner(System.in) ;
        //การครอบ block try-catch  เพื่อดักจับ exception
        try {
            sc = new Scanner(f1);
            System.out.println("Successful Open File:" + fileName);
            
            while(sc.hasNext()) {
                int input =  sc.nextInt();
                if(input > 0) {
                    System.out.println(input);
                    count++;
                }else {
                    System.out.println(input);
                    throw new InvalidInputValueException("Input Value=" + input 
                            + " is invalid, it must be positive integer.");
                }
            }
        }catch(FileNotFoundException e) {
            //code to handle FileNotFound Exception
        }catch(InputMismatchException ex) {
            System.out.println("Input is not Integer");
            //ex.getMessage();
            //ex.printStackTrace();
        }catch(InvalidInputValueException e) {
            System.out.println("Invalid Input");
            System.out.println(e.getMessage());
            e.printStackTrace(); // ใช้ในการแสดงลำดับการเรียกใช้เมธอดตั้งแต่ต้นจนถึงบรรทัดที่เกิด Exception
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            if(sc != null) {
                sc.close(); // close resource
                System.out.println("close Scanner");
            }
        }    
        return count ;
    }
  
    public void writeContentToFile(String destinationFileName) {
    	FileWriter fileWriter = null ;
        PrintWriter printWriter = null ;
        try{
            fileWriter = new FileWriter(destinationFileName);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Songsakdi Rongviriyapanish");
            printWriter.println(1234);
            printWriter.flush(); //จำเป็นต้องมีเสมอหลังจากการเขียนไฟล์เสร็จเรียบร้อย
        }catch(IOException e) {
            System.out.println("Error when open File: " + destinationFileName);
            System.out.println(e.getMessage());
        }finally {
            if(printWriter != null)
                printWriter.close();
        }
    }
    
    public void copyFile(String sourceFileName,String destinationFileName) {
    		File file = null;
    		Scanner sc = null;
    		FileWriter fileWriter = null;
    		PrintWriter printWriter = null;
    	try{
    		file = new File(sourceFileName); // Data source for Input
    		sc = new Scanner(file);// Create scanner for reading data from Data source
    		fileWriter =  new FileWriter(destinationFileName); //Output Data source	
    		printWriter = new PrintWriter(fileWriter);//Create Writer for writing data to Data source
    		while(sc.hasNext()) {
    			String input = sc.nextLine();
    			printWriter.println(input);
    		}
    		//Flush output before closing file
    		printWriter.flush();
    	}catch(Exception ex){
    		System.out.println(ex.getMessage());
    	}finally {
    		sc.close();
    		printWriter.close();
    	}
    }
   
    //Client of Service Method
    public static void main(String[] args) {
        TestReadFile   o = new TestReadFile();
       /* try {
           int countData = o.countAndDisplayData("/Users/adeenunabdullee/eclipse-workspace/Test/src/checkedException/sample.data");
            System.out.println("Data Count: " +countData);
        } catch(FileNotFoundException e) {
            
        } catch(InputMismatchException e) {
            
        } catch(InvalidInputValueException e) {
            
        }*/
        o.writeContentToFile("/Users/adeenunabdullee/eclipse-workspace/Test/src/checkedException/sample.data2");
        o.copyFile("/Users/adeenunabdullee/eclipse-workspace/Test/src/checkedException/sample.data", "/Users/adeenunabdullee/eclipse-workspace/Test/src/checkedException/copy1.data");
    }

 

}