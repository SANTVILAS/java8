package most_interview_question;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class Test23_First_Non_Repeating_chracter {

	public static void main(String[] args) {
		
		String str="hhello";
		char[] ch=str.toCharArray();
		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(Character c:ch) {
			if(map.get(c)==null) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
			
		}
		
		System.out.println(map);
		
		for (Entry<Character, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue()==1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}
	}
	
	
}
