package codingbatLogic2;

public class RoundSum {

	
	public int roundSum(int a, int b, int c) {

		return round10(a)+round10(b)+round10(c);  
		}

		public int round10(int num) {
				double a =num/10.0;
				a =Math.round(a);
				return (int)a*10;
				  
		}
}
