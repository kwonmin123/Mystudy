package codingbatArray2;

public class Ex01 {
	public int countEvens(int[] nums) {
		  int ret =0;
		  for(int a : nums){
		    ret=a%2==0? ret+1 : ret;
		  }
		  return ret;
		}

}
