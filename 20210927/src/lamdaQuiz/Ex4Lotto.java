package lamdaQuiz;

import java.util.HashSet;
import java.util.Set;


public class Ex4Lotto {
	public static void main(String[] args) {
		Set<Integer> lotto1 = getNumbers(() -> (int) (Math.random() * 45) + 1);
		System.out.println(lotto1);
		
		Set<Integer> lotto2 = getNumbers(() -> (int) (Math.random() * 10) + 1);
		System.out.println(lotto2);
	}
	
	public static Set<Integer> getNumbers(MyInterface5 s) {
		Set<Integer> lotto = new HashSet<>();
		
		while (lotto.size() < 6) {
			lotto.add(s.method());
		}
		
		return lotto;
	}
}

interface MyInterface5 {
	int method();
}
