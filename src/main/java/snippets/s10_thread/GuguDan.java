package snippets.s10_thread;

import lombok.SneakyThrows;

public class GuguDan extends Thread {
    private int dan;

    public GuguDan(int dan) {
        this.dan = dan;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            Thread.sleep(500);
            System.out.printf("%s - %d * %d = %d \n",Thread.currentThread().getName(),dan,i,dan*i);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            new GuguDan(i).start();
        }

    }
}
