package employee;

public class DispatchEmployee extends Employee {
	private char grade;

	public DispatchEmployee(String employeeNo, String employeeName, int salary, char grade) {
		super(employeeNo, employeeName, salary);
		this.grade = grade;
	}
	
	@Override
	public int calcSalary() {
		double ratio = 0.08;
		if(grade == 'A') ratio = 0.3;
		if(grade == 'B') ratio = 0.15;
//		return super.calcSalary() + (int)(super.calcSalary() * ratio);
		return (int)(super.calcSalary() * (1 + ratio));
	}
}
