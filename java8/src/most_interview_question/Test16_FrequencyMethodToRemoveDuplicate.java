package most_interview_question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test16_FrequencyMethodToRemoveDuplicate {
	
	public static Set<Integer> removeDuplicate(List<Integer> list){
		Set<Integer> set=list.stream().filter(i->Collections.frequency(list, 1)>1).collect(Collectors.toSet());
		return set;
	}
	
	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,3,2,1,3,4,6,7);
		Set<Integer> ans=removeDuplicate(list);
		System.out.println(ans);
		System.out.println("==================================");
		
		List<Integer> list2=list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println("=================");
		Set<Integer> list1=list.stream().distinct().collect(Collectors.toSet());
		System.out.println(list1);
		
		
		System.out.println("==============================");
		
		List<String> list4=Arrays.asList("sant","sant","vilas","vilas","keshari");
		List<String> list5=list4.stream().distinct().collect(Collectors.toList());
		System.out.println(list5);
	}
}
