package snippets.s10_thread;

import lombok.SneakyThrows;

public class Ramen {
    public static void main(String[] args) {
        RanmenCook rc = new RanmenCook(100);
        new Thread(rc,"A").start();
        new Thread(rc,"B").start();
        new Thread(rc,"C").start();
        new Thread(rc,"D").start();
        new Thread(rc,"E").start();
    }
}


class RanmenCook implements Runnable{

    private int ramenCount;
    private String[] burners = {"_","_","_","_","_"};

    public RanmenCook(int ramenCount) {
        this.ramenCount = ramenCount;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (ramenCount > 0){
            synchronized (this){
                ramenCount--;
                System.out.printf("%s 라면 %d 남음 \n",Thread.currentThread().getName(),ramenCount);
                Thread.sleep(Math.round(500*Math.random()));
            }

            for (int i = 0; i < burners.length; i++) {
                    if (!"_".equals(burners[i]))
                        continue;
                    synchronized (this) {
                        burners[i] = Thread.currentThread().getName();
                        System.out.println("                    " + i + " 번 burner ON");
                        showBurner();
                    }

                    //라면 익는 시간
                    Thread.sleep(Math.round(1000*Math.random()));

                    synchronized (this){
                        burners[i] = "_";
                        System.out.println("                                            "+i+" 번 burner OFF");
                        showBurner();
                }
                break;
            }

        }
    }

    void showBurner(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < burners.length; i++) {
            sb.append(burners[i]);
            sb.append(" ");
        }
        System.out.println("                                                            "+sb);
    }
}