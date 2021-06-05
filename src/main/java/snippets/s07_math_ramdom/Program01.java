package snippets.s07_math_ramdom;

public class Program01 {
	
	public static void main(String[] args) {
		MakeRandom mr = new MakeRandom(10);
		int result = mr.getSum();
		System.out.println(result);

		mr.makeRandom();
		int result2 = mr.getSum();
		System.out.println(result2);
		
		mr.makeRandom();
		int result3 = mr.getSum();
		System.out.println(result3);
	}

}
