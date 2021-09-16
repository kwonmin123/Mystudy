package jUnit;

public class SumString {

	
	public int sumsum(String aString) {
		int ret=0;
		
		
		
		String arr []=aString.split(" ");
		for(String a :arr) {
			ret+=Integer.parseInt(a);
		}
		
		
		return ret;
	}
}
