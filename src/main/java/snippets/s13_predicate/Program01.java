package snippets.s13_predicate;

import java.util.function.Predicate;

public class Program01 {
	
	static Predicate<String> preString = n->{
		if("".equals(n)){
			System.out.println("n is empty");
			return true;
		}else{
			System.out.println(n);
			return false;
		}	
	};
	
	public static void main(String[] args) {
		method1(preString, "abc");
	}
	
	public static <T> void method1( Predicate<T> p ,T text) {
		
		System.out.println("run ..");
		p.test(text);
	}

}
