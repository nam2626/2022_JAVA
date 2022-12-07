package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentUpdateController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다.....");
		try {
			System.out.print("수정할 학번 : ");
			String studentNo = sc.nextLine();
			// 입력된 학번을 기준으로 검색 결과를 받아옴
			StudentVO vo = StudentService.getInstance().searchStudentVO(studentNo);
			// vo가 null이면 수정할 데이터가 없다.
			if (vo == null) {
				throw new StudentException("수정할 데이터가 없습니다.");
			}
			System.out.print("수정할 이름 : ");
			vo.setStudentName(sc.nextLine());
			System.out.print("수정할 학과명 : ");
			vo.setMajorName(sc.nextLine());
			System.out.print("수정할 평점 : ");
			String score = sc.nextLine();
			vo.setScore(Double.parseDouble(score));
			StudentService.getInstance().fileSave();
			System.out.println("학생정보 수정이 완료되었습니다.");
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println("잘못된 데이터를 입력했습니다.");
		}
	}

}









