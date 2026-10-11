package MaxandMin;

public class ThirdMin {
	public static void main(String[] args) {
		int[] arr= {5,4,1,6,3,2};
		int fmin=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		int tmin=Integer.MAX_VALUE;
		for(int x:arr) {
			if(fmin>x) {
				tmin=smin;
			smin=fmin;
			fmin=x;
			}
			else if(smin>x) {
				tmin=smin;
				smin=x;
			}
			else if(tmin>x) {
				tmin=x;
			}
				
	}
		System.out.println(tmin);
	}

}
