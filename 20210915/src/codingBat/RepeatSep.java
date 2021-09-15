package codingBat;

public class RepeatSep {
public static void main(String[] args) {
	
	System.out.println(repeatSeparator("dd","sss",3));
}
	public static String repeatSeparator(String word, String sep, int count) {
		  String ret="";
		  for(int i=0;i<count*2-1;i++){
//		    if(i%2==1){
//		      ret+=sep;
//		    }  else ret+=word;
		 ret =  (i%2==1) ? ret+sep : ret+word;
		  
		  }
		  return ret;
		}

}
