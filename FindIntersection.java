package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		int size1 = list1.size();
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		int size2 = list2.size();
		
		for (int i=0 ; i<size1 ; i++) {
			Integer integer1 = list1.get(i);
			for (int j=0 ; j<size2 ; j++) {
				Integer integer2 = list2.get(j);
				if(integer1==integer2) {
					System.out.println(integer1);
				}
			}
		} 	
	}
}
