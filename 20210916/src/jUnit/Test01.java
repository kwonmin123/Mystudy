package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test01 {

	@Test
	void test() {
	//몇가지 테스트가 통과하는 프로그램
		assertEquals(0,0);
		assertEquals(2,new Digit().dgit(2));
		assertEquals(3,new Digit().dgit(2223));
		assertEquals(4,new Digit().dgit(34));
		SumString s1= new SumString();
		assertEquals(88,s1.sumsum("0 55 33"));
	//	assertEquals(2,3);
		
	}

}
