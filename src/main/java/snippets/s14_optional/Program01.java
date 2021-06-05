package snippets.s14_optional;

import java.util.Optional;

public class Program01 {
	public static void main(String[] args) {
		Optional<String> op1 = Optional.empty();
		System.out.println(op1.orElse("b"));
		
		Optional<String> op2 = Optional.ofNullable("kro");
		
		String s1 = op2.orElse("");
		
	}
}
