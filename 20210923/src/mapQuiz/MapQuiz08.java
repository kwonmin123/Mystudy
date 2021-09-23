package mapQuiz;

import java.util.Map;

public class MapQuiz08 {
	public void swap(Map<String, String> param) {
		// param size : 2
		// param 키는 "a", "b"
		// param 각 값을 변경(swap)

		String bVal = param.get("b");
		param.put("b", param.get("a"));
		param.put("a", bVal);
	}
}
