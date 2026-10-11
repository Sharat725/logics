package MissingSequence;

import java.util.Arrays;

public class WithoutSorting {
	static boolean contains(int a,int[] arr) {
		for(int x:arr) {
			if(x==a) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[] arr= {15,6,10,1,13,2};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int x:arr) {
			if(x>max) {
				max=x;
			}
			if(x<min) {
				min=x;
			}
		}
		for(int i=min;i<=max;i++) {
			if(!contains(i, arr)) {
				System.out.println(i);
			}
		}
	}

}
