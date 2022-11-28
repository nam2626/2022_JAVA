package array;

import java.io.IOException;
import java.util.Scanner;

public class ArrayAppendTest {

	public static void main(String[] args) {
		// Student 형 배열 길이가 5인 배열을 생성
		Student[] arr = new Student[5];
		Scanner sc = new Scanner(System.in);
		// 학생정보 3건을 입력을 받아서, 배열에 저장
		int index = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("학번 : ");
			String sno = sc.nextLine();
			System.out.print("이름 : ");
			String n = sc.nextLine();
			System.out.print("학과명 : ");
			String m= sc.nextLine();
			System.out.print("평점 : ");
			double s = sc.nextDouble();
			sc.nextLine();//정수 및 숫자 입력 후 줄바꿈 문자 제거
			arr[index] = new Student(sno, n, m, s);
			index++;
		}
		// 입력된 전체 학생정보를 일괄 출력
		for(int i=0;i<index;i++)
			arr[i].printStudentInfo();

	}

}


