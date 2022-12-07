package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = 0;
		do {
			System.out.println("--- 학생관리 프로그램 ---");
			System.out.println("   1. 학생정보 등록");
			System.out.println("   2. 학생정보 전체출력");
			System.out.println("   3. 학생정보 검색");
			System.out.println("   4. 학생정보 삭제");
			System.out.println("   5. 학생정보 수정");
			System.out.println("   6. 학생정보 CSV로 내보내기");
			System.out.println("   0. 프로그램 종료");
			System.out.print("   원하시는 번호를 입력하세요 : ");
			no = sc.nextInt(); sc.nextLine();
			Controller controller = HandlerMapping.getInstance().createController(no);
			if(controller != null)
				controller.execute(sc);
		}while(no != 0);
	}

}






