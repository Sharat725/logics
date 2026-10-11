package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class frequencyofarray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,4,5,6};
	Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
	for(int x: arr) {
		m.put(x, m.getOrDefault(x, 0)+1);
	}
	for(Entry<Integer, Integer> y: m.entrySet()) {
		System.out.println(y.getKey()+" "+y.getValue());
	}
}
}
