package list;

import java.util.ArrayList;

public class ListExample {
	/*
	 * List의 특징
	 * 		1. 데이터 중복 O
	 * 		2. 리스트에 등록된 데이터 순서가 보장됨
	 * 
	 * 		ArrayList : 리스트에서 데이터를 배열로 관리
	 * 
	 */
	public static void main(String[] args) {
		//리스트 생성한 부분,  <저장할 데이터 타입(레퍼런스형만 가능)>
		ArrayList<String> list = new ArrayList<String>();
		//데이터 추가
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("HTML/CSS"); //중복된 데이터도 저장됨
		list.add("jsp");
		
		System.out.println(list);
		
		//데이터 삭제 - 인덱스 번호로 삭제
		list.remove(1);
		System.out.println(list);
		//데이터 삭제 - 값을 이용해서 삭제 ---> equals()를 재정의 해야됨
		list.remove("java");
		System.out.println(list);
		
		//리스트에 저장된 데이터 개수
		System.out.println(list.size());
		
		//해당 데이터가 리스트에 있는지?
		System.out.println(list.contains("android"));
		System.out.println(list.contains("jsp"));
		
		//리스트에 있는 모든 데이터를 삭제
//		list.clear();
//		System.out.println(list);
		//리스트에 내용이 비어있는지 체크
		System.out.println(list.isEmpty());
		
		//리스트에 원하는 데이터를 원하는 위치에 추가
		list.add(1,"android");
		System.out.println(list);
		
		//리스트에 있는 모든 데이터를 하나씩 꺼내기
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}









