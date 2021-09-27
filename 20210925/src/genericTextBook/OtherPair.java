package genericTextBook;

public class OtherPair<T1, T2> {
private T1 key;
private T2 value;
public OtherPair(T1 key, T2 value) {
	super();
	this.key = key;
	this.value = value;
}
private T1 getKey() {
	return key;
}

private T2 getValue() {
	return value;
}


}
