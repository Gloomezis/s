package secondPackageTASK;

import java.util.Scanner;
// Создайте программу, вычисляющую и выводящую на экран сумму цифр введеннго числа.


public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the number N ");
        int g = in.nextInt();
        int result = 0;
        int s;
        while (g >= 1) {

            s = g % 10;
            g = g / 10;
            result = result + s;

        }
        System.out.println(result);
    }

}
