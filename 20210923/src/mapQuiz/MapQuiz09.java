package mapQuiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapQuiz09 {
	public Map<Character, Integer> countCharacter(String str) {
		// str의 문자가 몇번 나오는지 세어서
		// 문자를 key 몇번을 value 로 갖는 map 만들어서 return
		//List도 가능
		Map<Character, Integer> ret = new HashMap<Character, Integer>();
		List<Character> ch = new ArrayList<Character>();
		for(int i=0;i<str.length();i++) {
			ch.add(str.charAt(i));
		}
		Set<Character> ch1 = new HashSet<Character>();
		ch1.addAll(ch);
		for(Character c : ch1) {
			Integer count=0;
			for(Character c1:ch) {if(c==c1) {count++;}}
			ret.put(c, count);
		}
		return ret;
	}
//	public Map<Character, Integer> countCharacter(String str) {
//		// str의 문자가 몇번 나오는지 세어서
//		// 문자를 key 몇번을 value 로 갖는 map 만들어서 return
//		
//		Map<Character, Integer> result = new HashMap<>();
//		
//		for (int i = 0; i < str.length(); i++) {
//			Character c = str.charAt(i);
//			
//			if (result.containsKey(c)) {
//				Integer v = result.get(c);
//				result.put(c, v + 1);
//			} else {
//				result.put(c, 1);
//			}
//		}
//		
//		return result;
//	}
}
