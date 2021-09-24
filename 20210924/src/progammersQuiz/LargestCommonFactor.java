package progammersQuiz;

import java.util.ArrayList;
import java.util.List;

public class LargestCommonFactor {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        List<Integer> alist = new ArrayList<Integer>();
        for(int a =1 ;a<=n ;a++){
            if(n%a==0) {alist.add(a);}
        }
        List<Integer> blist = new ArrayList<Integer>();
        for(int a =1 ;a<=m ;a++){
            if(m%a==0) {blist.add(a);}
        }
        int max=1;
        for(Integer a : alist) {
        	if(blist.contains(a)) {max =Math.max(a, max);}
        }
        answer[0]=max;
        answer[1]=n*m/max;
        return answer;
    
	}
}
