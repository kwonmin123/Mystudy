package lotto;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> lotto = new HashSet<>();
		
		while (lotto.size() < 6) {
			int ran = (int) (Math.random() * 45) + 1;
			
			System.out.println(ran);
			lotto.add(ran);
		}
		
		System.out.println("======================");
		
		for (int l : lotto) {
			System.out.println(l);
		}
	
	}

}
