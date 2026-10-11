package frequency;

public class LowerCase {
	public static void main(String[] args) {
		String s="HelloJava";
		int[] arr=new int[127];
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
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
