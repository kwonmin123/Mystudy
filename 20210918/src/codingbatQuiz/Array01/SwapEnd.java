package codingbatQuiz.Array01;

public class SwapEnd {

	public int[] swapEnds(int[] nums) {
		
		if(nums.length==1) {return nums;}
		int temp;
		temp =nums[0];
		nums[0]= nums[nums.length-1];
		nums[nums.length-1]= temp;
		
		
		return nums;
	}

}
