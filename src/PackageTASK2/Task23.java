package PackageTASK2;

import java.util.Scanner;

/*Ввести число от 1 до 12. Вывести на консоль название месяца, соответ-
ствующего данному числу. (Осуществить проверку корректности ввода
        чисел).*/
public class Task23 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Write number of month");
            int numberMonth = in.nextInt();
            switch (numberMonth) {
                case 1:
                    System.out.println("january");
                    break;
                case 2:
                    System.out.println("february");
                    break;
                case 3:
                    System.out.println("march");
                case 4:
                    System.out.println("april");
                    break;
                case 5:
                    System.out.println("may");
                case 6:
                    System.out.println("june");
                    break;
                case 7:
                    System.out.println("july");
                    break;
                case 8:
                    System.out.println("august");
                    break;
                case 9:
                    System.out.println("september");
                    break;
                case 10:
                    System.out.println("october");
                    break;
                case 11:
                    System.out.println("november");
                    break;
                case 12:
                    System.out.println("december");

                default:
                    System.out.println("вы незнаете сколько месяцев в году?");
            }
        } catch (Exception e) {
            System.out.println("вы не сумели ввести число от 1 до 12");
        }
    }
}