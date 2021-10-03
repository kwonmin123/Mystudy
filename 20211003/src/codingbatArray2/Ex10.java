package codingbatArray2;

public class Ex10 {
	public boolean only14(int[] nums) {
		  for(int a : nums){
		    if(a!=1&&a!=4) return false;
		  }
		  return true;
		}

}
