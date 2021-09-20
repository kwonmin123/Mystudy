package codingbatLogicQuiz1;

public class LastDigit {
	public boolean lastDigit(int a, int b, int c) {
	if(a%10==b%10) {return true;}
	if(b%10==c%10) {return true;}
	if(c%10==a%10) {return true;}
		
		
		
		return false;
	}

}
