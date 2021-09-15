package codingBat;

public class XYZMiddel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean xyzMiddle(String str) {
		if(str.length()<3) {return false;}
			int a=str.length()-1;
		if(str.charAt(a/2)=='y'&&str.charAt((a/2)+1)=='z'&&str.charAt((a/2)-1)=='x'
		) {
			return true;
		}
		if(str.charAt(str.length()/2)=='y'&&str.charAt((str.length()/2)+1)=='z'&&str.charAt((str.length()/2)-1)=='x'
				) {
					return true;
				}
		return false;
		}
}
