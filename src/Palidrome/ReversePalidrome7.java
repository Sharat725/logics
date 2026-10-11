package Palidrome;



public class ReversePalidrome7 {

	public static void main(String[] args) {
		String s ="radar";
//		String res="";
//		for(int i=s.length()-1;i>=0;i--) {
//			res=res+s.charAt(i);
//		}
//		if(s.equals(res)) {
//			System.out.println("palin");
//		}else {
//			System.out.println("Not");
//		}
		
		
		
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j]) {
				System.out.println("Not peli");
				return;
			}
			i++;j--;
		}
		System.out.println("Pali");
//		
	}

}
