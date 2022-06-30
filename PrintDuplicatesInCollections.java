package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInCollections {
	public static void main(String[] args) {
		Integer[] input = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		 List<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		 Collections.sort(list);
		 System.out.println(list);
		 
		 Set<Integer> set = new HashSet<Integer>();
		 for(Integer var : list)  
		 {
			 if((list.indexOf(var))!=(list.lastIndexOf(var)))
				 set.add(var);
		 }
		 System.out.println("The Duplicates are = "+set);
		 
	}

}
