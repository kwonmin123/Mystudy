package day01;

public class Casting01 {
	public static void main(String[] args) {
		
		/*크기가 작은 타입을 큰타입에 넣을때
		 * JVM자동으로 형변환 진행
		 * 
		 */
		
		
		byte b=10;
		short s=b;//byte >short
		int i= s; //short >int
		long l=i; //int >long
	
	System.out.println(s);
	char c='가';
	int a = c; //char>int 형으로
	System.out.println("가의유니코드 숫자값"+a);
	int k= 1000;
	double d=k;//ctrl+d는 한줄삭제
	
	System.out.println(d);

	}

}
