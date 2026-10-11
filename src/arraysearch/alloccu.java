package arraysearch;

public class alloccu {
	public static void main(String[] args) {
		int[] a = {1,2,3,2,5,6};
		int search = 2;
		boolean f = false;
		for(int i = 0;i<a.length;i++) {
			if(a[i]==search) {
				System.out.println("index -"+i);
				f=true;
			}
		}
		if(!f) {
			System.out.println("value not found");
		}
	}
}
