package genericTextBook;

public class Container02<T1, T2> {
T1 t1;
T2 t2;
T1 getKey() {
	return t1;
}
T2 getValue() {
	return t2;
}
void set(T1 t1,T2 t2) {
	this.t1 = t1;
	this.t2 = t2;
}

}
