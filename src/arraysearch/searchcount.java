package arraysearch;

public class searchcount {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,2,6};
		int search = 2;
		int count = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]==search) {
				count++;
			}
		}
		System.out.println(count);
	}
}
