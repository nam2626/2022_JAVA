package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;

public class StudentDeleteController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다........");
		//1. 삭제할 학번 입력
		System.out.print("삭제할 학번 : ");
		String studentNo = sc.nextLine();
		try {
			//2. 삭제할 기능 실행 후 결과 출력
			StudentService.getInstance().deleteStudentVO(studentNo);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}
}











