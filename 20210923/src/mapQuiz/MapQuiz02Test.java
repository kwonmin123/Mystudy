package mapQuiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class MapQuiz02Test {

	@Test
	void test() {
		MapQuiz02 e  = new MapQuiz02();
	
	Map<Integer, Integer> map = e.put();
	assertEquals(2, map.size());
	assertEquals(2, map.get(1));
	assertEquals(4, map.get(2));
	assertFalse(map.containsKey(3));
	
	}

}
