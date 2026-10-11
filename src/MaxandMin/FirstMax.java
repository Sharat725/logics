package MaxandMin;

public class FirstMax {
	public static void main(String[] args) {
		int[] arr= {5,4,1,6,3,2};
		int max=Integer.MIN_VALUE;
		for(int x:arr) {
			if(x>max)
				max=x;
				
	}
		System.out.println(max);
	}

}
