package codingBatString1;

public class XyBal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean xyBalance(String str) {
		int a=str.indexOf("x");
		int b=str.lastIndexOf("x");
		int c=str.lastIndexOf("y");
		
		if(str.indexOf("x")>=0) {
			if(c>=0&&c>b) {return true;}
		}
		
		return a<0;
		}
}
