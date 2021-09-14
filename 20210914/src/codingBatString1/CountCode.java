package codingBatString1;

import java.util.regex.Pattern;

public class CountCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "coee";
		
		System.out.println(s1.contains("co[^d]e"));
		System.out.println(CountCode(s1));
	}

	public static int CountCode(String str) {
		
		int count=0;
//		for (int i= 0 ; i<str.length()-3; i++){
//			if(str.charAt(i)=='c'&&str.charAt(i+1)=='o'&&str.charAt(i+3)=='e'
//					
//					){ count++;}
//			
//		}

		for(int i =0; i<str.length()-3;i++) {
			String sub = str.substring(i, i+4);
			if(Pattern.matches("co.d", sub)) {
				count++;
			}
		}
		
		return count;

	
	
	
	
	}
}
