package setQuiz;

import java.util.HashSet;
import java.util.Set;

public class quiz02 {

	// 스트링배열을 소문자로 변환해서 저장하는 셋 만들어라
	
	public Set<String> toSet(String[] arr) {
		Set<String> ret = new HashSet<String>();
		
		for(String a : arr) {
			ret.add(a.toLowerCase());
		}		
				
				
				
				
		return ret;
	}
}
