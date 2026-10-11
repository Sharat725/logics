package numbers;

public class ArmstrongNum {
public static void main(String[] args) {
	// count    //sum     //compare
	int num =370,no=num,copy=num; 
	int sum=0,count=0;
	while(num!=0) {   	//count                
		count++;                                
		num = num/10;                        
	}                                           
	while(no!=0) {                               
		int rem = no%10;                            // 150    1³ + 5³ + 3³ = 153
		sum+=Math.pow(rem, count);                 //370     3³ + 7³ + 0³ = 370
		no=no/10;
	}
	
	if(copy==sum){                                 
		System.out.println("Armstrong");
	}else { 
		System.out.println("Not Armstrong");        
										        
	}
}
}
