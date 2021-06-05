package snippets.s08_java8_forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program {
	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("k1");
		ar1.add("k2");
		ar1.add("k3");
		ar1.add("k4");
		
		
		ar1.forEach((s) -> {System.out.println(s);});
		
		
		Map<String, Integer> map1 = new HashMap<>();
			map1.put("A", 111);
			map1.put("B", 222);
			map1.put("C", 333);
		
		map1.forEach((p,s) -> {
			System.out.println("p :"+p);
			System.out.println("s :"+s);
			
		});
		
	}

}
