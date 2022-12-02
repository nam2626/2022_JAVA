package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	/*
	 * Set 1. 중복 X 2. 자동 정렬
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		// 데이터 등록
		set.add("HTML/CSS");
		set.add("js/jQuery");
		set.add("JAVA");
		set.add("Spring");
		set.add("js/jQuery");
		set.add("Android");
		set.add("JAVA");
		
		System.out.println(set);
		
		//JAVA 삭제
		System.out.println(set.remove("JAVA"));
		System.out.println(set);
		
		//데이터 개수 체크
		System.out.println(set.size());
		//데이터 검색 - 있는지 체크
		System.out.println(set.contains("Spring"));
		//set 내용비우기
//		set.clear();
		//set이 비었냐?
		System.out.println(set.isEmpty());
		
		//전체 조회 - 1
		Object[] arr1 = set.toArray();
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		String[] arr2 = new String[set.size()];
		String[] arr3 = set.toArray(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	 	
		//전체 조회 - 2
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}


















