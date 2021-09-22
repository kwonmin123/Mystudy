+
package genericExample;

import java.util.Arrays;
import java.util.List;

class Product<T,M>{
	private T kind;
	private M model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
public class P659 {
	
	static class Car{}
	static class Tv{}
	public static void main(String[] args) {
	
		
		String a= "abcd";
		
		List<String> list1 = Arrays.asList(a.split(""));
		for(String c :list1) {
			System.out.println(c);
		}
		//System.out.println(list1.get(7));
		
		Product<Character, String> product1 = new Product<Character, String>();
		product1.setKind('.');
		product1.setModel("스마트Tv");
		char tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
