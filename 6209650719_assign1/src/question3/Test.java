//อาดีนัน อับดุลลลี
//6209650719
package question3;

import java.util.Scanner;
import java.util.Date;

public class Test {
		public static void main(String[] agrs) {
				Advertise obj = new Advertise();
				Scanner scan1 = new Scanner(System.in);
				Scanner scan2 = new Scanner(System.in);
				Scanner scan3 = new Scanner(System.in);
				Scanner scan4 = new Scanner(System.in);
				Scanner scan5 = new Scanner(System.in);
				String s1,s2,s3,s4,s5;
				Date now = new Date();
				
				System.out.print("Enter Your Name : ");
				s1 = scan1.nextLine();
				obj.setName(s1);
				System.out.print("Enter Massage : ");
				s2 = scan2.nextLine();
				obj.setMassage(s2);
				System.out.print("Enter Tag : ");
				s3 = scan3.nextLine();
				obj.setTag(s3);
				System.out.print("Enter Add Other Massage : ");
				s4 = scan4.nextLine();
				obj.setadMassage1(s4);
				System.out.print("Enter Add Other Massage : ");
				s5 = scan5.nextLine();
				obj.setaddMassage2(s5);
				System.out.print("\n");
				System.out.println(obj.getMassage()+"\n"+obj.getaddMassage1()+"\n"+obj.getadMassage2());
				System.out.print("\n");
				System.out.println("Tag: "+obj.getTag());
				System.out.println("By: "+obj.getName());
				System.out.printf("Date: "+"%td %tb %tY\n",now,now,now);
			
				scan1.close();
				scan2.close();
				scan3.close();
				scan4.close();
				scan5.close();
				
		}
}
