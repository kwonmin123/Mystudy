package leetcodeQuiz;

import java.util.HashMap;

import java.util.Map;


public class No387 {

	public int firstUniqChar(String s) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		String [] a = s.split("");

		for(String ss:a) {
			if(map.containsKey(ss)) {
				map.put(ss, map.get(ss)+1);
			} else {
				map.put(ss,1);
			}
		}

		for(int i=0;i<a.length;i++) {
			if(map.get(a[i])==1) {return i;}

		}
		return -1;



	}

}
