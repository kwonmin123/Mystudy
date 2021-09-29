package lamdaQuiz;

import java.util.HashMap;
import java.util.Map;

public class Ex08 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("spring", 1);
		map.put("java", 1);
		map.put("html", 1);
		map.put("css", 1);
		
		// map.replaceAll
		// 각 entry의 값이 key의 length가 되도록 코드 완성
		map.replaceAll((k,v)->k.length());
	
		System.out.println(map);
		// {spring=6, css=3, java=4, html=4}
		
	}
}
