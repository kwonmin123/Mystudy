package codingBat;

public class OneTwo {

	public String oneTwo(String str) {

		String ret= "";
		int i=0;
		while(i<(str.length()/3)*3) {
			ret+=str.charAt(i+1);
			ret+=str.charAt(i+2);
			ret+=str.charAt(i);
			i=i+3;
		}
		return ret;
	}	



}
