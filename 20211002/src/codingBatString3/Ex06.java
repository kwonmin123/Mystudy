package codingBatString3;

public class Ex06 {
	public static void main(String[] args) {
		String a ="12385edfe3c8";

		a=a.replaceAll("\\D", "");
		System.out.println(a);
	}
	public int sumDigits(String str) {
		str= str.replaceAll("\\D", "");
		int sum=0;
		for(int i=0; i<str.length();i++) {
			String temp= str.substring(i,i+1);
			sum+=Integer.parseInt(temp);
		}
		return sum;
	}

}
