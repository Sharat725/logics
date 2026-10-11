package numbers;

public class PerfectNum {
public static void main(String[] args) {
	int num = 28;
	int sum = 0;
	for(int i =1;i<=num/2;i++) { 
		if(num%i==0) {
			sum+=i;
		}
	}
	if(sum==num) {                                // 28 -> 1+2+4+7+14 = 28
		System.out.println("perfect");
	}else {
		System.out.println("not perfect");
	}
}
}
