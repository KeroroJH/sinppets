package designPattern.iterator;

public class Main {
    public static void main(String[] args) {
        ArrContainer<Integer> arrcon = new ArrContainer<>();
        arrcon.add(4);
        arrcon.add(8);
        arrcon.add(12);

        ArrIterator<Integer> iterator = arrcon.getIterator();
        while (iterator.hasNext())
            System.out.println(iterator.nextVal());
    }
}
