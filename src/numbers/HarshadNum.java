package numbers;

public class HarshadNum {
public static void main(String[] args) {
	int num = 21,no=num;
	int sum=0;
	while(num!=0) {
		int rem = num%10;   
		sum+=rem;
		num=num/10;
	}
	if(no%sum==0){                       // 18 - > 1+8 =9   18/9=0  ,   21 - > 2+1=3 21/3=0
		System.out.println("Harshad");	
	}else {
		System.out.println("Not Harshad");	
	}
}
}
