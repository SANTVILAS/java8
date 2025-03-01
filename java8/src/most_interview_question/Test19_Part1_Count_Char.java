package most_interview_question;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test19_Part1_Count_Char {
	public static void main(String[] args) {
		String str = "ilovejavatechie";
		String[] str1 = str.split("");
		Stream<String> stream1 = Stream.of(str1);

		Map<String, Long> map = stream1.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.forEach((key, value) -> System.out.println(key + " " + value));

		// remove duplicate

		List<String> duplicateElement=map.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateElement);
	}
}
