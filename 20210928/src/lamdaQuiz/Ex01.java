package lamdaQuiz;

import java.util.List;
import java.util.Arrays;
public class Ex01 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 6);
	
		method(list,num->System.out.println(num) ); // 코드 완성
		method(list,num->System.out.println("item : "+num) ); // 코드 완성
		method(list,num->System.out.println("item : "+num*2) ); // 코드 완성
	}
	public static void method(List<Integer> list, MyInterface4 c) {
		for (int item : list) {
			c.method(item);
		}
	}
}



interface MyInterface4 {
	void method(int num);
}
