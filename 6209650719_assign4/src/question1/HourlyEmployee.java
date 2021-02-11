//อาดีนัน อับดุลลี
//6209650719
package question1;

public class HourlyEmployee extends Employee{

	public int workingSessionsPerMonth; //จำนวนกะต่อเดือน
	private int workingSessionsPerHours; //จำนวนชั่วโมงต่อกะ
	private final int MIN_HOURLY_WAGE_RATE = 50; //อัตราค่าจ้างขั้นต่ำ
	private int hourlyWage;
	private int monthlyPayment;
	
	public HourlyEmployee() {
		workingSessionsPerHours = 8;
	}
	void setWorkingSessionsPerMonth(int workingSessionsPerMonth) {
		this.workingSessionsPerMonth = workingSessionsPerMonth;
	}
	
	int getWorkingSessionsPerMonth() {
		return workingSessionsPerMonth;
	}
	
	public int calculatePersonalHourltWage() { //คำนวณค่าจ้างรายบุคคล ถ้าประสิทธิภาพ 0-5 = อัตราค่าจ้างขั้นต่ำ
		//ถ้ามากกว่า 5 จะได้ค่าจ้างรายชั่วโมงเพิ่ม 10% ของค่าจ้างขั้นต่ำ
		if(super.performanceScore <= 5) {
			hourlyWage = MIN_HOURLY_WAGE_RATE;
		}else if(super.performanceScore == 6) {
			hourlyWage = MIN_HOURLY_WAGE_RATE +(10*100/MIN_HOURLY_WAGE_RATE);
		}else if(super.performanceScore == 7) {
			hourlyWage = MIN_HOURLY_WAGE_RATE +(20*100/MIN_HOURLY_WAGE_RATE);
		}else if(super.performanceScore == 8) {
			hourlyWage = MIN_HOURLY_WAGE_RATE +(30*100/MIN_HOURLY_WAGE_RATE);
		}else if(super.performanceScore == 9) {
			hourlyWage = MIN_HOURLY_WAGE_RATE +(40*100/MIN_HOURLY_WAGE_RATE);
		}else if(super.performanceScore == 10) {
			hourlyWage = MIN_HOURLY_WAGE_RATE +(50*100/MIN_HOURLY_WAGE_RATE);
		}
		
		return hourlyWage;
	}
	@Override
	public void getMonthlyPayment() {
		// TODO Auto-generated method stub
		monthlyPayment = workingSessionsPerMonth * (workingSessionsPerHours * hourlyWage);
	}
	
	public int getMonthlyPay() {
		return monthlyPayment;
	}
	
	
}
