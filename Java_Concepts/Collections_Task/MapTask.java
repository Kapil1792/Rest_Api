package Collections_Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTask
{

	public static void main(String[] args) {  
		Map <Integer, String> i = new HashMap <Integer, String>();	
		i.put(1, "Samsung");
		i.put(2, "Apple");
		i.put(3, "RealMe");
		i.put(4, "Vivo");
		System.out.println(i);
		int siz = i.size();
		System.out.println(siz);
		String str = i.get(3);
		System.out.println(str);
	Set<Integer> s= i.keySet();
	System.out.println(i.keySet);
	
	
	}
	
	

}
