package codingBat;

public class RepeatSep {

	public String repeatSeparator(String word, String sep, int count) {
		  String ret="";
		  for(int i=0;i<count*2-1;i++){
		    if(i%2==1){
		      ret+=sep;
		    }  else ret+=word;
		    
		  
		  }
		  return ret;
		}

}
