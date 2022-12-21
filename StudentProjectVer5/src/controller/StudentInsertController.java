package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentInsertController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 등록을 시작합니다.....");
		try {
			// 학생정보 한건 입력 받기
			System.out.print("등록할 학번 : ");
			String studentNo = sc.nextLine();
			// 중복된 데이터가 있는지 체크
			if (StudentService.getInstance().searchStudentVO(studentNo) != null)
				throw new StudentException("학생 정보 등록을 실패하였습니다. 입력하신 데이터를 확인 하세요");

			System.out.print("등록할 이름 : ");
			String studentName = sc.nextLine();
			System.out.print("등록할 학과번호 : ");
			int majorNo = sc.nextInt();sc.nextLine();
			System.out.print("등록할 평점 : ");
			double score = sc.nextDouble();
			sc.nextLine();

			StudentService.getInstance().
				appendStudentVO(new StudentVO(studentNo, studentName, majorNo, score));

			System.out.println("학생 정보 등록을 성공하였습니다.");
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}

	}

}
