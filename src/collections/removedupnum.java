package collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class removedupnum {
 public static void main(String[] args) {
	 int num = 11223344;
	 Set<Integer> s1 = new LinkedHashSet<>();
	 while(num!=0){
		 int rem = num%10;
		 s1.add(rem);
		 num = num/10;
	 }
	 for(int x : s1) {
		 System.out.print(x +" ");
	 }
}
}


