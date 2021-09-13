package setQuiz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> set =new HashSet<>();
//		set.add("123");
//		System.out.println(set.size());//1
//		set.add("123");
//		System.out.println(set.size());//1
//		set.add("122");
//		System.out.println(set.size());//2
		
		//종류가 다른 것들만 추가 됨 1종류는 하나로 취급
		
		
		//객체가 같은 종류라는 것은 무슨 뜻일까?>>저장된 주소값이 같다  equals로 판별하고 equals 는 해쉬코드로 만들어짐 해쉬코드는 저장된 주소값으로 이뤄짐
		Set <Person> set01 = new HashSet<>();
		set01.add(new Person());
		System.out.println(set01.size());
		set01.add(new Person());
		System.out.println(set01.size());
		Person p1 = new Person();
		set01.add(p1);
		System.out.println(set01.size());
		set01.add(p1);
		set01.add(p1);
		set01.add(p1);
		System.out.println(set01.size());
	}

}


class Person {}