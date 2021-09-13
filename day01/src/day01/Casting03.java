package day01;

public class Casting03 {

	public static void main(String[] args) {
		//연산에서 형변환
char c='a';
int i = 2;

int p= c;

int cc=c+(int)i;

char cs= (char)(c+i);
System.out.println(c+i);

System.out.println(p);

		//1. 큰타입을 따라간다(int 보다 작은 연산들은 int를 따라간다)

int u=3;
double k=3.14;
System.out.println(u+k);

//이 오차는 왜 생길까?


byte b1=100;
byte b2=12;
byte b3=(byte)(b1+b2);

short s1=102;
byte s2=11;
int s3= s1+s2; //int

	}
}
