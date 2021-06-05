package snippets.s10_thread;

public class Count100 implements Runnable {

	private Integer i = 0;

	@Override
	public void run() {
		try {
			doA();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void doA() throws InterruptedException {
		while (i < 100) {
			
			synchronized(i) {
				System.out.println(Thread.currentThread().getName() + " count : " + i);
				i++;
			}
			
		}
	}

}
