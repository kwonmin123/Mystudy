package codingBatString1;


public class XyzThere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str= "sdsd.sd.sdsd";
		System.out.println(str.contains("dsd"));
		
	
		
		String[] sp=str.split("[s]");
		System.out.println(sp[2]);

		System.out.println(xyzThere("zzxyz.sss"));
	}

	public static boolean xyzThere(String str) {
	    if(str.length() >= 3 && str.substring(0, 3).equals("xyz"))
	        return true;
	          
	    for(int i = 1; i < str.length() - 2; i++) {
	        if(str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz"))
	            return true;
	    }
	                          
	    return false;
	    }
}
