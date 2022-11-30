package employee;

import java.util.Scanner;

public class EmployeeService {
	private Employee[] arr;
	private int idx;
	
	public EmployeeService() {
		arr = new Employee[5];
		arr[idx++] = new Employee("A0001", "홍길동", 300);
		arr[idx++] = new SalaryEmployee("A0002", "김철수", 200, 90);
		arr[idx++] = new DispatchEmployee("A0003", "박영수", 400,'A');
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

	public void printAllEmployee() {
		System.out.println("전체 사원 정보를 출력합니다.............");
		if(idx == 0) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		
		for(int i=0;i<idx;i++) {
			arr[i].printEmployeeInfo();
		}
		System.out.println();
	}

	public int searchEmployee(Scanner sc) {
		System.out.println("사원정보 검색을 시작합니다...........");
		System.out.print("검색할 사번을 입력하세요 : ");
		String employeeNo = sc.nextLine();
		
		for(int i=0;i<idx;i++) {
			if(arr[i].getEmployeeNo().equals(employeeNo)) {
				System.out.println("검색결과");
				arr[i].printEmployeeInfo();
				return i;
			}
		}
		System.out.println("찾는 사원 정보가 없습니다.");
		return -1; 
	}
	
	public void deleteEmployee(Scanner sc) {
		System.out.println("사원정보 삭제를 시작합니다......");
		int d = searchEmployee(sc);//삭제할 사원정보 검색
		
		if(d==-1) { 
			System.out.println("사원 정보 삭제 실패.");
			return;
		}
		
		for(int i=d;i<idx-1;i++)
			arr[i] = arr[i+1];
		
		idx--;
		System.out.println("사원정보 삭제 성공.");
	}

	public void updateEmployee(Scanner sc) {
		System.out.println("사원정보 수정작업을 시작합니다........");
		int r = searchEmployee(sc);
		if(r == -1) {
			System.out.println("수정할 사원 정보가 없습니다.");
			return;
		}
		
		System.out.print("수정할 사원명 : ");
		arr[r].setEmployeeName(sc.nextLine());
		System.out.print("수정할 기본급 : ");
		arr[r].setSalary(sc.nextInt()); sc.nextLine();
		
		//instanceof를 사용경우
		if(arr[r] instanceof DispatchEmployee) {
			System.out.print("수정할 파견지 등급 입력(A,B,C) : ");
			((DispatchEmployee)arr[r]).setGrade(sc.nextLine().charAt(0));
		}else if(arr[r] instanceof SalaryEmployee) {
			System.out.print("수정할 인센티브 입력 : ");
			((SalaryEmployee)arr[r]).setBonus(sc.nextInt()); sc.nextLine();
		}
		//Class의 getName 이용하는 방법
		
		System.out.println("사원 정보 수정이 끝났습니다.");
	}

}











