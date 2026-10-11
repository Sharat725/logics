package numbers;

public class DisariumNum {
public static void main(String[] args) {
	// count    //sum     //compare
	int num =135,no=num,copy=num; 
	int sum=0,count=0;
	while(num!=0) {   	//count                
		count++;                                
		num = num/10;                        
	}                                           
	while(no!=0) {        //sum                      //135   1¹ + 3² + 5³ = 135
		int rem = no%10;                            
		sum+=Math.pow(rem, count);
		count--;                                    
		no=no/10;
	}
	
	if(copy==sum){                                 
		System.out.println("Disarium");
	}else { 
		System.out.println("Not Disarium");        
										        
	}
}
}
