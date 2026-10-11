package Palidrome;

public class PrintPalidrome8 {
	
	static boolean isPalindrome(String s) {
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j]) {
		
				return false;
			}
			i++;j--;
		}
		 return (s.equals(new String(ch)));
		
	}

	public static void main(String[] args) {
		
		
String s="java level madam code ";
String[] x =s.split(" ");
for (int i = 0; i < x.length; i++) {
	if(isPalindrome(x[i])) {
		System.out.println(x[i]);
	}
}
	}

}
