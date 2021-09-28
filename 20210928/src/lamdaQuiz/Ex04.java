package lamdaQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> list2 =  (ArrayList<Integer>)list.clone();
		ArrayList<Integer> list3 = new ArrayList<>(list);
		// ArrayList.replaceAll
		// 코드 작성
		
		list.replaceAll(a->a*2);
		
		System.out.println(list);// [2, 4, 6, 8]
		System.out.println(list2);// [2, 4, 6, 8]
		System.out.println(list3);// [2, 4, 6, 8]
		
		List<String> list4 = new ArrayList<>(Arrays.asList("java", "spring", "html", "a", "", "css"));
		
		// List.replaceAll
		list4.replaceAll(e->e.replaceAll("(?<=.{2})." , ""));
		
		
		System.out.println(list4); // [va, ng, ml, a, , ss]
	}
}
