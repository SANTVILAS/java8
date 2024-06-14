package most_interview_question;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test04_NumberTimeOfEach_Word_Occure {
	public static void main(String[] args) {
		String str="I love love java Techie";
		
		String[] str1=str.split(" ");
		
		Map<String, Long> mapAnswer=Arrays.stream(str1)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		mapAnswer.forEach((key,value)->System.out.println(key+" "+value));
		
		
	}
}
