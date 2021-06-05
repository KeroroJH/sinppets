package skillcheck.s03;

import java.util.ArrayList;

public class NumClass {

    private int num;
    private ArrayList<Integer> list;

    public NumClass(int num) {
        this.num = num;
        this.list = new ArrayList<>();
        doA();
    }

    /**
     * num 의 약수 를 list 에 넣기
     */
    private void doA(){
        for (int i = 1; i < num + 1; i++) {
            if(num % i == 0)
                list.add(i);
        }
    }

    public boolean isEvenNum() {
        //list 가 짝수 인지 확인
        return list.size() % 2 == 0;
    }

    @Override
    public String toString() {
        return "NumClass{" +
                "num=" + num +
                ", list=" + list +
                '}';
    }
}
