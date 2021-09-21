package codingbatLogic2;

public class MakeChocolate {
	public int makeChocolate(int small, int big, int goal) {
		 
		for(int i=1;i<=big&&goal>=5;i++) {
			goal-=5;
		}
		if(goal>small) {return-1;}
		return goal;
	}

}
