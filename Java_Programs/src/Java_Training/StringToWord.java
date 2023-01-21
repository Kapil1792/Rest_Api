package Java_Training;
import java.util.HashMap;
import java.util.Map;

public class StringToWord {


	public static void main(String[] args) {
		String s = "Welcome To Java";
		String[] s1 = s.split(" ");
		
		Map<String,Integer> m = new HashMap<>();
		for(String c:s1) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			} else {
				m.put(c, 1);
			}
		
	}
		System.out.println(m);}
}


