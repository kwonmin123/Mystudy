package genericTextBook;

public class Util {

	public static<K,V> V getValue(Pair<K, V> pair, K k) {
		// TODO Auto-generated method stub
		if(pair.getKey()==k) {return pair.getValue();}
		return null;
	}

	

}
