package movingElementsFirstandLast;

import java.util.Arrays;

public class ZeroLast {
	public static void main(String[] args) {
		int[] arr= {0,1,0,2,0,3,0,4};
		
		// with using temp Array
//		int[] temp=new int[arr.length];
//		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
//				temp[j++]=arr[i];
//			}
//		}
//		System.out.println(Arrays.toString(temp));
		
		
		//without using temp Array
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j++]=arr[i];
			}
		}
		while(j<arr.length) {
			arr[j++]=0;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
