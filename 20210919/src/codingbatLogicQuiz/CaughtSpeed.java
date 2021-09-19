package codingbatLogicQuiz;

public class CaughtSpeed {

	public int caughtSpeeding(int speed, boolean isBirthday) {
		  if(isBirthday){
		    if(speed<=65){return 0;}
		    else if (speed<=85){return 1;}
		    else return 2;
		  }
		  if(speed<=60){return 0;}
		    else if (speed<=80){return 1;}
		    else return 2;
		  
		  
		  
		  
		}

}
