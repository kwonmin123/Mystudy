package setQuiz;


import java.util.HashSet;
import java.util.Set;

public class quiz04 {
	
	
//	String을 구성하고 있는 문자의 개수를 출력하는 메쏘드

	public int countLetter(String in) {
		Set<String> set = new HashSet<>();
		String [] input = in.split("");
		for(String s : input) {
			set.add(s);
		}
		
		return set.size();
	}
}
