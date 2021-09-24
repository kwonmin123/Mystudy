package leetcodeQuiz;


import java.util.HashMap;
import java.util.Map;

public class No1512 {
    public int numIdenticalPairs(int[] nums) {
        int ret= 0;
    	Map<Integer, Integer> map = new HashMap<>();
         for(int a:nums){
             if(map.containsKey(a)){
                 map.put(a,map.get(a)+1);
             }else {map.put(a,1);}
         }
         //System.out.println(map);
         for(Integer key:map.keySet()) {
        	
        	  ret=ret+(map.get(key)*(map.get(key)-1))/2;
         }
         
         return ret;
     }
}
