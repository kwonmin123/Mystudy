package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("0 : 종료 ,1 : 출력 점수(50이상)>");
			int input1 =sc.nextInt();
			switch(input1) {
			case 0 : run=false;
				break;
			case 1 : 
				for (int s : list1) {
				if(s>=50) {
				System.out.println(s);
				}	
			}
				break;
			default : list1.add(input1);
				break;
			}
		}
		sc.close();

	}
}