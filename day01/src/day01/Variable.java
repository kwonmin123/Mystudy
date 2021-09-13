package day01;

public class Variable {
	public static void main(String[] args) {
	
/*
 * 변수의 선언방법
 * 데이터타입, 이름;
 * int 정수 저장하는 대표적인 타입
 * String 문자열을 저장하는 대표적은 타입 핸드폰번호같은
 * 
 */
	int num;
	
	//변수선언//
	
	num = 14;
	
	//초기화//
	
	System.out.println(num);
	
	int num2 = 13 ;

	//선언과 초기화 과정합칠수 있음//
	
	int num3 = 12 ;
	

	num2 = num+num3;
	num3 = num+num2;
	
	int result = num+num2;
	//변수는 다른변수의 값이나 연산의 결과도 저장가능//
			
	System.out.println(num2);
	
	System.out.println("--------------------------");
	
	int a;
	int b;
	int result2;
	
	a= 32;
	b= 20;
	result2 = a-b;
	result2 = 1000;
	
	System.out.println("reusult2="+result2);
	
	System.out.println("--------------------------");

	String name = "권민서";
	//int str =name 타입이 달라서 불가//
	String phoneNum="1013565" ;
	
	
	
	}

}
