package codingbatQuiz.Array01;

public class FrontPiece {

	public int[] frontPiece(int[] nums) {
	if(nums.length==0){
		int [] ret = {};
		return ret;
		} else if (nums.length==1) {
			return nums;
		}
	int[] ret = {nums[0],nums[1]};
	return ret;
	
	}

}
