package codingbatQuiz.Array01;

public class Front11 {

	public int[] front11(int[] a, int[] b) {
		if(a.length==0&&b.length==0) {
			int []ret= {};
			return ret;
		}
		if(a.length==0) {
			int []ret= {b[0]};
		return ret;
		}
		if(b.length==0) {
			int []ret= {a[0]};
		return ret;
		}
		
		
		int []ret = {a[0],b[0]};
		return ret;
	}

}
