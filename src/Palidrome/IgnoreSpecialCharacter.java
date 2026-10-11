package Palidrome;

public class IgnoreSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="madam!!";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
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
