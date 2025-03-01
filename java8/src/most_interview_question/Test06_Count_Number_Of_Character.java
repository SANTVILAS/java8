package most_interview_question;
//look==>When yo use Stream.of
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test06_Count_Number_Of_Character {

	public static void main(String[] args) {
		String str = "aaaccadddeef";
		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(Character ch:arr){
			if(map.get(ch)==null) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
			
		}
		System.out.println(map);
		
		System.out.println("===============================================");
		
		
		String str1 = "IlovejavaTechie";
		String[] str2 = str.split("");
     
		Stream<String> stream=Stream.of(str2);
		Map<String, Long> ansWerMap=stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		ansWerMap.forEach((key,value)->System.out.println(key+" "+value));
		
		
	}
	
}
