package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotePad {
	/*
	 * 파일명을 사용자로부터 입력 받아서 파일을 생성을 한 후 사용자로부터 문자열을 입력 받아서 입력 받은 내용을 생성한 파일에 출력. 단
	 * exit라는 단어를 입력하면 사용자로부터 입력 종료 오픈한 파일 역시 close 작업을 수행
	 * 
	 * FileWriter, PrintWriter, Scanner
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FileWriter fw = null;
		PrintWriter pw = null;

		System.out.print("파일명을 입력하세요 : ");
		String fileName = sc.nextLine();

		try {
			fw = new FileWriter(fileName + ".txt");
			pw = new PrintWriter(fw);
			System.out.println("메모장에 내용을 입력하세요");
			while (true) {
				String str = sc.nextLine();
				if(str.equals("exit")) break;
				pw.println(str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			pw.close();
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}
}



