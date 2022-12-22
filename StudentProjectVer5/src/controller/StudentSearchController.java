package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentSearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 검색을 시작합니다........");
		//1. 검색할 학번 입력
		System.out.print("검색할 학번 : ");
		String studentNo = sc.nextLine();
		//2. 서비스 클래스로 검색할 학번을 보냄
		StudentVO vo = StudentService.getInstance().searchStudentVO(studentNo);
		//3. 검색 결과가 null이면 검색한 결과가 없습니다 라고 출력, null이 아니면 검색 결과를 출력
		if(vo == null)
			System.out.println("검색 결과가 없습니다.");
		else
			vo.printInfo();
		
	}

}









