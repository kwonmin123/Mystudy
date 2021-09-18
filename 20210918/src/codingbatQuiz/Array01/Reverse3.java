package codingbatQuiz.Array01;

public class Reverse3 {

	public int[] reverse3(int[] nums) {
	
		int temp;
		temp    = nums[0];
		nums[0] = nums[2];
		nums[2] = temp; 
		return nums;
	}

}
