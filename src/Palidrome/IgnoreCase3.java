package Palidrome;

public class IgnoreCase3 {
 static String reverse(String s) {
	 char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;j--;
		}
		return new String(ch);
 }
	public static void main(String[] args) {

		String s1 = "BleveLb";
		String s2=reverse(s1);
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("it is palidrome");
		}
		else {
			System.out.println("Not a palidrome");
		}
	}

}
