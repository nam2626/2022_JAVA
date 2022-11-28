package main;

import java.util.Scanner;

import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
		while(true) {
			System.out.println("--- 학생관리 프로그램 ---");
			System.out.println("   1. 학생정보 등록");
			System.out.println("   2. 학생정보 전체출력");
			System.out.println("   3. 학생정보 검색");
			System.out.println("   4. 학생정보 삭제");
			System.out.println("   5. 학생정보 수정");
			System.out.println("   0. 프로그램 종료");
			System.out.print("   원하시는 번호를 입력하세요 : ");
			int no = sc.nextInt(); sc.nextLine();
			
			switch(no) {
			case 1:
				service.appendStudent(sc);
				break;
			case 2:
				service.printAllStudentInfo();
				break;
			case 3:
				service.searchStudentInfo(sc);
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

}






