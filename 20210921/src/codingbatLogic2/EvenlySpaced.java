package codingbatLogic2;

import java.util.Arrays;

public class EvenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {

		int[] abc= {a,b,c};
		Arrays.sort(abc);
		
	return abc[1]*2==abc[0]+abc[2];
	}

}
