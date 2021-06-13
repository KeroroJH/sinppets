package snippets.s16_DI_Example.ex02.entity;

public class KroExam implements Exam {
    private int kro;
    private int eng;
    private int math;
    private int com;

    public void setKro(int kro) {
        this.kro = kro;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public int total() {
        return kro+eng+math+com;
    }

    @Override
    public float avg() {
        return total()/4.0f;
    }
}
