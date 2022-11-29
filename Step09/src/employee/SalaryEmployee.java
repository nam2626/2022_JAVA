package employee;

public class SalaryEmployee extends Employee{
	private int bonus;

	public SalaryEmployee(String employeeNo, String employeeName, int salary, int bonus) {
		super(employeeNo, employeeName, salary);
		this.bonus = bonus;
	}
	
	@Override
	public int calcSalary() {
		//super가 부모를 지칭하기 떄문에 부모가 가지고 있는 calcSalary를 실행
		return super.calcSalary() + bonus;
	}
	
	
	
}
