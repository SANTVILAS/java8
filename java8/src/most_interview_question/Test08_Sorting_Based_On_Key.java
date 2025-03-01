package most_interview_question;
//look==>Sorting based on key not working
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test08_Sorting_Based_On_Key {
	public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("b", 3);
		map.put("a", 1);
		map.put("c", 2);
		
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
	    .forEachOrdered(entry->sortedMap.put(entry.getKey(),entry.getValue()));
		
		sortedMap.forEach((key,value)->System.out.println(key+" "+value));
		
	
		
		System.out.println("======================");
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
	}
}
