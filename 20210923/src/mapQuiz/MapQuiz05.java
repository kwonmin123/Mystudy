package mapQuiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapQuiz05 {
//param이 가지고 있는 벨류를 2배한 새 맵을 만들어서 리턴

public Map<Integer, Integer> doubling(Map<Integer, Integer> param) {
	Map<Integer,Integer> map = new HashMap<Integer, Integer>();

for(Entry<Integer, Integer> a :param.entrySet()) {
	map.put(a.getKey(), a.getValue()*2);
}
	return map;
}

}
