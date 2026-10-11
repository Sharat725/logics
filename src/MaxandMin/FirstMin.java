package MaxandMin;

public class FirstMin {
	public static void main(String[] args) {
		int[] arr= {5,4,1,6,3,2};
		int min=Integer.MAX_VALUE;
		for(int x:arr) {
			if(min>x)
				min=x;
				
	}
		System.out.println(min);
	}

}
