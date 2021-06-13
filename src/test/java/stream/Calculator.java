package stream;

import java.util.stream.IntStream;

public class Calculator {

    int sum(int a, int b){
        return a + b;
    }

    int sub(int a , int b){
        return a - b;
    }

    public int multiply1(int i, int i2) {
        return IntStream.range(0,i2).reduce(0, (acc,e)->acc + i);
    }

    public int multiply2(int i, int i2) {
        return IntStream.generate(()-> i).limit(i2).reduce(0,(a,e)-> a + i);
    }
    public int multiply3(int i, int i2) {
        return IntStream.iterate(0,obj -> obj).limit(i2).map(obj-> i).sum();
    }

}
