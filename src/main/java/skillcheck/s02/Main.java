package skillcheck.s02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 주어진 10진수 A = 123123  을 3진수  다시 10진수로 변환 하여 출력
 *
 */
public class Main {
    public static int make10to3(int num){
        if(num < 3)
            return num;

        ArrayList<Integer> list = new ArrayList<>();
        int _num = num;
        while(_num > 3){
            Integer v = _num % 3;
            list.add(v);
            _num  = (int) Math.floor(_num / 3);
        }
        list.add(_num);
        return doA(list,10);
    }


    /**
     * @param list xVal 진수 값이 나뉘어 담겨있다
     * @param xVal 진수
     * @return xVal 진수 값으로 변환 된 값
     */
    static int doA(List<Integer> list,int xVal){
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int nVal = list.get(i);
            if (i == 0) {
                result = nVal;
            } else {
                result += nVal * Math.pow(xVal, i);
            }
        }
        return result;
    }

    public static int make3to10(int num){
        List<Integer> collect = Arrays.stream(String.valueOf(num).split(""))
                .map(v -> Integer.parseInt(v)).collect(Collectors.toList());
        Collections.reverse(collect);
        return doA(collect,3);
    }

    public static void main(String[] args) {
        System.out.println(make10to3(1231));
        System.out.println(make3to10(1200121));
    }
}
