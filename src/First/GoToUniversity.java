package First;

import java.util.Random;
import java.util.Scanner;

public class GoToUniversity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Exams exams = new Exams();
        Teacher teacher = new Teacher();
        Faculty faculty = new Faculty();
        System.out.println("Добро пожаловать в систему Вступительные экзамены");
        System.out.println("Представьтесь и скажите сколько вам лет");
        Matriculant matriculant = new Matriculant(scanner.next(),scanner.nextInt());
        System.out.println("Выберите факультет:" + "\n" + "1. Экономия"
                + "\n" + "2. Химия"
                + "\n" + "3. История"
                + "\n" + "4. Физика");
        switch (scanner.nextInt()) {
            case 1:
                exams.setEconomy(matriculant);
                System.out.println("Вы выбрали Экономику");
                teacher.sayHi();
                int a = teacher.setRate(getRandomscrore());
                int b = teacher.setRate(getRandomscrore());
                int c = teacher.setRate(getRandomscrore());
                matriculant.setScoreExams1(a);
                matriculant.setScoreExams2(b);
                matriculant.setScoreExams3(c);
                System.out.println("Пора сдавать Экономику тут три задания, вперед");
                System.out.println("Первое задание ты сделал на " + a + "\n" +
                        "Второе задание ты сделал на " + b + "\n" +
                        "Третье задание ты сделал на " + c + "\n");
                int averege = getAverage(a , b, c );
                System.out.println("Твой средний бал " + averege);

                if (averege <65){
                    System.out.println("Ты не зачислен на фальтет Экономии проходной бал 65");
                }else {
                    System.out.println("Ты зачислен на факультет экономии" + "\n"+
                    matriculant.getName() + " " + matriculant.getAge()+ " " +
                    matriculant.getScoreExams1() + " " + matriculant.getScoreExams2() + " " + matriculant.getScoreExams3());
                    faculty.economistWelcome(matriculant);
                }
                return;
            case 2:
                exams.setChemistry(matriculant);
                System.out.println("Вы выбрали Химию");
                teacher.sayHi();
                int a1 = teacher.setRate(getRandomscrore());
                int b1 = teacher.setRate(getRandomscrore());
                int c1 = teacher.setRate(getRandomscrore());
                matriculant.setScoreExams1(a1);
                matriculant.setScoreExams2(b1);
                matriculant.setScoreExams3(c1);
                System.out.println("Пора сдавать Химию тут три задания, вперед");
                System.out.println("Первое задание ты сделал на " + a1 + "\n" +
                        "Второе задание ты сделал на " + b1 + "\n" +
                        "Третье задание ты сделал на " + c1 + "\n");
                int averegeChim = getAverage(a1 , b1, c1 );
                System.out.println("Твой средний бал " + averegeChim);

                if (averegeChim <65){
                    System.out.println("Ты не зачислен на фальтет Химии(  проходной бал 65");
                }else {
                    System.out.println("Ты зачислен на факультет Химии" + "\n"+
                            matriculant.getName() + " " + matriculant.getAge()+ " " +
                            matriculant.getScoreExams1() + " " + matriculant.getScoreExams2() + " " + matriculant.getScoreExams3());
                    faculty.chemistryWelcome(matriculant);
                }
                return;
            case 3:
                exams.setHistory(matriculant);
                System.out.println("Вы выбрали Историю");
                teacher.sayHi();
                int a2 = teacher.setRate(getRandomscrore());
                int b2 = teacher.setRate(getRandomscrore());
                int c2 = teacher.setRate(getRandomscrore());
                matriculant.setScoreExams1(a2);
                matriculant.setScoreExams2(b2);
                matriculant.setScoreExams3(c2);
                System.out.println("Пора сдавать Историю тут три задания, вперед");
                System.out.println("Первое задание ты сделал на " + a2 + "\n" +
                        "Второе задание ты сделал на " + b2 + "\n" +
                        "Третье задание ты сделал на " + c2 + "\n");
                int averegeHistory = getAverage(a2 , b2, c2 );
                System.out.println("Твой средний бал " + averegeHistory);

                if (averegeHistory <65){
                    System.out.println("Ты не зачислен на фальтет Истории( проходной бал 65");
                }else {
                    System.out.println("Ты зачислен на факультет Истории" + "\n"+
                            matriculant.getName() + " " + matriculant.getAge()+ " " +
                            matriculant.getScoreExams1() + " " + matriculant.getScoreExams2() + " " + matriculant.getScoreExams3());
                    faculty.historyWelcome(matriculant);
                }
                return;
            case 4:
                exams.setPhysics(matriculant);
                System.out.println("Вы выбрали Физику");
                teacher.sayHi();
                int a3 = teacher.setRate(getRandomscrore());
                int b3= teacher.setRate(getRandomscrore());
                int c3 = teacher.setRate(getRandomscrore());
                matriculant.setScoreExams1(a3);
                matriculant.setScoreExams2(b3);
                matriculant.setScoreExams3(c3);
                System.out.println("Пора сдавать Физику тут три задания, вперед");
                System.out.println("Первое задание ты сделал на " + a3 + "\n" +
                        "Второе задание ты сделал на " + b3 + "\n" +
                        "Третье задание ты сделал на " + c3 + "\n");
                int averegePhysics = getAverage(a3 , b3, c3 );
                System.out.println("Твой средний бал " + averegePhysics);

                if (averegePhysics <65){
                    System.out.println("Ты не зачислен на фальтет Истории( проходной бал 65");
                }else {
                    System.out.println("Ты зачислен на факультет Истории" + "\n"+
                            matriculant.getName() + " " + matriculant.getAge()+ " " +
                            matriculant.getScoreExams1() + " " + matriculant.getScoreExams2() + " " + matriculant.getScoreExams3());
                    faculty.historyWelcome(matriculant);
                }

                return;
        }
    }

    private static int getAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    private static int getRandomscrore(){
        Random random = new Random();
        return random.nextInt(100 - 20) + 20;
    }
}
