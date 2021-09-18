package codingbatQuiz.Array01;

public class No23 {

	public boolean no23(int[] nums) {
		for(int a :nums) {
			if(a==2||a==3) {return false;}
		}

		return true;
	}
}
