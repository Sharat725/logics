package StringSplit;

public class ReverseEachWord {
	static String reverse(String s) {
		char[] ch = s.toCharArray();
		int i = 0, j=ch.length-1;
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		String s ="hi hello how are you";
		String[] x=s.split(" ");
		for(int i=x.length-1;i>=0;i--) {
			System.out.print(reverse(x[i])+" ");
		}
	}
}
