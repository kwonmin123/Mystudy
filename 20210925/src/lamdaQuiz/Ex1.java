package lamdaQuiz;

public class Ex1 {
	public static void main(String[] args) {
		MyInterface1 o1;
		o1 = ()->{
			for(int i=1 ;i<=5;i++) {System.out.println(i);}
			};
		// 코드 작성
		
		o1.method();
		// 실행 결과
		// 1 ~ 5까지 출력
	}
}


interface MyInterface1 {
	public void method();

}
