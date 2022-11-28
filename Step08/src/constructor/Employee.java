package constructor;

public class Employee {
	//사번
	private String employeeNo;
	//이름
	private String employeeName;
	//부서명
	private String department;
	//직급명
	private String positionName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeNo, String employeeName, String department, String positionName) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.department = department;
		this.positionName = positionName;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", department=" + department
				+ ", positionName=" + positionName + "]";
	}

	
	
	
	
}







