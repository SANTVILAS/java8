package most_interview_question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test12_Count_No_of_Digit {
	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(5,6,3,4,5,4,3,5,6,7,7,3,5);
		
		Map<Integer, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		map.entrySet().forEach(System.out::println);
		
		
	}
}
