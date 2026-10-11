package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class removedupwords {
 public static void main(String[] args) {
	 String s = "hi hello how are how are you";
	 String[] ch = s.split(" ");
	 Set<String> s1 = new LinkedHashSet<>();
	 for(String x:ch) {
		 s1.add(x);
	 }
	 for(String y : s1) {
		 System.out.print(y +" ");
	 }
	 
//	 System.out.println(s1);
	 
}
}
