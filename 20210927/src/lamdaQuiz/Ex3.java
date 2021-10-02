package lamdaQuiz;

public class Ex3 {
	public static void main(String[] args) {
//		MyInterface3 o1 = () -> { return ((int) (Math.random() * 10)) + 1; }; // 적절한 코드 완성
		MyInterface3 o1 = () -> (int) (Math.random() * 10) + 1; // 적절한 코드 완성
		
		System.out.println(o1.method()); // 출력 : 1~10 사이의 랜덤값 1개
	}
}

interface MyInterface3 {
	int method();
}
