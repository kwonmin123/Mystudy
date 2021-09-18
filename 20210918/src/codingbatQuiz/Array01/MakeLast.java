package codingbatQuiz.Array01;

public class MakeLast {

	public int[] makeLast(int[] nums) {

		int[] ret = new int[nums.length*2];

		for(int i=0 ;i<ret.length-1;i++) {
			ret[i]=0;
		}
		ret[ret.length-1]=nums[nums.length-1];

		return ret;
	}

}
