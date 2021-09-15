package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz01 {
	
	public static void main(String[] args) {
		// l을 입력받으면 리스트 목록이 출력
		// e를 입력받으면 종료
		// 이외의 값을 입력받으면 리스트에 추가되는 프로그램
		List<String> list1 = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("l : list ,r : 제거 e : exit 입력");
			String input1 =sc.nextLine();
			if(input1.equals("e")) {
				break;
			} else if(input1.equals("l")){
				for(String s :list1) {
					System.out.println(s);
				
				}
				continue;
			} else if(input1.equals("r")) {
				try {
					list1.remove(list1.size()-1);	
				} catch (Exception e) {
					// TODO: handle exception
				}
			} 
			else list1.add(input1);
			
			
		}
		
		
//		System.out.print("l : list , e : exit 입력");
//		String input1 =sc.nextLine();
//		
//		if(input1.equals("l")) {
//			System.out.println("");}
//		else  {
//			
//			list1.add(input1);
//		} 
//		while(!input1.equals("e")) {
//			System.out.print("l : list , e : exit 입력");
//			input1 =sc.nextLine();
//			if(input1.equals("l")) {
//				for(String s :list1) {
//					System.out.println(s);
//				
//				}
//				continue;
//			}
//			list1.add(input1);
//			
//		}
	
		
		
		
sc.close();
	}

}
