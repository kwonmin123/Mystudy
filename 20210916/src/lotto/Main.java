package lotto;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> lotto = new ArrayList<Integer>();

//	for(int i =0;i<6;i++) {
//		int ran = (int)(Math.random()*45)+1;
//		
//		
//		lotto.add(ran);
//						
//	}

	for (int i=1 ;i<46;i++) {
		lotto.add(i);
	}
	for(int i=0;i<39;i++) {
	int a =(int)((Math.random()*lotto.size())+1);
	lotto.remove(a);
	}

	
	}

}
