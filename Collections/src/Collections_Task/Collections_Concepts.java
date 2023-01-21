package Collections_Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections_Concepts {
	public static void main (String[] args)  {
		// TODO Auto-generated method stub
		List<Integer> o = new ArrayList<Integer>();
		o.add(11);
		o.add(22);
		o.add(33);
		
  System.out.println("List Concepts");
		System.out.println("Single Value :");
		int a = o.get(2);
		System.out.println(a);
		
System.out.println("Multiple Values: ");
 for (int c : o)
System.out.println(c);
	}


public void set_Concepts() {
	System.out.println("Set Concepts");
	Set<String> m = new HashSet<String>();
	m.add("K");
	m.add("A");
	m.add("p");
	
	System.out.println("Single Value");
	
	System.out.println("Multiple Values");
	for (Object string: m)
		System.out.println(string);

}

public void map_Concepts() {
	System.out.println("Map Concepts");
	
	Map<String,Integer> q = new HashMap<String,Integer>();
	q.put("Employee Id : ", 312963);
	q.put("Employee Age: ", 32);
	q.put("Employee Phone No : ", 987456123);
	
	System.out.println("Single Value: ");
	int l = q.get(1);
	System.out.println(l);
	
	System.out.println("Multiple Values: ");
	for (int v : q)
		System.out.println(vd);
}
}