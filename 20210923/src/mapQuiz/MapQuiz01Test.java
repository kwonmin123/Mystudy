package mapQuiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class MapQuiz01Test {

	@Test
	void test() {
	
		MapQuiz01 e =new MapQuiz01();
		
		Map<Integer, Integer> map = new HashMap<>();
		e.put(map);
		assertEquals(2, map.get(1));
		assertEquals(4, map.get(2));
		assertEquals(2, map.size());
		assertFalse(map.containsKey(3));
	}

}
