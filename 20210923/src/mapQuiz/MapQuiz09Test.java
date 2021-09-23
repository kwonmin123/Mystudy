package mapQuiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;



class MapQuiz09Test {

	@Test
	void test() {
MapQuiz09 e = new MapQuiz09();
		
		String s = "keysvalues";
		
		
		Map<Character, Integer> map = e.countCharacter(s);
		
		assertEquals(8, map.size());
		assertEquals(2, map.get('e'));
		assertEquals(2, map.get('s'));
		assertEquals(1, map.get('k'));
		assertEquals(null, map.get('z'));
	}

}
