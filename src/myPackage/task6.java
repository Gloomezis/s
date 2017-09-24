package myPackage;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scany = new Scanner(System.in);
        System.out.println("Введите текст из которого следует убрать цифры");
        String inS = scany.next();
        task6 go = new task6();
        go.go(inS);
    }

    public static void go(String inS) {
        inS = inS.replaceAll("[0-9]", "");
        System.out.println("тоже самое но без цифр" + "\n" + inS);
    }
}
