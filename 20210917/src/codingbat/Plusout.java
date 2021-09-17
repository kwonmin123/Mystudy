package codingbat;

public class Plusout {

	public String plusOut(String str, String word) {
		String ret ="";
	
		
		for(int i=0 ; i<str.length();i++) {
			if(str.substring(i, i+word.length()).equals(word)&&i<str.length()-word.length()) {
				ret+=word;
				i+=word.length()-1;
				;
			} else ret+="+";
			
			
		}
	
	
		return ret;
	}

}
