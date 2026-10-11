package Palidrome;

public class IgnoreaseAndSpace5 {
	public static void main(String[] args) {
		String s="Never Odd or Even";
		String s1=s.toLowerCase().replace(" ", "");
//		System.out.println(s1);
		char[] ch=s1.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j]) {
				System.out.println("Not peli");
				return;
			}
			i++;j--;
		}
		System.out.println("Pali");
	}
}
