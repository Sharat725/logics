package movingElementsFirstandLast;
// without sorting

import java.util.Arrays;

public class PositiFirst {
	public static void main(String[] args) {
		int[] arr= {-1,3,-2,-5,6,4,0};
		int i=0,j=arr.length-1;
		while(i<j) {
			if(arr[i]>0) {
				i++;
			}else if(arr[j]<0) {
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
