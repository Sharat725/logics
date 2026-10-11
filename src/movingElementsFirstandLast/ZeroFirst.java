package movingElementsFirstandLast;

import java.util.Arrays;


public class ZeroFirst {
	public static void main(String[] args) {
		int[] arr= {0,1,0,2,0,3,0,4};
		// with sorting;
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		// without sorting
		
		int i=0,j=arr.length-1;
		while(i<j) {
			if(arr[i]==0) {
				i++;
			}else if(arr[j]!=0) {
				j--;
				
			}else {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	

}
