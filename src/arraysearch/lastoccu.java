package arraysearch;

public class lastoccu {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,2,6};
		int search = 2;
		for(int i = a.length-1;i>=0;i--) {
			if(a[i]==search) {
				System.out.println("index -"+i);
				return;
			}
		}
		System.out.println("value not found");
	}
}
