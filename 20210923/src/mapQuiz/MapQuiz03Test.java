package mapQuiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class MapQuiz03Test {

	@Test
	void test() {
		MapQuiz03 e = new MapQuiz03();
		Map<Integer, Integer> map = e.triple();
		

		assertEquals(5, map.size());
		assertEquals(3, map.get(1));
		assertEquals(6, map.get(2));
		assertEquals(9, map.get(3));
		assertEquals(12, map.get(4));
		assertEquals(15, map.get(5));
	}

}
