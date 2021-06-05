package snippets.s07_math_ramdom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MakeRandom {
	private ArrayList<Integer> ar;
	private int count;
	private int sum;
	private Random ran;
	
	public MakeRandom(int count) {
		this.count = count;
		this.ar = new ArrayList<>();
		this.ran = new Random();
		makeRandom();
	}
	
	public void makeRandom() {
		ar.clear();
		for (int i = 0; i < count; i++) {
			int j = ran.nextInt(10);
			ar.add(j);
			System.out.println("make"+i+" :"+j);
		}
	}
	
	public int getSum() {
		Collections.sort(ar);
		for (int i : ar) {
			System.out.println("print :"+i);
			sum += i;
		}
		return sum;
	}
	
}
