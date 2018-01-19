package First;

public class Teacher extends Exams{
    private String specialist;
    private int rate;

    public String getSpecialist() {
        return specialist;
    }

    public void sayHi(){
        System.out.println("Привет студент");
    }


    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public int getRate() {
        return rate;
    }

    public int setRate(int rate) {
        this.rate = rate;
        return rate;
    }
}
