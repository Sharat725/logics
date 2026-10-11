package MaxandMin;

public class FirstandSecMax {
	public static void main(String[] args) {
		int[] arr= {5,7,1,6,3,2,7};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int x:arr) {
			if(x>fmax) {
				smax=fmax;
				fmax=x;
			}else if(x>smax && x!=fmax) {
				smax=x;
			}
			
				
	}
		System.out.println(fmax+" "+smax);
	}

}
