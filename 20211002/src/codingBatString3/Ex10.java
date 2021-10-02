package codingBatString3;



public class Ex10 {
	public  int sumNumbers(String str) {
		str =str.replaceAll("\\D", " ");
		int sum = 0; 
		String []a= str.split("[ ]+");
		for(String s: a) {
			if(s.length()!=0) {
				sum+=Integer.parseInt(s);
			}
		}
		return sum;
	}


}
