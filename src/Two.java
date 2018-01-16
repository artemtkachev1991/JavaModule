import java.util.Random;
import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        int a,b,c=0;
        //Генерируем случайное целое число из диапазона -10,10
        //Если a=0 повторяем генерацию
        do{
            a= (int)(Math.random()*200+1)-100;
        }
        while(a==0);
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите целое число из отрезка -10,10");
        if(scn.hasNextInt()){
            do{
                b=scn.nextInt();
                if(b<-100||b==0||b>100){
                    System.out.println("Вы ввели число не из-заданного диапазона или 0");
                    System.out.println("Повторите ввод");
                }
                else{
                    ++c;
                    if(b==a){
                        System.out.println("Вы угадали с "+c+" попытки");
                    }
                    else{
                        if(b<a)System.out.println("Число больше");
                        else System.out.println("Число меньше");
                        if((b<0&a>0)||(b>0&a<0))
                            System.out.println("Число с другим знаком");
                    }
                }
            }

            while(b!=a);
        }
        else System.out.println("Ошибка. Введено не целое число");

    }
}
