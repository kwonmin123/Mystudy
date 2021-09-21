package codingbatLogic2;

public class MakeBricks {

	public boolean makeBricks(int small, int big, int goal) {
		 
		  int b =goal%5;
		  int c =goal -big*5;
		  if(small<b){return false;}
		  if(c>small){return false;}
		  else return true;
		}

}
