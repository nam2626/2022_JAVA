package math;

import java.util.HashSet;

public class Lotto3 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() < 6) {
			set.add((int)Math.floor(Math.random() * 45) + 1);
		}
		System.out.println(set);
	}

}
