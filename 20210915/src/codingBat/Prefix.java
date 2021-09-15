package codingBat;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prefixAgain("aabbcc", 1));
	}

	public static boolean prefixAgain(String str, int n) {
		  boolean result = false;
		    if (n < str.length() && 
		            (str.substring(1)).indexOf(str.substring(0,n)) > -1
		            ) {
		        result = true;
		    }
		    return result;
		}

}
