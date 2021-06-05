package snippets.s03_is_parseable;

public class Program01 {

	public static void main(String[] args) {
		//입력된 배열에서 숫자를 찾고 , 찾는다면 7로 나눈 몫과 나머지를 구하라
		
		String[] array = {"abc", "123","256","a","6678"};
		Is_parseAble able = new Is_parseAble(array);
		
		if(able.parseAble()) {
			for (int i : able.getParseAlbeIndexList()) {
				int num = Integer.parseInt(array[i]);
				System.out.printf("찾은값 :%d 이고 7로 나눈 몫은 : %d 이고 나머지는 %d",num ,num/7 ,num%7);
				System.out.println();
			}
		}
	}

}
