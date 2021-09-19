package codingbat;

public class WordEnd {

	
	public String wordEnds(String str, String word) {
		String ori=str;
		
		String ret = "";
		while(str.indexOf(word)>=0) {
			if(str.indexOf(word)-1>=0) {
				ret+=str.charAt(str.indexOf(word)-1);
				}
			if(str.indexOf(word)+word.length()<str.length()) {
				ret+=str.charAt(str.indexOf(word)+word.length());
			}
			str=str.substring(str.indexOf(word)+word.length());
		}
		String a=word+word;
		
		
		if(ori.endsWith(a)) {
			ret+=word.charAt(word.length()-1);
		}
		
		
		  
		  
		  
		return ret;
	}

}
