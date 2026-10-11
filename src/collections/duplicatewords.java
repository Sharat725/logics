package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicatewords {
public static void main(String[] args) {
	String s ="Hi hello how are how Hi you";
	Map<String, Integer> m = new LinkedHashMap<String, Integer>();
	for(String x: s.split(" ")) {
		m.put(x, m.getOrDefault(x, 0)+1);
	}
	for(Entry<String, Integer> y: m.entrySet()) {
		if(y.getValue()>1) {
			System.out.println(y.getKey()+" is repeated "+y.getValue());
		}
	}
}
}
