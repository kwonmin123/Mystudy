package day01;

public class Datatype2 {
	
	public static void main(String[] args) {
	//문자형
	char c1 ='A';
	char c2 =600;
	char c3 = 44032;
	char c4 ='가';
	char c5 = '\uAC00';			
			
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
			
		
	System.out.println(c3+c4+c5);
	System.out.println(c3+""+c4+""+c5);
		
		//문자열 
		String s1 ="hello";
		String s2 ="world";
		String s3 ="java";

		System.out.println(s1+s2+s3);
		System.out.println("문자열의길이:"+s1.length()
		+s2+s3);
		
		//문자열과 다른데이터 타입의 +연산
		
		System.out.println(22+22);
		System.out.println(100+200+"300"+200);
		
		System.out.println("300"+00+(0000+200)+200);
		
		System.out.println('A'+20);
		System.out.println("A"+20);
		
		float x=365655.44555555555555144444444477F ;
	}

}
