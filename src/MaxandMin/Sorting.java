package MaxandMin;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] arr= {5,4,1,6,3,2};
		Arrays.sort(arr);
		System.out.println("1st max:"+arr[arr.length-1]);
		System.out.println("2nd max:"+arr[arr.length-2]);
		System.out.println("3rd max:"+arr[arr.length-3]);
		System.out.println("1st min:"+arr[0]);
		System.out.println("2nd min:"+arr[1]);
		System.out.println("3rd min:"+arr[2]);
	}

}
