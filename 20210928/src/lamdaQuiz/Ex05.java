package lamdaQuiz;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
public static void main(String[] args) {
	List<String> list = Arrays.asList("java", "a", "spring", "qa", "mouse", "bob");
	
	System.out.println(list);
	
	// list.sort
	list.sort((a,b)->a.length()-b.length());
	System.out.println(list); // [a, qa, bob, java, mouse, spring]
	list.sort((a,b)->a.compareTo(b));
	System.out.println(list); // [a, qa, bob, java, mouse, spring]
	
	
}
}
