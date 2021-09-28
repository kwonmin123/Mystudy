package lamdaQuiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
		
		System.out.println(arr1);
		arr1.removeIf(a->a%2==0);
		// ArrayList.removeIf
		// 코드 작성
		
		
		
		
		System.out.println(arr1); // [3, 5]
	}
}
