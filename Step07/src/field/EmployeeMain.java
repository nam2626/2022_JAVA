package field;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeNo = "A0213045";
		employee.employeeName = "홍길동";
		employee.departmentNo = "A3";
		employee.positionName = "대리";
		employee.salary = 360;
		
		System.out.println(employee.employeeNo);
		System.out.println(employee.employeeName);
		System.out.println(employee.departmentNo);
		System.out.println(employee.positionName);
		System.out.println(employee.salary);
	}

}
