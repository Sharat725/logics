package ArrayPractice;

public class ForwardHalh {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length/2;i++) {
			System.out.print(arr[i]);
		}
		System.out.print(" ");
		for(int i=arr.length/2;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
