package snippets.s16_DI_Example.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import snippets.s16_DI_Example.ex02.entity.Exam;
import snippets.s16_DI_Example.ex02.ui.ExamConsole;

public class Program01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("snippets/s16_DI_Example/ex02/setting.xml");
            Exam exam = (Exam) context.getBean("exam2");
            Exam exam22 = context.getBean(Exam.class);
        ExamConsole console1 = (ExamConsole) context.getBean("examConsole");
            console1.setExam(exam);
            console1.print();

        System.out.println(exam == exam22);

    }
}
