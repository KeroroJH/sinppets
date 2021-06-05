package snippets.s10_thread;

public class Program01 {
	
	public static void main(String[] args) {
		Count100 count1 = new Count100();
		
		Thread tr1 = new Thread(count1,"A");
		Thread tr2 = new Thread(count1,"B");
		Thread tr3 = new Thread(count1,"KRO");
		
		tr1.start();
		tr2.start();
		tr3.start();
	} 

}
