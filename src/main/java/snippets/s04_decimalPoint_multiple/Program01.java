package snippets.s04_decimalPoint_multiple;

public class Program01 {

	public static void main(String[] args) {
		InputTextByConsole inText= new InputTextByConsole();
		
		//input1
		String text1 = inText.getText();
		double num1 = Double.parseDouble(text1);
		
		//input2
		String text2 = inText.getText();
		double num2 = Double.parseDouble(text2);
		
		System.out.printf("num1 is %f:  , num2 is %f:  , multiple is : %f",num1,num2,num1*num2);
	}

}
