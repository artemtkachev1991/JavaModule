package First;

public class Matriculant extends Teacher{
    private String name;
    private int age;
    private int scoreExams1;
    private int scoreExams2;
    private int scoreExams3;

    @Override
    public String toString() {
        return "Matriculant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scoreExams1=" + scoreExams1 +
                ", scoreExams2=" + scoreExams2 +
                ", scoreExams3=" + scoreExams3 +
                '}';
    }

    public Matriculant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getScoreExams1() {
        return scoreExams1;
    }

    public void setScoreExams1(int scoreExams1) {
        this.scoreExams1 = scoreExams1;
    }

    public int getScoreExams2() {
        return scoreExams2;
    }

    public void setScoreExams2(int scoreExams2) {
        this.scoreExams2 = scoreExams2;
    }

    public int getScoreExams3() {
        return scoreExams3;
    }

    public void setScoreExams3(int scoreExams3) {
        this.scoreExams3 = scoreExams3;
    }

    public Matriculant(String name, int age, int scoreExams1, int scoreExams2, int scoreExams3) {
        this.name = name;
        this.age = age;
        this.scoreExams1 = scoreExams1;
        this.scoreExams2 = scoreExams2;
        this.scoreExams3 = scoreExams3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScoreExams() {
        return scoreExams1;
    }

}
