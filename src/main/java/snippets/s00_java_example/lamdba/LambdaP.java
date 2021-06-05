package snippets.s00_java_example.lamdba;

import snippets.s00_java_example.vo.Person;


public class LambdaP {
	
	/** 메소드 참조 용 샘플
	 * @param o1
	 * @param o2
	 * @return 
	 */
	public int hashComparator(Person o1, Person o2){
		return o1.hashCode() - o2.hashCode();
	}
	

	public void go(Person[] persons) {

		// 나이비교 (익명 객체)
		Comparator<Person> ageComparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.getAge() - o1.getAge();
			}
		};

		Person max = getMax(persons, ageComparator);
		System.out.println("The Oldst is " + max.getName());
		
		
		
		// 키 비교 ( lamba Expression )
		Comparator<Person> heightComparator = (o1, o2)->{
			return o2.getHeight() - o1.getHeight();
		};
		
		max = getMax(persons, heightComparator);
		System.out.println("The heigtst is " + max.getName());
		
		
		//메소드 참조
		max = getMax(persons, this::hashComparator);
		System.out.println("The hashMaxValue is " + max.getName());
		
	}

	/**
	 * 배열에서 최대값을 리턴하는 메서드
	 * 
	 * @param array      T객체의 배열 
	 * @param comparator T객체의 크기를 비교할 Comparator 구현체 (비교기)
	 * @return
	 * 
	 */
	public <T> T getMax(T[] array, Comparator<T> comparator) {
		T max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (comparator.compare(max, array[i]) > 0) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		LambdaP p = new LambdaP();
			Person p1 = new Person("keroro1", 12, 175);
			Person p2 = new Person("keroro2", 16, 165);
			Person p3 = new Person("keroro3", 36, 145);
			Person p4 = new Person("keroro4", 37, 155);
			
		Person[] persons = {p1,p2,p3,p4};	
		p.go(persons);
	}
}
