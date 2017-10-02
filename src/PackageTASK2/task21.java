package PackageTASK2;

import java.util.Scanner;

/*Используя оператор switch, написать программу, которая выводит на
экран сообщения о принадлежности некоторого значения k интервалам
(-10k, 5], [0, 10], [5, 15], [10, 10k].*/
public class Task21 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Write your number type int");
            int g = in.nextInt();
            int z = 0;
            if (-10000 < g && g <= 5) {
                z = 1;
            }
            if (0 <= g && g <= 10) {
                z = 2;
            }
            if (5 <= g && g <= 15) {
                z = 3;
            }
            if (10 <= g && g <= 10000) {

                z = 4;
            }
            switch (z) {
                case (1):
                    System.out.println("ваше число в интервале (-10k, 5]  ");
                    if (0 <= g && g <= 5) {
                        System.out.println("и [0, 10]");
                    }
                    break;
                case 2:
                    System.out.println("ваше число в интервале [0, 10]  ");
                    if (g <= 5) {
                        System.out.println(" и в(-10k, 5] ");
                    }
                    break;
                case 3:
                    System.out.println("ваше число в интервале [5, 15]  ");
                    if (g <= 10) {
                        System.out.println(" и в [0, 10]");
                    }
                    if (g == 5) {
                        System.out.println(" и в (-10k, 5]");
                    }
                    break;
                case 4:
                    System.out.println("ваше число в интервале [10, 10k]  ");
                    if (g <= 15) {
                        System.out.println("и [5, 15] ");
                    }
                    if (g == 10) {
                        System.out.println("и в [0, 10]");
                    }
                    break;
                default:
                    System.out.println("вы ввели \"дичь\" которое непопадает в мои интервалы");
            }

        }
        catch (Exception e){
            System.out.println("серье3но!? трудно ввести число типа int? ");
        }
    }
}
