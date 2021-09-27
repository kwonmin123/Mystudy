package genericTextBook;

public class Pair<K,V> {
private  K key;
private  V value;
public Pair(K key, V value) {
	super();
	this.key = key;
	this.value = value;
}
 K getKey() {
	return key;
}

 V getValue() {
	return value;
}


}
