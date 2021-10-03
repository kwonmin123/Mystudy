package codingbatArray2;

public class Ex08 {
	public boolean sum28(int[] nums) {
		  int sum=0;
		  for(int a :nums){
		    
		    sum= a==2? sum+2 :sum;
		  }
		  
		  
		  return sum==8;
		}

}
