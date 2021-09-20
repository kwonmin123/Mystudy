package codingbatLogicQuiz1;

public class ShareDigit {
	public boolean shareDigit(int a, int b) {
//		 String a1= a+""; 
//		 String b1= b+"";
//		 
//		 if(a1.charAt(0)==b1.charAt(0)||a1.charAt(0)==b1.charAt(1)) {return true;}
//		 if(a1.charAt(1)==b1.charAt(0)||a1.charAt(1)==b1.charAt(1)) {return true;}
//		 return false;
if(a%10==b%10||a%10==b/10) {return true;}	
if(a/10==b%10||a/10==b/10) {return true;}	
	return false;
	
	}

}
