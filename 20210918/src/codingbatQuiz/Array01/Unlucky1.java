package codingbatQuiz.Array01;

public class Unlucky1 {

	public boolean unlucky1(int[] nums) {
	if(nums.length==2) {
		if(nums[0]==1&&nums[1]==3) {
			return true;
		}
	}
		if(nums.length>2) {
		if((nums[0]==1&&nums[1]==3)||
				(nums[1]==1&&nums[2]==3)||
				(nums[nums.length-2]==1&&nums[nums.length-1]==3)
				) {
			return true;
		}
	}
		return false;
	}

}
