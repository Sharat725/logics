package MaxandMin;

public class SecondMin {
	public static void main(String[] args) {
		int[] arr= {5,4,1,6,3,2};
		int fmin=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		for(int x:arr) {
			if(fmin>x) {
				smin=fmin;
				fmin=x;
			}else if(smin>x) {
				smin=x;
			}
			
				
	}
		System.out.println(smin);
	}

}
