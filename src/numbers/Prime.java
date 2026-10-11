package numbers;

import java.util.Scanner;

public class Prime {
	
	static boolean isPrime(int no) {
		if(no <= 1) {
			return false;
		}else {
			for(int i=2; i<=Math.sqrt(no);i++) {
				if(no%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		if(isPrime(sc.nextInt())) {
			System.out.println("Prime num");
		}
		else {
			System.out.println("Not a prime");
		}
		
		sc.close();
		
	}

}
