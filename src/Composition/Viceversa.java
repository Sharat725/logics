package Composition;

import java.util.Scanner;

public class Viceversa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
//		String s="MeThOd";
		String res="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				res=res+(char)(ch[i]+32);
			}
			else {
				res=res+(char)(ch[i]-32);
			}
		}
		System.out.println(res);
		sc.close();
	}
}
