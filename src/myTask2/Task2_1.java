package myTask2;

import java.util.Scanner;

/*1. Используя оператор switch, написать программу, которая выводит на
экран сообщения о принадлежности некоторого значения k интервалам
        (-10k, 5], [0, 10], [5, 15], [10, 10k].*/
public class Task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the number N ");
        int firstNumeral = in.nextInt();
        switch (firstNumeral) {
            case 5:
                System.out.println("0-9");
                break;
            default :
                System.out.println("Неверная оценка");

        }
    }
}
