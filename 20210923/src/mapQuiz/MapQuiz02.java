package mapQuiz;

import java.util.HashMap;
import java.util.Map;

public class MapQuiz02 {
	public Map<Integer, Integer> put() {
		// map을 만들어서 return
		// 1:2, 2:4 추가
		Map<Integer, Integer> map = new HashMap<>();		
		map.put(1, 2);		
		map.put(2, 4);		
		return map;
	}
}
