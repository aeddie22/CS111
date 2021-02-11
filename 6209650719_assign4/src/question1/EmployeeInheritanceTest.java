//อาดีนัน อับดุลลี
//6209650719
package question1;

import java.util.ArrayList;

public class EmployeeInheritanceTest {

	//private ArrayList<Employee> List1 = new ArrayList<Employee>();
	
	public static void printMonthlyPaymentSlip(ArrayList<Employee> list) {
	
		
	}
	public static void main(String[] args) {
		PermanentEmployee m1 = new PermanentEmployee();
		PermanentEmployee m2 = new PermanentEmployee();
		HourlyEmployee m3 = new HourlyEmployee();
		HourlyEmployee m4 = new HourlyEmployee();
		HourlyEmployee m5 = new HourlyEmployee();
		
		m1.setFullName("Somchai-Hankla");
		m1.setAge(25);
		m1.setDepartment("IT");
		m1.setPerformanceScore(8);
		m1.setSalary(20000);
		m1.getMonthlyPayment();
		
		m2.setFullName("Somsong-Bunthum");
		m2.setAge(22);
		m2.setDepartment("IT");
		m2.setPerformanceScore(4);
		m2.setSalary(12000);
		m2.getMonthlyPayment();
		
		m3.setFullName("Manee-Dumkum");
		m3.setAge(21);
		m3.setDepartment("Production");
		m3.setWorkingSessionsPerMonth(25);
		m3.setPerformanceScore(6);
		m3.getMonthlyPayment();
		
		m4.setFullName("Piti-Rukthai");
		m4.setAge(25);
		m4.setDepartment("Production");
		m4.setWorkingSessionsPerMonth(30);
		m4.setPerformanceScore(5);
		m4.getMonthlyPayment();
		
		m5.setFullName("Veera-Rukdee");
		m5.setAge(30);
		m5.setDepartment("Production");
		m5.setWorkingSessionsPerMonth(20);
		m5.setPerformanceScore(8);
		m5.getMonthlyPayment();
		
		System.out.println("********************************\n");
		System.out.printf("Payment Slip Of %s", m1.getFullName().toUpperCase());
		System.out.println("\n\n********************************");
		System.out.printf("First Name: %s \tLast Name : %s\n" + 
				"Department: %s \tAge: %d\n" + 
				"Monthly Payment: %d baht Social Security: %.2f baht",m1.getName(),m1.getLastName()
				,m1.getDepartment(),m1.getAge(),m1.getSalary(),m1.getSocialSecurityRemittance());
	
		System.out.println("\n\n\n********************************\n");
		System.out.printf("Payment Slip Of %s", m2.getFullName().toUpperCase());
		System.out.println("\n\n********************************");
		System.out.printf("First Name: %s \tLast Name : %s\n" + 
				"Department: %s \tAge: %d\n" + 
				"Monthly Payment: %d baht Social Security: %.2f baht",m2.getName(),m2.getLastName()
				,m2.getDepartment(),m2.getAge(),m2.getSalary(),m2.getSocialSecurityRemittance());
		
		System.out.println("\n\n\n********************************\n");
		System.out.printf("Payment Slip Of %s", m3.getFullName().toUpperCase());
		System.out.println("\n\n********************************");
		System.out.printf("First Name: %s \tLast Name : %s\n" + 
				"Department: %s \tAge: %d\n" + 
				"Monthly Payment: %d baht",m3.getName(),m3.getLastName()
				,m3.getDepartment(),m3.getAge(),m3.calculatePersonalHourltWage()*8*m3.getWorkingSessionsPerMonth());
		
		System.out.println("\n\n\n********************************\n");
		System.out.printf("Payment Slip Of %s", m4.getFullName().toUpperCase());
		System.out.println("\n\n********************************");
		System.out.printf("First Name: %s \tLast Name : %s\n" + 
				"Department: %s \tAge: %d\n" + 
				"Monthly Payment: %d baht",m4.getName(),m4.getLastName()
				,m4.getDepartment(),m4.getAge(),m4.calculatePersonalHourltWage()*8*m4.getWorkingSessionsPerMonth());
		
		System.out.println("\n\n\n********************************\n");
		System.out.printf("Payment Slip Of %s", m5.getFullName().toUpperCase());
		System.out.println("\n\n********************************");
		System.out.printf("First Name: %s \tLast Name : %s\n" + 
				"Department: %s \tAge: %d\n" + 
				"Monthly Payment: %d baht",m5.getName(),m5.getLastName()
				,m5.getDepartment(),m5.getAge(),m5.calculatePersonalHourltWage()*8*m5.getWorkingSessionsPerMonth());
	}
}
