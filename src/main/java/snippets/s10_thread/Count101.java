package snippets.s10_thread;

import java.util.Random;

public class Count101 extends Thread{
	
	private int score;
	private Random ran = new Random();

	@Override
	public void run() {
		try {
			doA();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 void doA() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			Thread.sleep(100);;
			score += ran.nextInt(10);
			System.out.println(Thread.currentThread().getName()+" count : "+i+" score : "+score);
		}
		System.out.println("최종 점수 : "+Thread.currentThread().getName()+" totalScore : "+score);
	}

}
