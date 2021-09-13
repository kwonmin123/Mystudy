package day01;

public class Casting02 {
public static void main(String[] args) {
	
	
	/*
	 * 크기가 큰타입을 작은 타입으로 변환할때는
	 * (type)캐스팅을 이용하여 명시적으로 변환
	 */
int i =65;
char c = (char)i;
short s= (short)i;

System.out.println(c);
System.out.println(s);

double d =3.14;
float f=(float)d;
	int k=(int)d;
	System.out.println(f);
	System.out.println(k);

	int a= 1000;
	byte b=(byte)a;
	
	//강제타입변환시 주의할점은 범위밖의 값은 잘리고 남은 값들이 저장됨
	//char, short 는 예외적으로 명시적 형변환을 해야함
	
	char ss= 'a';
	short cc=(short)ss;
	
}
}
