package most_interview_question;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test11_countEachCharacter {
	public static void main(String[] args) {
		String s = "abbcadab";
		   String[] str=s.split("");
		   
		   
		   
		   Map<String, Long> ans=Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		   ans.entrySet().forEach(System.out::println);
		
//	Set<String> setans= Arrays.stream(str).filter(i->Collectors.frequecy(List,1)<=2).collect(Collectors.toSet());
//		   System.out.println(setans);
	}
}
