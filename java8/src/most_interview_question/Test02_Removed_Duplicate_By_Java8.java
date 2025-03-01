package most_interview_question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test02_Removed_Duplicate_By_Java8 {

	public static Set<Integer> removeDuplicate(List<Integer> list) {

		Set<Integer> set = list.stream().filter(i -> Collections.frequency(list, 1) > 1).collect(Collectors.toSet());
		return set;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 1, 3, 4, 6, 7);
		Set<Integer> ans = removeDuplicate(list);
		System.out.println(ans);
	}

}
