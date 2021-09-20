package codingbatLogicQuiz1;

public class InOrder {
	public boolean inOrder(int a, int b, int c, boolean bOk) {
	if(bOk) {
		if(b<c) {return true;}
	}
	else if(a<b&&b<c) {return true;}
	return false;
	}

}
