package skillcheck.s03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.
수	약수	약수의 개수
24	1, 2, 3, 4, 6, 8, 12, 24	8
25	1, 5, 25	3
26	1, 2, 13, 26	4
27	1, 3, 9, 27	4
따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.
* */
public class Main {
    public List<Integer> makeArrAtoB(int start, int end){
        ArrayList<Integer> integers = new ArrayList<>();
        int count = end - start;
        if(count < 1)
            return null;

        for (int i = 0; i <= count; i++) {
            integers.add(start+i);
        }
        return integers;
    }

    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> integers = main.makeArrAtoB(24, 27);
        int total = 0;
        for (int i = 0; i < integers.size(); i++) {
            Integer num = integers.get(i);
            NumClass nc = new NumClass(num);
            System.out.println(nc);
            if(nc.isEvenNum()){
                total += num;
            }else{
                total -= num;
            }
        }
        System.out.println(total);
    }
}

