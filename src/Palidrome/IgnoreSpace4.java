package Palidrome;

public class IgnoreSpace4 {

	public static void main(String[] args) {

		String s = "nurses run";
		String s1=s.replace(" ", "");
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
//		if (CheckPalidrome1.isPalidrome(s.replaceAll("\\s", ""))) {
//			System.err.println("it is palidrome");
//		} else {
//			System.out.println("Not a palidrome");
//		}
	}

}
