package employee;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--- 사원 관리프로그램 ---");
			System.out.println("   1. 사원정보등록");
			System.out.println("   2. 전체사원정보 출력");
			System.out.println("   3. 사원정보검색");
			System.out.println("   4. 사원정보 삭제");
			System.out.println("   5. 사원정보 수정");
			System.out.println("   0. 프로그램 종료");
			System.out.print("   원하시는 번호를 입력하세요 : ");
			int no = sc.nextInt(); sc.nextLine();
			
			switch(no) {
			case 1:
				service.appendEmployee(sc);
				break;
			case 2:
				service.printAllEmployee();
				break;
			case 3:
				service.searchEmployee(sc);
				break;
			case 4:
				service.deleteEmployee(sc);
				break;
			case 5:
				service.updateEmployee(sc);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}






