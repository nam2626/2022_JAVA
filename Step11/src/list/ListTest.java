package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> lList = new LinkedList<Integer>();
		long start, end;
		
		start = System.nanoTime();
		
		for(int i = 0 ;i<10000000;i++)
			aList.add(i);		
		
		end = System.nanoTime();
		
		System.out.println("ArrayList : " + (end-start));
		
		start = System.nanoTime();
		
		for(int i = 0 ;i<10000000;i++)
			lList.add(i);		
		
		end = System.nanoTime();
		
		System.out.println("LinkedList : " + (end-start));
		
		//-----------------------------------
		/*
		 * start = System.nanoTime();
		 * 
		 * for(int i = 0 ;i<10000000;i++) aList.get(i);
		 * 
		 * end = System.nanoTime();
		 * 
		 * System.out.println("ArrayList : " + (end-start));
		 * 
		 * start = System.nanoTime();
		 * 
		 * for(int i = 0 ;i<10000000;i++) lList.get(i);
		 * 
		 * end = System.nanoTime();
		 * 
		 * System.out.println("LinkedList : " + (end-start));
		 */
		start = System.nanoTime();
		
		aList.add(7544350, 100);
		aList.remove(3544350);
		
		end = System.nanoTime();
		
		System.out.println("ArrayList : " + (end-start));
		
		start = System.nanoTime();
		
		lList.add(7544350, 100);
		lList.remove(3544350);
		
		end = System.nanoTime();
		
		System.out.println("LinkedList : " + (end-start));
		
	}

}




