package MaxandMin;

public class ThirdMax {
	public static void main(String[] args) {
		int[] arr= {5,4,1,6,3,2};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		for(int x:arr) {
			if(x>fmax) {
				tmax=smax;
			smax=fmax;
			fmax=x;
			}
			else if(x>smax) {
				tmax=smax;
				smax=x;
			}
			else if(x>tmax) {
				tmax=x;
			}
				
	}
		System.out.println(tmax);
	}

}
