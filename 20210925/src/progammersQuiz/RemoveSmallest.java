package progammersQuiz;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSmallest {
	class Solution {
	    public int[] solution(int[] arr) {
	        
	        if(arr.length<2){
	        int[] answer = {-1};
	        return answer;
	        }
	       int[] ret= new int[arr.length-1];
	       
	       int min =Integer.MAX_VALUE;
	       int minindex=0;
	       for(int i=0;i<arr.length;i++) {
	    	   if(arr[i]<min) {
	    		   min=arr[i];
	    		   minindex=i;
	    	   }
	       } 
	     for(int i=0; i<minindex;i++) {
	    	 ret[i]= arr[i];
	     }
	     for(int i=minindex;i<ret.length;i++) {
	    	 ret[i]= arr[i+1];
	     }
	        return ret;
	    }
	}
}
