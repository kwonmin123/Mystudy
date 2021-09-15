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
			System.out.print("0 : 종료 ,1:출력 2 :삭제 3: 통계 4: 평균 5:최대최소 점수(50이상)>");
			int input1 =sc.nextInt();
			switch(input1) {
			case 0 : run=false;
			break;
			case 1 : 
				for (int s : list1) {

					System.out.println(s);

				}
				break;
			case 2 : 
				if(list1.size()>0) {
					list1.remove(list1.size()-1);}	
				break;
			case 3 : 
				int sum=0;
				for (int s : list1) {

					sum+=s;
				}
				System.out.println(sum);
				break;
			case 4 : 
				double sum1=0;
				for (int s : list1) {

					sum1+=s;
				}
				System.out.println(sum1/list1.size());
				break;	
			case 5 : 
				int maxi=0;
						
				int mini=Integer.MAX_VALUE;
				for(int i=0;i<list1.size();i++) {
					if(list1.get(i)<mini) {
						mini=list1.get(i);
					}
				}
				
				for(int i=0;i<list1.size();i++) {
					if(list1.get(i)>maxi) {
						maxi=list1.get(i);
					}
				}
				
				
				System.out.println("최댓값:"+maxi);
				System.out.println("최소값:"+mini);
				break;
			default :
				if(input1>=50) {
					list1.add(input1);
				}
			
				
				break;
			}
		}
		sc.close();

	}
}