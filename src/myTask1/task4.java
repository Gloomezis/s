package myTask1;

import java.util.Scanner;

//sила тяжести на Луне примерно равна 17%, напиши программу, которая вычисляет твой вес на Луне
public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write your weighton on earth and salary in BYN");
        double g = in.nextDouble();
        int g2 = in.nextInt();
        System.out.println("your weigth on moon will be " + g * 0.17 + "kg");
        System.out.println("your salary in $ is "+1/1.994*g2);
    }
}