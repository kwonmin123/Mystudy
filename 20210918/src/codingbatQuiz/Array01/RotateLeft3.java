package codingbatQuiz.Array01;

public class RotateLeft3 {

	public int[] rotateLeft3(int[] nums) {
		int temp;
		temp =nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		return nums;
	}
}
