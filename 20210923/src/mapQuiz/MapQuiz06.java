package mapQuiz;

import java.security.KeyStore.Entry;
import java.util.Map;

public class MapQuiz06 {

	public void doubling(Map<Integer, Integer> map) {
	for(java.util.Map.Entry<Integer, Integer> a:map.entrySet()) {
		map.put(a.getKey(), a.getValue()*2);
	}
		
	}

}
