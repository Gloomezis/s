package myPackage;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scany = new Scanner(System.in);
        System.out.println("Введите предпологаемое палидромное слово");
        String x = scany.next();
        String s = x.toLowerCase();
        task5 go = new task5();
        go(s);
    }
    public static String reverse(String s) {
        String q = "";
        for (int i = s.length() - 1; i >= 0; i--)
            q += s.charAt(i);
        return q;
    }
    public static void go(String s) {
        if (s.equals(reverse(s))) {
            System.out.println("это палиндромность");
        } else {
            System.out.println("это несовсем палиндромность");
        }
    }
}
