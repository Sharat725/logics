package rotations;

import java.util.Arrays;

public class LrftRotation {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int k=8;
		k=k%a.length;
		for(int i=0;i<k;i++) {
			int first=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println(Arrays.toString(a));
	}

}
