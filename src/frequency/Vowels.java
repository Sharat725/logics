package frequency;

public class Vowels {
	static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E' ||ch=='I'||ch=='O'||ch=='U';
		
	}
	public static void main(String[] args) {
		String s="HelloJava";
		int[] arr=new int[127];
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(isVowel(ch)) {
			arr[ch]++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println((char)i+" "+arr[i]);
			}
		}
	}
}
