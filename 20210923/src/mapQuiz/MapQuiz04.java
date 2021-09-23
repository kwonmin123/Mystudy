package mapQuiz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapQuiz04 {

//List<String> 을 매개변수로 받아서 String을 키로 String의 길이를 벨류로 갖는 맵을 완성해라
	public Map<String, Integer> length(List<String> asList) {

		Map<String , Integer> map = new HashMap<String, Integer>();
		for(String a : asList) {
			map.put(a, a.length());
		}
		
		
		
		return map;
	}

}
