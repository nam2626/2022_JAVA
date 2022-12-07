package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotePadFin {
	public static void write(Scanner sc) {
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
	}
	public static void read(Scanner sc) {
		System.out.println("읽어 들일 텍스트 파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName + ".txt");
			br = new BufferedReader(fr);
			
			String str = null;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 텍스트 파일 작성");
			System.out.println("2. 텍스트 파일 읽기");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 : ");
			int no = sc.nextInt(); sc.nextLine();
			
			if(no == 1)
				write(sc);
			else if(no == 2)
				read(sc);
			else if(no == 0)
				break;
		}
	}

}
















