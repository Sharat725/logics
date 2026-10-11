package Palidrome;

//import java.sql.Struct;

public class LongestPalidromeWord12 {
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
	
	
String s="wow madam racecar level";
String[] x =s.split(" ");
int max=0;
for (int i = x.length-1; i >=0 ; i--) {
if(isPalindrome(x[i])) {
	max=Math.max(max, x[i].length());
	
}
}
for (int i = x.length-1; i >=0 ; i--) {
if(isPalindrome(x[i])&&x[i].length()==max) {
	System.out.println(x[i]);
	}
}

	}

}
