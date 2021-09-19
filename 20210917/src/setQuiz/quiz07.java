package setQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class quiz07 {
// b배열과 비교했을때 a배열에만 있는 원소를 갖는 셋을 출력
	
	
	public Set<Integer> diff(int[] a, int[] b) {
		Set<Integer> ret = new HashSet<Integer>();
		for(int i :a) {
			ret.add(i);
		}
		
		ret.removeAll(Arrays.asList(b));
		return ret;
	}
}
