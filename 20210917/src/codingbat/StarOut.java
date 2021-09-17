package codingbat;

public class StarOut {

	public String starOut(String str) {
	str=str.replaceAll("[^*]?[*]+[^*]?", "");
		return str;
	}

}
