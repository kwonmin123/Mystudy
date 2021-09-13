package day01;

public class Datatype {
	public static void main(String[] args) {
		byte a=127;
		byte a1=-128;
		short b=32767;
		short b1=-32768;
		long c= 123123123123123L;
		int d= 2147482647;
		
		/* 2진수 저장할때0b붙임
		 * 8진수 0붙임
		 * 16진수 0x
		 */

		int bin= 0b1010;
		int bin2= 01010;

		System.out.println(bin2);
System.out.println("2진수 1010의값은"+bin+"입니다");

System.out.println("-----------------------------");

//실수형
float f1 = 3.14F;
//f 붙임 7자리까지 유효//

double d1 = 33.14;
//15자리까지 유효//
System.out.println(f1);
System.out.println(d1);
//e표기법
float f2= 3.14159265e-2F;
	double d2 = 3.14159265e3;
	System.out.println(d2);
	System.out.println(f2);
	System.out.println("-----------------------------");
//논리형 참 거짓 (1바이트_
	boolean bool1 =true;
	boolean bool2 =false;
	
	System.out.println(bool1);

	
	}

}
