package codingBatString3;

public class Ex08 {
	public String mirrorEnds(String string) {
	String ret="";
	int i=0;
	while(i<string.length()&&string.charAt(i)==string.charAt(string.length()-1-i)) {
		ret+=string.charAt(i);
		i++;
		
	}
	
	return ret;	
	}

}
