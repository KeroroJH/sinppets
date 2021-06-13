package snippets.s16_DI_Example.ex02.ui;

import snippets.s16_DI_Example.ex02.entity.Exam;

public class InlineExamConsole implements ExamConsole {

    private Exam exam;

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    public InlineExamConsole() {

    }

    @Override
    public void print() {
        System.out.printf("total is %d , avg is %f",exam.total(),exam.avg());
    }

    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
