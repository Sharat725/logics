package arraysearch;

public class linsearch {
public static void main(String[] args) {
	int[] a = {1,2,3,4,5,6};
	int search = 2;
	for(int i = 0;i<a.length;i++) {
		if(a[i]==search) {
			System.out.println("index -"+i);
			return;
		}
	}
	System.out.println("value not found");
}
}
