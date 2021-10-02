package codingBatString3;

public class Ex05 {
public static void main(String[] args) {
	String a= "f";

	System.out.println(countTriple(a));
}
	public static int countTriple(String str) {
		 int count =0;
		for(int i = 0; i<str.length()-2; i++) {
			if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i+1)==str.charAt(i+2)) {
				count++;
			}
		}
		
		return count;
	}

}
