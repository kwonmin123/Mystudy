package codingbatLogicQuiz;

public class CigarParty {

	public boolean cigarParty(int cigars, boolean isWeekend) {
		  if(isWeekend){
		    return (cigars>=40);
		  }
		    return (cigars>=40&&cigars<=60);
		}

}
