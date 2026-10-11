package numbers;

public class SpyNum {
	public static void main(String[] args) {
		int num = 123;
		int sum=0,product =1;
		while(num!=0) {
			int rem = num%10;   
			sum+=rem;
			product*=rem;
			num=num/10;
		}
		if(sum==product){                    // 123 - > 1+2+3 =6   1*2*3=6 6=6
			System.out.println("Spy");	
		}else {
			System.out.println("Not Spy");	
		}
		
	}
}
