package codingbatLogicQuiz1;

public class TeaParty {

	public int teaParty(int tea, int candy) {
		  if(tea<5||candy<5){return 0;}
		  if(tea>=2*candy){return 2;}
		  else if(candy>=2*tea) {return 2;}
		  return 1;
		}
}
