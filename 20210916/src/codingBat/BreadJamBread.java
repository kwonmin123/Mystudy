package codingBat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BreadJamBread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getSandwich("xxbreadjambreadyy"));
	}
	
	public static String getSandwich(String str) {
		String ret ="";
//		Pattern p =Pattern.compile(".*bread(.*)bread.*");
//		Matcher m=p.matcher(str);
//		if(Pattern.matches(".*bread(.*)bread.*", str)) {
//			return m.group(1);
		
		if(Pattern.matches(".*bread.*bread.*", str)) {
		ret+=str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread"));		
	}
		
		
		
		return ret;
	}

}
