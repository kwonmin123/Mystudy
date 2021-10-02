package codingBatString3;

public class Ex04 {

	public boolean gHappy(String str) {
		if(str.length()==1) {return false;}
		if(str.contains("g")) {
			if(str.charAt(0)=='g') {
				if(str.charAt(1)!='g') {return false;}
			}
			if(str.charAt(str.length()-1)=='g') {
				if(str.charAt(str.length()-2)!='g') {return false;}
			}
			for(int i=1;i<str.length()-1;i++) {
				if(str.charAt(i)=='g') {
					if(!(str.charAt(i+1)=='g'||str.charAt(i-1)=='g')) {return false;}

				}
			}
			return true;


		}



		return true;
	}
}


