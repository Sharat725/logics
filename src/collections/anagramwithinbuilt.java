package collections;

import java.util.Arrays;

public class anagramwithinbuilt {
public static void main(String[] args) {
	String a = "cat";
	String b = "act";
	if(a.length()==b.length()) {
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("not a Anagram");
		}
		
	}
	
}
}
