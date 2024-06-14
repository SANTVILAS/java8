package most_interview_question;
//Look==>
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test10_count_chracter_and_sort_basis_of_key {

	public static void main(String[] args) {
		String s = "ssssssddddffffggghhhh";
		 String[] str=s.split("");
		 
		 
		 Map<String, Long> mapAns=Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(mapAns);
		 
//		 //=========================
//		 mapAns.entrySet().stream().sorted(Map.Entry.comparingByKey());
//		 mapAns.forEach((key,value)->System.out.println(key+ " "+value));
//		 //========================
//		 Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
//			
//		 mapAns.entrySet().stream().sorted(Map.Entry.comparingByKey())
//		    .forEachOrdered(entry->sortedMap.put(entry.getKey(),entry.getValue()));
//			
//			sortedMap.forEach((key,value)->System.out.println(key+" "+value));
		 
		  List<String> answer= Arrays.stream(str).sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList());
		  System.out.println(answer);
			
	}
}
