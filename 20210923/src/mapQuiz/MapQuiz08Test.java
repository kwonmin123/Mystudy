package mapQuiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class MapQuiz08Test {

	@Test
	void test() {
		MapQuiz08 e = new MapQuiz08();

		Map<String, String> map = new HashMap<>();
		map.put("a", "apple");
		map.put("b", "banana");

		e.swap(map);
		assertEquals(2, map.size());
		assertEquals("banana", map.get("a"));
		assertEquals("apple", map.get("b"));
	}

}
