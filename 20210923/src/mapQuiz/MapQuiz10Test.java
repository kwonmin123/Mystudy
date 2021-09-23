package mapQuiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import p15collection.p02quiz.p03map.Ex10;

class MapQuiz10Test {

	@Test
	void test() {
		MapQuiz10 e = new MapQuiz10();
		
		Map<String, Integer> m1 = new HashMap<>();
		Map<String, Integer> m2 = new HashMap<>();
		
		m1.put("kim", 3);
		m1.put("bob", 7);
		m1.put("son", 10);
		
		m2.put("bob", 77);
		m2.put("son", 99);
		m2.put("ji", 13);
		
		Map<String, Integer> res = e.sum(m1, m2);
		
		assertEquals(4, res.size());
		assertEquals(3, res.get("kim"));
		assertEquals(84, res.get("bob"));
		assertEquals(109, res.get("son"));
		assertEquals(13, res.get("ji"));
	}

}
