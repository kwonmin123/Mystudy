package mapQuiz;

import java.util.HashMap;
import java.util.Map;

public class MapQuiz03 {
//사이즈가 5이고 12345키값 에대응하는 3배 벨류값을 가진 맵
	public Map<Integer, Integer> triple() {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 3);
		map.put(2, 6);
		map.put(3, 9);
		map.put(4, 12);
		map.put(5, 15);
		
		
		return map;
	}

}
