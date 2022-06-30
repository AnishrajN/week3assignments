package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {
	public static void main(String[] args) {
		Integer[] input = {1,2,3,4,7,6,8,9,10};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0 ; i<input.length ; i++)
		{
			list.add(i);   //storing all array elements in list to proceed sorting
		}
		Collections.sort(list);
		for(int i=1 ; i<input.length ; i++ ) 
		{
			if(i!=input[i-1]){
			System.out.println("The Missing Element is = "+i);
			break;
			
			}
		}
	}

	}
