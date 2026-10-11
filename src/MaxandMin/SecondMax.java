package MaxandMin;

public class SecondMax {

	public static void main(String[] args) {
		int[] arr= {5,4,1,6,3,2};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int x:arr) {
			if(x>fmax) {
				smax=fmax;
				fmax=x;
			}else if(x>smax) {
				smax=x;
			}
			
				
	}
		System.out.println(smax);
	}
}
