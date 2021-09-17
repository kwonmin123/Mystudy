package setQuiz;

import java.util.HashSet;
import java.util.Set;

public class quiz01 {
	// int[]를 넣으면 set<integer>로 출력되는 메쏘드를 만들어라
	public Set<Integer> toSet(int [] arr) {
		Set<Integer>  ret =new HashSet<Integer>();
		for(int a : arr) {
			ret.add(a);
		}
		
		return  ret;
		
	}
	
	
}
