package codingbatArray2;

public class Ex03 {
	public int centeredAverage(int[] nums) {
		  int sum=0;
		  int min=nums[0];
		  int max=nums[0];

		  for(int a :nums){
		    sum+=a;
		    min= Math.min(a,min);
		    max= Math.max(a,max);
		  }
		  return (sum-min-max)/(nums.length-2);
		}

}
