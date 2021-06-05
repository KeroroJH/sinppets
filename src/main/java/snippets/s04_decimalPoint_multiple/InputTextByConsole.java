package snippets.s04_decimalPoint_multiple;

import java.util.Scanner;

public class InputTextByConsole {
	private String text;
	

	public String getText() {
		Scanner sc = new Scanner(System.in);
		System.out.println("type input");
		this.text = sc.next();
		return this.text;
	}
	
	
}
