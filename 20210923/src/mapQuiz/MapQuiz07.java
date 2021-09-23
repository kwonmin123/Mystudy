package mapQuiz;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapQuiz07 {
	//파라미터 싸이즈 2
	//두 벨류를 바꾼 맵을 리턴
	//파람은 변경 안함


	public  <T> Map<String, String> swapMap(Map<String, String> param) {

		// param의 size가 2
		// param의 키는 "a", "b"
		// 두 value를 서로 바꾼(swap) map을 만들어서 return
		// param은 변경 x

		Map<String, String> map = new HashMap<String, String>();
		map.put("b", param.get("a"));
		map.put("a", param.get("b"));

		return map;
	}

}

