package controller;

import java.util.ArrayList;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentTop3SelectController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().selectTop3StudentVO();
		
		try {
			if(list.isEmpty()) {
				throw new StudentException("출력할 학생 정보가 없습니다.");
			}
			for(StudentVO vo : list) {
				vo.printInfo();
			}
		}catch (StudentException e) {
			System.out.println(e.getMessage());
		}
				
				

	}

}









