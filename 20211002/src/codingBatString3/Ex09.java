package codingBatString3;

import java.util.HashMap;

public class Ex09 {
	public int maxBlock(String str) {
		int n=0, res=0;
		char previousc=0;
		for(char c : str.toCharArray()) {
		n = c == previousc ? n+1 : 1;
		if (n > res)
		res = n;
		previousc = c;
		}
		return res;
		}


}
