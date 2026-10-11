package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduparrval {
 public static void main(String[] args) {
	 int[] arr = {1,2,2,3,4,5,5,6};
	 Set<Integer> s1 = new LinkedHashSet<>();
	 for(int x:arr) {
		 s1.add(x);
	 }
	 for(int y : s1) {
		 System.out.print(y +" ");
	 }
	 
//	 System.out.println(s1);
	 
}
}

