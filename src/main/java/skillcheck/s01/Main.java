package skillcheck.s01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  주어진 배열을 정렬하고 , 주어진 count 로 도달 할수 있는 배열A 최대 index 를 구하라
 *  ex) count 10  // A =  [3,5,6,2,1,9]
 *  - [1,2,3,5,6,9]  최대index 3
 */
public class Main {
    public static int doA(int count ,Integer[] arr){
        List<Integer> list =  Arrays.asList(arr);
        list.sort((o1, o2) -> o1-o2);
        System.out.println("sorted list is "+ list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for i count is "+i);
            count -= list.get(i);
            if(count < 0)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Integer[] arr = {3,5,6,2,1,9,11,5};
        int result = doA(13,arr);

        System.out.println(result);
    }

}
