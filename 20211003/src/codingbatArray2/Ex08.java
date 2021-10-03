package codingbatArray2;

public class Ex08 {
	public boolean more14(int[] nums) {
	int cnt1 =0;
	int cnt4 =0;
		for(int a  : nums) {
			if(a==1) {cnt1++;}
			if(a==4) {cnt4++;}
			
			
		}
		
		return cnt1>cnt4;
	}

}
