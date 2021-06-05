package snippets.s02_print_10numbers;

public class Program01 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			int num = i;
			boolean is10 = true;
			for (int j = 0; j < 10; j++) {
				
				if(num < 10 && is10) {
					num++;
				}else {
					num--;
					is10 = false;
				}
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
