package codingBat;

public class MixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public String mixString(String a, String b) {
		 String ret= "";
		 for(int i=0;i<a.length()||i<b.length();i++) {
			 if(i<a.length()) {ret+=a.substring(i, i+1);}
			 if(i<b.length()) {ret+=b.substring(i, i+1);}
			 
		 }
		 
		 
		 return ret;
		}

	
}
