package myPackage;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first one number and then the second ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Greatest common divisor " + nod(a, b) + "\n" + "Least common multiple " + nok(a, b));
    }

    public static int nod(int a, int b) {//рекурсивный метод вызывающий сам себя пока числа не поделятся без остатка
        if (b == 0) {
            return Math.abs(a);        //берем по модулю т.к для -5 и 15 наибольший нод это 5
        } else {
            return nod(b, a % b);
        }
    }

    public static int nok(int a, int b) {
        int z;
        z = a / nod(a, b) * b;// вычисляем через НОД в одну формулу
        return z;
    }
}

