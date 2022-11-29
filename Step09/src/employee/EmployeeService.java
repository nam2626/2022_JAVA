package employee;

import java.util.Scanner;

public class EmployeeService {
	private Employee[] arr;
	private int idx;
	
	public EmployeeService() {
		arr = new Employee[5];
	}

	public void appendEmployee(Scanner sc) {
		System.out.println("사원정보 등록을 시작합니다.............");
		
		if(idx == arr.length) {
			System.out.println("더이상 저장할 공간이 없습니다.");
			return;
		}
		
		System.out.println("1 - 일반사원, 2 - 영업직, 3 - 파견직");
		System.out.print("등록할 사원 종류를 선택하세요 : ");
		int no = sc.nextInt(); sc.nextLine();
		
		System.out.print("등록할 사원 번호 : ");
		String employeeNo = sc.nextLine();
		System.out.print("등록할 사원 이름 : ");
		String employeeName = sc.nextLine();
		System.out.print("등록할 사원 기본급 : ");
		int salary = sc.nextInt(); sc.nextLine();
		
		switch(no) {
		case 1:
			arr[idx] = new Employee(employeeNo, employeeName, salary);
			break;
		case 2:
			System.out.print("인센티브 입력 : ");
			int bonus = sc.nextInt();
			arr[idx] = new SalaryEmployee(employeeNo, employeeName, salary, bonus);
			break;
		case 3:
			System.out.print("파견지 등급 입력(A,B,C) : ");
			char grade = sc.nextLine().charAt(0);
			arr[idx] = new DispatchEmployee(employeeNo, employeeName, salary, grade);
			break;
		}
		idx++;
		System.out.println("사원 정보 등록 완료");		
	}
	
	

}











