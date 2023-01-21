package Java_Training;

import java.util.HashMap;
import java.util.Map;

public class StringToCharArray {
	public static void main(String[] args) {
		String s = "Welcome To Java";
		char[] a = s.toCharArray();
		Map<Character,Integer> m = new HashMap<>();
		for(char c:a) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			} else {
				m.put(c, 1);
			}
		
	}
		System.out.println(m);}
}
