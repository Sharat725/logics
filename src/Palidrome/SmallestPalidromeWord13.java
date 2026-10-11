package Palidrome;

public class SmallestPalidromeWord13 {
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
	int min=s.length();
	for (int i = x.length-1; i >=0 ; i--) {
	if(isPalindrome(x[i])) {
		min=Math.min(min, x[i].length());
		
	}
	}
	for (int i = x.length-1; i >=0 ; i--) {
	if(isPalindrome(x[i])&&x[i].length()==min) {
		System.out.println(x[i]);
		}
	}
	}

}
