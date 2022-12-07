package controller;

import java.util.Scanner;

import service.StudentService;

public class ExportController implements Controller {

	@Override
	public void execute(Scanner sc) {
		StudentService.getInstance().exportCSV();
		System.out.println("파일 내보내기 완료");
	}

}
