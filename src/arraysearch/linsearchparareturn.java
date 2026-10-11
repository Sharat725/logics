package arraysearch;

public class linsearchparareturn {
	static int search(int[] arr,int target){
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
				
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {6,5,2,4,1,3};
		System.out.println(search(arr,6));;
	}

}
