package most_interview_question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test24_First_Non_Repeating_Chracter_java8 {
	public static void main(String[] args) {

		String str="aaaccvddffbgg";
		String[] arr=str.split("");
		
		
		Map<String, Long> map=Arrays.stream(arr)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		String firstCharacter=map.entrySet().stream().filter(entry->entry.getValue()==1)
		.map(entry->entry.getKey()).findFirst().get();
		
		
		
		System.out.println(firstCharacter);
	}
}
