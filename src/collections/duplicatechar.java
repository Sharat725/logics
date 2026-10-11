package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicatechar {
public static void main(String[] args) {
	String s ="abaccdcc";
	Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
	for(char x: s.toCharArray()) {
		m.put(x, m.getOrDefault(x, 0)+1);
	}
	for(Entry<Character, Integer> y: m.entrySet()) {
		if(y.getValue()>1) {
			System.out.println(y.getKey()+" is repeated "+y.getValue());
		}
	}
}
}
