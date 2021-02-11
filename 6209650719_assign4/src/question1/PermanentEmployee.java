//อาดีนัน อับดุลลี
//6209650719
package question1;

public class PermanentEmployee extends Employee {
	
	private int salary;
	private double socialSecurityRemittance;
	
	
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	int getSalary() {
		return salary;
	}
	
	double getSocialSecurityRemittance() {
		return socialSecurityRemittance;
	}
	@Override
	public void getMonthlyPayment() {
		// TODO Auto-generated method stub
		if(salary < 15000 ) {
			socialSecurityRemittance = 600;
			if(super.performanceScore >= 8) {
				salary = salary+(salary*3/100);
			}
			salary = (int) (salary - socialSecurityRemittance);
		}else if(salary >= 15000) {
			socialSecurityRemittance = 750;
			if(super.performanceScore >= 8) {
				salary = salary+(salary*3/100);
			}
			salary = (int) (salary - socialSecurityRemittance);
		}
	}

}
