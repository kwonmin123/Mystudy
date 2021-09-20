package codingbatLogicQuiz1;

public class TwoAsOne {

	public boolean twoAsOne(int a, int b, int c) {
	if(a+b==c) {return true;}
	if(a+c==b) {return true;}
	if(c+b==a) {return true;}
		return false;
		
		
	}

}
