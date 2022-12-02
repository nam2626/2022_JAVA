package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentDeleteController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다........");
		//1. 삭제할 학번 입력
		System.out.print("삭제할 학번 : ");
		String studentNo = sc.nextLine();
		//2. 삭제할 기능 실행 후 결과 출력
		if(StudentService.getInstance().deleteStudentVO(new StudentVO(studentNo, null, null, 0)))
			System.out.println("학생 데이터 삭제 성공");
		else
			System.out.println("학생 데이터 삭제 실패");
	}

}











