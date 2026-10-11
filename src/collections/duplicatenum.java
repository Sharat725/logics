package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicatenum {
public static void main(String[] args) {
	int num = 123412;
	Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
	while(num!=0) {
		int rem = num%10;
		m.put(rem, m.getOrDefault(rem, 0)+1);
		num/=10;
	}
	
	for(Entry<Integer, Integer> y: m.entrySet()) {
		if(y.getValue()>1) {
			System.out.println(y.getKey()+" is repeated "+y.getValue());
		}
	}
}
}
