package snippets.s00_java_example.lamdba;


@FunctionalInterface
public interface Comparator<T> {
	/**
	 * 두개의 오브젝트를 비교한다
	 * @return 크면 음수 같으면 0 작으면 양수 리턴
	 */
	int compare(T o1, T o2);
}
