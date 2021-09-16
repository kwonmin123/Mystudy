package jUnit;

import java.util.ArrayList;
import java.util.List;

public class Mirror {

	public <T> boolean mirror(List<T> arr) {
		for(int i=0 ; i<arr.size();i++) {
			if(!arr.get(i).equals(arr.get((arr.size()-1)-i))) {
				return false;
			}
		}
			
		
		
		return true;
	}
}
