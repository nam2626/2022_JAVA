package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentAppendController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 등록을 시작합니다.....");
		//학생정보 한건 입력 받기
		System.out.print("등록할 학번 : ");
		String studentNo = sc.nextLine();
		System.out.print("등록할 이름 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 평점 : ");
		double score = sc.nextDouble(); sc.nextLine();
		
		boolean result = StudentService.getInstance().appendStudentVO(
				new StudentVO(studentNo, studentName, majorName, score));
		
		if(result)
			System.out.println("학생 정보 등록을 성공하였습니다.");
		else
			System.out.println("학생 정보 등록을 실패하였습니다. 입력하신 데이터를 확인 하세요");
		
	}

}







