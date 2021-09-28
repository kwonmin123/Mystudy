package lamdaQuiz;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {


	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("lang", "java");
		map.put("fw", "spring");
		map.put("fe", "html");
		// map의 foreach 활용
		map.forEach((a,b)->{ 
		System.out.println("key : "+a+", value : "+b);
		
		});
	
	
	}
}
