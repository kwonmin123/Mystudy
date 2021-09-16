package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Test01 {

	@Test
	void test() {
	//몇가지 테스트가 통과하는 프로그램
		MInMax mm = new MInMax();
		assertEquals(0,0);
		assertEquals(2,new Digit().dgit(2));
		assertEquals(3,new Digit().dgit(2223));
		assertEquals(4,new Digit().dgit(34));
		SumString s1= new SumString();
		assertEquals(88,s1.sumsum("0 55 33"));
		ArrayMax am= new ArrayMax();
		ArrayList<Integer> l1= new ArrayList<Integer>();
		assertEquals(0,am.max(l1));
		l1.add(3);
		assertEquals(3,am.max(l1));
		
		l1.add(4);
		l1.add(6);
		l1.add(5);
		assertEquals(6,am.max(l1));
		assertEquals(2,am.maxIndex(l1));
		assertEquals(new ArrayList<>(Arrays.asList(3,6)),mm.minmax(l1));
		
		Mirror e = new Mirror();
		//ArrayList<Integer> l2= true, e.mirror(Arrays.asList(1, 2, 3, 4, 3, 2, 1));
		//assertEquals(true, e.mirror((ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
		assertEquals(true, e.mirror(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
		//assertEquals(false, e.mirror(Arrays.asList(1, 2, 3, 1, 2, 3)));
		
		
//		assertEquals(88,s1.sumsum("0 55 33"));
//		assertEquals(88,s1.sumsum("0 55 33"));
//		assertEquals(88,s1.sumsum("0 55 33"));
//		assertEquals(88,s1.sumsum("0 55 33"));
//		assertEquals(88,s1.sumsum("0 55 33"));
//		assertEquals(2,3);
	}

}
