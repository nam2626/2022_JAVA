package employee;
/*
 *  직원 클래스는 사번, 이름, 기본급을 가지고 있습니다.
 *  기능으로는 사원정보 출력, 급여 계산하는 기능을 가지고 있습니다.
 *  사원정보 출력시 나타낼 내용은 사번 - 이름 - 급여 출력.
 *  생성자는 모든 필드를 초기화하는 기능으로 작성
 *  급여 = 기본급 
 */
public class Employee {
	private String employeeNo;
	private String employeeName;
	private int salary;
	
	public Employee(String employeeNo, String employeeName, int salary) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public int calcSalary() {
		return salary;
	}
	
	public void printEmployeeInfo() {
		System.out.println(employeeNo + " " + employeeName + " " + calcSalary());
	}
	
}






