package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class removedupchar {
 public static void main(String[] args) {
	 String s = "abacdbd";
	 char[] ch = s.toCharArray();
	 Set<Character> s1 = new LinkedHashSet<>();
	 for(char x:ch) {
		 s1.add(x);
	 }
	 for(char y : s1) {
		 System.out.print(y +" ");
	 }
	 
//	 System.out.println(s1);
	 
}
}
