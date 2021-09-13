package day01;

public class VariableScope {
public static void main(String[] args) {

	int num1 =2 ,num2=-5 ;
	int num3 =3;
	int num4= 0;
	

	if(true) { num3 = num1+num2;
	num4=100;
	System.out.println(num3);
	System.out.println(num4);
	
	}
	System.out.println(num3);
	
	//char 한글자 //
	//불린 1바이트//
	
	System.out.println(num4);
	//괄호안에 변수는 어떻게 밖에서 사용할까? 변수를 밖으로 뺀다//
	//num3은 {}밖에서 사용불가//
	
	
}
}
