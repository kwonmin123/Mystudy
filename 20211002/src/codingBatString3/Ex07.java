package codingBatString3;

public class Ex07 {
	public String sameEnds(String string) {

		int a=	(int) Math.floor((string.length())/2.0);
		for(int i=0;i<a;i++) {
			String half1=string.substring(0,(a-i));
			String half2=string.substring(string.length()-(a-i));
			if(half1.equals(half2)) {
				return half1;
			}
		}

		return "";
	}

}
