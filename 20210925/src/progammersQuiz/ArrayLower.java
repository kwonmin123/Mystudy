package progammersQuiz;

import java.util.Arrays;
import java.util.Collections;
public class ArrayLower {
	class Solution {
	    public long solution(long n) {
			String num = String.valueOf(n);
	        String ansnum = "";
	        char [] arr = new char[num.length()];
	        for (int i = 0; i < num.length(); i++) {
	            arr[i] += num.charAt(i); 
	        } 
	        Arrays.sort(arr);
	        for (int i = arr.length-1; i >= 0; i--) {
	            ansnum += arr[i]; 
	        } 
	        long answer = Long.parseLong(ansnum);
	        return answer;

	    }
	}
	class sol2 {
		public long solution(long n) {
			String num = String.valueOf(n);
	        String [] arr = num.split("");
	        Arrays.sort(arr,Collections.reverseOrder());
	        String answer= "";
	        for(String s : arr) {
	        	answer+=s;
	        }
	        long ret = Long.parseLong(answer);
	        return ret;

	    }
	}
}
