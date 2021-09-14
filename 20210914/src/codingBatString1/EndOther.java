package codingBatString1;

public class EndOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public boolean  endOther(String a, String b) {
		if(a.length()<b.length()) {
			String temp=a;
			a=b;
			b=temp;
		}
		//a가 더 길게 만들었음
		a=a.toLowerCase();
		b=b.toLowerCase();
		//대소문자 삭제
		
		
		return a.substring(a.length()-b.length()).equals(b);
	}

}
