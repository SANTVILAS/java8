package most_interview_question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test18_Count_Digit_String {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,6,3,4,5,4,3,5,6,7,7,3,5);
		Map<Integer, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
		
		List<String> strlist=Arrays.asList("sant","vilas","sant","vilas","monu");
		
		Map<String, Long> map1=strlist.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		map1.forEach((key,value)->System.out.println(key+" "+value));
		
	}
}
