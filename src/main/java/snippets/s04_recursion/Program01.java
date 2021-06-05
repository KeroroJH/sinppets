package snippets.s04_recursion;

import snippets.s04_decimalPoint_multiple.InputTextByConsole;

public class Program01 {
	
	static int factory(int a) {
		if(a <= 1) {
			 return a;
		}
		else
			return factory(a-1)*a;
	}

	public static void main(String[] args) {
		InputTextByConsole input = new InputTextByConsole();
		
		int num = Integer.parseInt(input.getText());
		
		System.out.println(factory(num));
	}

}
