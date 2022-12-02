package set;

import java.util.HashSet;
import java.util.Iterator;

public class PersonTest {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person("김철수", 20));
		set.add(new Person("홍길동", 30));
		set.add(new Person("박문수", 40));
		set.add(new Person("김철수", 20));
		
		Iterator<Person> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}







