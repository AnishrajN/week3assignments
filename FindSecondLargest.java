package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		 Integer[] input = {3,2,11,4,6,7,13,18};
		 
		 List<Integer> list = new ArrayList<Integer>();
		 for(int i=0 ; i<input.length ;i++)
		 {
			 list.add(input[i]);
		 }
		 System.out.println(list);
		 Collections.sort(list);    // to sort a List,set,map we use collections.list,set,map
		 System.out.println("The Second Largest Number is = "+list.get(list.size()-2));// by using this size()-2 we can find the second largest number
		 
	}

}
