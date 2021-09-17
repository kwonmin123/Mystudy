package setQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class quiz05 {

	
	//중복된 글자가 몇종류인지 숫자를 반환하는 메쏘드
	
	public String zipZap(String str) {
		str=str.replaceAll("z.p", "zp");
		return str;
	}
	
	
	
	public int dupLetter(String a) {
		Set<String> set = new HashSet<String>();
		Set<String> ret = new HashSet<String>();
		String[] a1 = a.split("");
		for (String t: a1) {
			if (set.contains(t)) {
				ret.add(t);
			} else {
				set.add(t);
			}
		}		
		return ret.size();
		
	}
}
