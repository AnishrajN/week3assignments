/* package week1.day2.assignments.mandatory;

public class RemoveDuplicates {
	
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {
	public static void main(String[] args) {
		String input = "We learn java basics as part of java sessions in java week1";	
		String[] split = input.split(" ");
		
		Set<String> set = new LinkedHashSet<String>(); // since Set dosent allow duplicates so we r using Set for removing duplicates
		for (String var : split) {                     //foreach ---> for (datatype variable : set)
			 set.add(var);                             //just simply storing the variables in set using add  
			                       
		}
		
		System.out.println(set);
		
	}

}
