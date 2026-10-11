package Palidrome;

public class CountPalidrome9 {
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
int count=0;
for (int i = 0; i < x.length; i++) {
	if(isPalindrome(x[i])) {
		count++;
	}
}
System.out.println(count);

	}

}
