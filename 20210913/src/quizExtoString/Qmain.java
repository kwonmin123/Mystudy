package quizExtoString;
	

public class Qmain {
	
	
		
	public static void main(String[] args) {
		// 아래의 Car 오브젝트에 쓰는 메쏘드 toString을 적절하게 오버라이딩해보자
		// car1 = 테슬라 15000
		// car2 =  기아 10000
		//System.out.println(car1.toString());
		//System.out.println(car2.toString());
	Car car1 = new Car("테슬라", 15000);
		System.out.println(car1);
		System.out.println(car1.toString());
		
		

	}




}


 class Car{
	String name;
	int price;
	
	
	
	public	Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return "회사 : "+name+ "가격 : "+price+"달러";
		
	}
 }