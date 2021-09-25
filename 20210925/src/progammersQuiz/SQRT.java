package progammersQuiz;

public class SQRT {
public static void main(String[] args) {
	int n= 100;
	if(Math.sqrt(n)==(int)Math.sqrt(n)) {
		System.out.println((Math.sqrt(n)+1)*(Math.sqrt(n)+1));
	}
	else {
		System.out.println(-1);
	}

}
}
