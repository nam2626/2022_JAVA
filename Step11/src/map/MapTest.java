package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * Map
	 * 		키(Key)값을 이용해서 데이터(Value)를 저장, 삭제, 읽기, 수정
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//데이터 추가
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 400);
		map.put("A", 500);//기존값을 지우고 새값을 저장 - 똑같은 키값이면 수정
		
		System.out.println(map);
		System.out.println(map.get("C"));//데이터를 꺼낼때도 키값을 이용
		//전체 데이터 꺼내기
		Set<String> set = map.keySet();//저장된 키값을 Set으로 가져옴
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " - " + map.get(key));
		}
		
		//맵에 저장된 개수
		System.out.println(map.size());
		//맵에 해당하는 키값이 있는지?
		System.out.println(map.containsKey("B"));
		System.out.println(map.containsKey("E"));
		System.out.println(map.get("E")); //키값이 없으면 null이 리턴
		//맵에 해당하는 값이 있는지?
		System.out.println(map.containsValue(200));
		System.out.println(map.containsValue(600));
		//맵에 값이 비어있는지?
		System.out.println(map.isEmpty());
		//맵 내용 비우기
//		map.clear();
//		System.out.println(map);
		//데이터 삭제
		map.remove("A");
		System.out.println(map.remove("B"));
		System.out.println(map);
	}

}











