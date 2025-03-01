package most_interview_question;
//Look ==>note on calender
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test20_Part2_Unique_Element {
	public static void main(String[] args) {

		
		String str="ilovejavatechie";
		String[] str1=str.split("");
		
       Stream<String> stream1 = Stream.of(str1);
		Map<String, Long> map1=stream1.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map1.forEach((key,value)->System.out.println(key+" "+value));
		
		//unique element present in string
				List<String> uniqueElement=map1.entrySet().stream()
				.filter(x->x.getValue()==1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
				System.out.println("unique");
				uniqueElement.forEach(s->System.out.println(s));
		
		
	}
}
