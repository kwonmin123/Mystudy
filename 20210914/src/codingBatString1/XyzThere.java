package codingBatString1;

import java.util.Arrays;

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
		  String[] sp=str.split("\\.");
	System.out.println(Arrays.toString(sp));
	return  sp[0].contains("xyz");
				  
	}

}
