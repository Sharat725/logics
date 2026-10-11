package StringSplit;

public class RetainSpace {
	public static void main(String[] args) {
		String s ="hi hello how are you";
		char[] ch = s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]==' ') {
				i++;
			}
			else if(ch[j]==' ') {
				j--;
			}
			else {
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(ch);
		
	}
}
