package service;

import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	private StudentVO[] arr;
	private int idx;
	
	public StudentService() {
		arr = new StudentVO[10];
	}
	
	//학생정보 추가
	public void appendStudent(Scanner sc) {
		System.out.println("학생정보 등록 작업을 시작합니다....");
		
		if(arr.length == idx) {//저장할 공간이 있는지 체크
			System.out.println("더 이상 등록할 공간이 없습니다.");
			return;
		}
		
		System.out.print("등록할 학생번호 : ");
		String studentNo=sc.nextLine();
		System.out.print("등록할 학생이름 : ");
		String studentName=sc.nextLine();
		System.out.print("등록할 학과명 : ");
		String majorName=sc.nextLine();
		System.out.print("등록할 평점 : ");
		double score=sc.nextDouble(); sc.nextLine();
		
		arr[idx++] = new StudentVO(studentNo, studentName, majorName, score);
		System.out.println("학생정보 등록 작업이 완료되었습니다.");
	}
	
	//전체 학생정보 출력

	//학생정보 검색
	
	//학생정보 삭제
	
	//학생정보 수정
	
}





