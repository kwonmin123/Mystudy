package mapQuiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapQuiz10 {
	public Map<String, Integer> sum(Map<String, Integer> map1, Map<String, Integer> map2) {
		// map1과 map2에 키가 둘 다 있으면 밸류를 더해서 추가
		// 한 쪽에만 있으면 그냥 추가
		// 한 새 map을 만들어서 리턴
		
		Map<String, Integer> res = new HashMap<>();
		
		// map1의 entry들을 res에 옮김
		Set<String> keys1 = map1.keySet();
		for (String key : keys1) {
			res.put(key, map1.get(key));
		}
		
		
		Set<String> keys2 = map2.keySet();
		for (String key : keys2) {
			if (res.containsKey(key)) {
				Integer v = res.get(key);
				res.put(key, v + map2.get(key));
			} else {
				res.put(key, map2.get(key));
			}
		}
		
		return res;
	}
}
