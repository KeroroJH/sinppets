package snippets.s15_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","e","b","c","z");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //오름차순 정렬 , 익명객체 사용
        System.out.println(list);

        list.sort((o1,o2) -> o2.compareTo(o1));
        //내림차순 정렬 , 람다식 사용
        System.out.println(list);

    }
}
