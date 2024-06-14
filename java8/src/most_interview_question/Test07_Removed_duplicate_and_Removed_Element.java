package most_interview_question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test07_Removed_duplicate_and_Removed_Element {

	public static Set<Integer> removedDuplicate(List<Integer> list){
		
		Set<Integer> set = new HashSet<Integer>();
		
		List<Integer> duplicateElement = new LinkedList<Integer>();
		for(Integer elem:list) {
		if(set.contains(elem)) {
			duplicateElement.add(elem);
		}else {
			set.add(elem);
		}
		
		
		}
		System.out.println(duplicateElement);
		//System.out.println(set);
		return set;
		
	}
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1, 2, 1, 1, 3, 4, 5, 4, 5);

		System.out.println("===========================================");

		Set<Integer> anslist = removedDuplicate(list);
		System.out.println(anslist);

	}
	
}
