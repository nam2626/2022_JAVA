package controller;

import java.util.ArrayList;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentPrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().getList();
		try {
			if (list.isEmpty())
				throw new StudentException("출력할 데이터가 하나도 없습니다.");
			
			for (StudentVO vo : list) {
				System.out.println(vo);
			}

		} catch (StudentException e) {
			System.out.println(e.getMessage());
			StudentService.getInstance().printLog(e.getMessage());
		}
	}

}






