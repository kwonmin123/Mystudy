package codingbatLogic2;

public class NoTeenSum {
	public int noTeenSum(int a, int b, int c) {
		  if(a>=13&&a<15){a=0;}
		  if(a>=17&&a<20){a=0;}
		  if(b>=13&&b<15){b=0;}
		  if(b>=17&&b<20){b=0;}
		  if(c>=13&&c<15){c=0;}
		  if(c>=17&&c<20){c=0;}
		  
		  return a+b+c;
		}

}
