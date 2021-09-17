package setQuiz;

import java.util.HashSet;
import java.util.Set;

public class quiz06 {

	//문자열을 받았을떄 한번만 사용되는 문자의 갯수를 출력하는 메쏘드
	
	public int countOnly(String a) {
		Set<String> set = new HashSet<String>();
		Set<String> ret = new HashSet<String>();
		String[] a1 = a.split("");
			for (String t: a1) {
			if (set.contains(t)) {
				ret.add(t);
			} else {
				set.add(t);
			}
		}		
		
		for(String s : ret) {
			set.remove(s);
		}
		
		
		
				
		
		return set.size();
		
		
	}
}
