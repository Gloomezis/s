package myTask1;

//2. Создать программу, которой ты задаешь  число, а она выводит на экран его наибольшую цифру.

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        System.out.println("ввести 4исло  и будет выведено наибольшее из цифр ");
        int g = gg.nextInt();
        int a, result = 0;

        while (g >= 1) {
            a = g % 10;

            if (result < a) {
                result = a;

            }
            g = g / 10;
        }
        System.out.println(result);
    }
}
