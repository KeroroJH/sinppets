package snippets.s00_java_example.anonymouseClass;

import snippets.s00_java_example.vo.Person;

public class AnonymouseP {

	public static void main(String[] args) {
		
		
		//일반적인 상황
		Person p1 = new Person("keroro", 36, 175);
		
		System.out.println(p1.toString());
		
		
		//익명객체 생성 ( 클래스를 정의 자체를 전달 ) 마치 이름없는 상속
		Person p2 = new Person("KRO", 57, 176) {
			@Override
			public String toString() {
				return super.toString()+"anonymouseObject !! ";
			}
		};
		
		System.out.println(p2.toString());
	}

}
