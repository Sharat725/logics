package primeAssignment;

public class LargestPrime {
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7,8,11,3};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				max=Math.max(max, arr[i]);
//				count++;
			}
		}
		System.out.println(max);
	}

}
