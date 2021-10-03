package codingbatArray2;

public class Ex07 {
	public boolean lucky13(int[] nums) {
		for(int a : nums) {
			if(a==1||a==3) {return false;}
		}  
		
		
		
		return true;
	}

}
