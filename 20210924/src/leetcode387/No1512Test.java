package leetcode387;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class No1512Test {

	@Test
	void test() {
		No1512 e = new No1512();
		assertEquals(4, e.numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }));
		assertEquals(6, e.numIdenticalPairs(new int[] { 1, 1, 1, 1 }));
		assertEquals(0, e.numIdenticalPairs(new int[] { 1, 2, 3 }));
	}

}
