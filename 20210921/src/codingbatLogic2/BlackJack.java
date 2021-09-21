package codingbatLogic2;

public class BlackJack {
	public int blackjack(int a, int b) {
		  if(a>21){a=0;}
		  if(b>21){b=0;}
		  
		  return Math.abs(a-21)>Math.abs(b-21) ? b :a;
		  
		  
		}

}
