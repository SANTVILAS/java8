package most_interview_question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test21_First_Non_Repeating {
	public static void main(String[] args) {

		String str="ilovejavatechie";
		String[] str1=str.split("");
		
       Stream<String> stream1 = Stream.of(str1);
       
       Map<String, Long> map2= stream1.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
       String st=map2.entrySet()
       .stream()
       .filter(x->x.getValue()==1)
       .findFirst()
       .get()
       .getKey();
       
       System.out.println("Non repeat element "+st);
       
	}
}
