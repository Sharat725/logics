package collections;

import java.util.Arrays;

public class anagram {
public static void main(String[] args) {
	String a = "cat";
	String b = "act";
	if(a.length()==b.length()) {
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c1);
		for(int i=0;i<c2.length;i++) {
			if(c1[i]!=c2[i]) {
				System.out.println("not a anagram");
				return;
			}
		}
		System.out.println("Anagram");
	}
	else {
		System.out.println("not a anagram");
	}
}
}
