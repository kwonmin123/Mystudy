package codingbatLogicQuiz1;

public class GreenTicket {
	public int greenTicket(int a, int b, int c) {
		  if(a==b&&b==c){return 20;}
		  if((a==b)||(b==c)||(c==a)){return 10;}
		  return 0;
		}

}
