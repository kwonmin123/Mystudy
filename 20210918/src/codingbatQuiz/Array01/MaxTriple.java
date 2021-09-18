package codingbatQuiz.Array01;

public class MaxTriple {
	public int maxTriple(int[] nums) {
	if(nums.length==1) {return nums[0];}
	
	int max=Math.max(nums[0], nums[nums.length-1]); 
	max=Math.max(max,nums[nums.length/2]);	
	return max;	
	}

}
