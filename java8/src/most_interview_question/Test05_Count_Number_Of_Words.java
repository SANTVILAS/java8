package most_interview_question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test05_Count_Number_Of_Words {

	public static void main(String[] args) {
	    
	     String str="this is is done by saket saket";

	     String[] splitedWords=str.split(" ");
	     
	     Map<String, Integer> map =new HashMap<String, Integer>();
	     
	     for(String elem : splitedWords) {
	    	 if(map.get(elem)==null) {
	    		 map.put(elem, 1);
	    	 }else {
	    		 map.put(elem, map.get(elem)+1);
	    	 }
	    	 
	     }
		System.out.println(map);
		
		Map<String, Long> mapAnswer=Arrays.stream(splitedWords).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		mapAnswer.forEach((key,value)->System.out.println(key+" "+value));
		
	}
	
}
