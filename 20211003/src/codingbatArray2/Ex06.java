package codingbatArray2;

public class Ex06 {
	public boolean has22(int[] nums) {
	for(int i =0 ;i<nums.length-1;i++) {
	if(nums[i]==2) {if(nums[i+1]==2)return true;}	
	}
		
		return false;
	}

}
