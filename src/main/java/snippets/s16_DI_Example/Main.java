package snippets.s16_DI_Example;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try
            (
                FileInputStream fis = new FileInputStream("src/main/java/snippets/s16_DI_Example/diNote.txt");
                Scanner scan = new Scanner(fis);
            )
        {
            String type = scan.next();
            Class<?> clazz = Class.forName(type);
             RunA aa = (RunA) clazz.getDeclaredConstructor().newInstance();
            System.out.println(aa.runDo());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
