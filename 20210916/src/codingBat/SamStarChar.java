package codingBat;

public class SamStarChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean sameStarChar(String str) {
		
		for(int i=1 ;i<str.length()-1;i++) {
			if(str.charAt(i)=='*') {
				if(str.charAt(i-1)!=str.charAt(i+1)) {
					return false;
				}
			}
		}
		
		
		
		return true;
	}
}
