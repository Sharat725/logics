package ArrayPractice;

public class SumEvenOnly {
	public static void main(String[] args) {
		int sum=0;
		int[] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		
		int proAll=1;
		for(int i=0;i<arr.length;i++) {
			
				proAll=proAll*arr[i];
			
		}
		System.out.println(proAll);
		
		int product=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				product=product*arr[i];
			}
		}
		System.out.println(product);
		
	}

	
	
}
