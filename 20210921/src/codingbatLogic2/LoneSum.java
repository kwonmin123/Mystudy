package codingbatLogic2;

public class LoneSum {

	public int loneSum(int a, int b, int c) {
		  if(a==b&&b==c){return 0;}
		  if(a==b){return c;}
		  if(c==b){return a;}
		  if(a==c){return b;}
		  return a+b+c;
		}

}
