package codingbatQuiz.Array01;

public class MakeMiddle {

	public int[] makeMiddle(int[] nums) {
	
		int [] ret = new int[2];
		ret[0]= nums[nums.length/2-1];
		ret[1]= nums[nums.length/2];
		
		
		
		return ret;
	}

}
