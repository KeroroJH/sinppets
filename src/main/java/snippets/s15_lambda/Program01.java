package snippets.s15_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 *  1 ~ 100 사이의 무작위 수를 10개 가지는 배열을 생성
 *  그 중 짝수만 따로 가지는 새로운 배열 추가
 *  십의 자리 를 0 으로 만드는 새로운 배열 추가
 */
public class Program01<T> {
    public static void main(String[] args) {
        Program01<Integer> pp = new Program01<>(10);

        Supplier<Integer> makeRan = ()-> (int)(Math.random() * 100)+1;
        Consumer<Integer> pwc = i -> System.out.println(i+", ");

        pp.make10Num(makeRan);
        System.out.println(pp.getList());

       /* Program01<String> p2 = new Program01<>(100);
        p2.make10Num(()-> {
            List<String> a = Arrays.asList("A","B","C","D","E","A","S","F","E","A","S","D","F","E");
            return a.get((int)(Math.random() * 13) + 1);
        });
        System.out.println(p2.getList());*/

    }


    private List<T> list;
    private int count;

    public Program01(int count) {
        this.list = new ArrayList<>();
        this.count = count;
    }

    //짝수 만 따로 가지는 새로운 배열 리턴
    //public List<T> pickEvenNum(UnaryOperator<T> t){}

    //무작위 수 생성 count 수 만큼
    public void make10Num(Supplier<T> s){
        for (int i = 0; i < count; i++) {
            list.add(s.get());
        }
    }

    public List<T> getList() {
        return list;
    }
}
