package snippets.s15_lambda;

@FunctionalInterface
interface MyFunc{
    void func();
}
// 보통 위 MyFunc 인터페이스 같은 경우는 만들 필요없이 Runnable 을 사용하면 매개변수 와 리턴 모두 없이 똑같다.
// 만들어서 사용하는 것 보다 있는 것을 쓰는것이 모두를 위해 현명하고 좋다
public class Main2 {
    void execute(MyFunc mf){
        mf.func();
    }
    MyFunc getFunc(){
        return ()-> System.out.println("getMore 123");
    }

    public static void main(String[] args) {
        Main2 m2 = new Main2();

        MyFunc my1 = new MyFunc(){
            @Override
            public void func() {
                System.out.println("익명 객체");
            }
        };

        MyFunc my2 = m2.getFunc();

        m2.execute(my1);
        my2.func();
    }
}
