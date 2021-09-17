package setQuiz;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class quiz03 {
	//중복된 값들만 모은 셋을 만들어라
	
	
	public  Set<Integer> dupSet(Integer[] arr) {
	
		Set<Integer> set = new HashSet<>();
		Set<Integer> result = new HashSet<>();

		List arr2 = new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(arr));
		for (int e : arr) {
			if (set.contains(e)) {
				result.add(e);
			} else {
				set.add(e);
			}
		}
		
		return result;
	
	}
}

// arr 배열에 중복된 값들만 set에 모아서 리턴
//	ArrayList<Integer> arr33 = new ArrayList<Integer>(Arrays.asList(arr));
//		List arr2 = new ArrayList<>(Arrays.asList(arr));
//		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(arr));