package codingbatArray2;

public class Ex05 {
	public int sum67(int[] nums) {
		int sum=0;  
		boolean inout = true;
		
		for(int i= 0;i<nums.length;i++) {
			if(nums[i]==6) {inout=false;}
			sum= inout==true? sum+nums[i]:sum;
			
			if(nums[i]==7) {inout=true;}
		}
		
		
		return sum;
	}

}
