package math;

import java.util.ArrayList;

public class Lotto1 {

	public static void main(String[] args) {
		// 로또번호 1셋트를 생성해서 출력
		// 로또번호 범위 1~45, 총 6개 숫자를 뽑음, 숫자는 중복 X
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (list.size() < 6) {
			int n = (int) (Math.floor(Math.random() * 45) + 1);
			if (list.contains(n))
				continue;
			list.add(n);
		}
		System.out.println(list);
	}

}
