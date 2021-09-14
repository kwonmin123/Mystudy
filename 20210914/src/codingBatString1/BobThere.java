package codingBatString1;

public class BobThere {

	public boolean bobThere(String str) {
		  for(int i=0;i<str.length()-2;i++){
		    String sub=str.substring(i,i+3);
		    
		    if(java.util.regex.Pattern.matches("b.b",sub)){return true;}
		  }
		  
		  return false;
		}

}
