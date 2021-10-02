package lamdaQuiz;

public class Ex2 {
	public static void main(String[] args) {
		MyInterface2 o1;   // 적절한 코드 작성
		MyInterface2 o2;   // 적절한 코드 작성
		MyInterface2 o3;   // 적절한 코드 작성
		o1= () -> System.out.println("hello");
		o2= () -> System.out.println("java");
		o3= () -> System.out.println("worlds");		
		
		o1.method(); // hello
		o2.method(); // java
		o3.method(); // java
		
		// 출력
		// hello
		// java
	}
}

interface MyInterface2 {
	void method();
}
