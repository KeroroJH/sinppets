package snippets.s16_DI_Example.ex02.ui;

import snippets.s16_DI_Example.ex02.entity.Exam;

public class NewLineExamConsole implements ExamConsole {
    private Exam exam;

    public NewLineExamConsole(Exam exam) {
        this.exam = exam;
    }

    public NewLineExamConsole() {

    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("avg is "+exam.avg());
        System.out.println("total is "+exam.total());
    }

    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
