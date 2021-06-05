package snippets.s10_thread;

public class Program02 {
	public static void main(String[] args) {
		
		Count101 co1 = new Count101();
		Count101 co2 = new Count101();
		Count101 co3 = new Count101();
		Count101 co4 = new Count101();
		
		
		co1.start();
		co2.start();
		co3.start();
		co4.start();
		
	}
}
