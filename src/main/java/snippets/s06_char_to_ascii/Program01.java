package snippets.s06_char_to_ascii;

public class Program01 {

	public static void main(String[] args) {
		String is = "abdsdrdf09854AADEDG";
		
		ParseASCIICount ps = new ParseASCIICount(is);
		ps.doParse();
		System.out.printf("대문자개수 %d , 소문자개수 %d ,소문자개수 %d",ps.getCountUpperCases(),ps.getCountLowerCases(),ps.getCountNumberCases());
		System.out.println(ps.toString());

	}

}
