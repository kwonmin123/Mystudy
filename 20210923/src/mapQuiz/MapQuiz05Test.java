package mapQuiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;


class MapQuiz05Test {

	@Test
	void test() {
		Map<Integer, Integer> map1 = new HashMap<>();
		map1.put(1, 3);
		map1.put(2, 10);
		map1.put(100, 2);
		
		MapQuiz05 e = new MapQuiz05();
		Map<Integer, Integer> map2 = e.doubling(map1);
		
		assertEquals(3, map2.size());
		assertEquals(6, map2.get(1));
		assertEquals(20, map2.get(2));
		assertEquals(4, map2.get(100));
		
		assertEquals(3, map1.get(1));
		assertEquals(10, map1.get(2));
		assertEquals(2, map1.get(100));
	
	
	}

}
