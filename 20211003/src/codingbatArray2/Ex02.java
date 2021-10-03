package codingbatArray2;

public class Ex02 {
	public int bigDiff(int[] nums) {
		  int max =nums[0];
		  int min =nums[0];
		  for(int a : nums){
		    max= Math.max(a,max);
		    min= Math.min(a,min);
		  }

		  return max-min;
		  
		}

}
