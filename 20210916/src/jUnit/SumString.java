package jUnit;

public class SumString {
//띄어쓰기로 구분된 숫자들의 합
	
	public int sumsum(String aString) {
		int ret=0;
		
		
		
		String arr []=aString.split(" ");
		for(String a :arr) {
			ret+=Integer.parseInt(a);
		}
		
		
		return ret;
	}
}
