package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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

}








