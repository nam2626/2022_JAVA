package map;

import java.util.HashMap;

public class MapObjectTest {

	public static void main(String[] args) {
		//HashMap 하나 생성
		HashMap<String, Person> map = new HashMap<String, Person>();
		//Person 객체 맵에 5건 저장 - 키값은 이름, 값 - Person객체
		map.put("홍길동", new Person("홍길동",20));
		map.put("김철수", new Person("김철수",30));
		map.put("이영희", new Person("이영희",40));
		map.put("박영수", new Person("박영수",50));
		map.put("이수영", new Person("이수영",60));
		
		System.out.println(map.containsValue(new Person("이영희",40)));
	}

}









