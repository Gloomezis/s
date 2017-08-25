package myPackage;
import java.util.Scanner;
public class task2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число N- предел(включительно) вычисления чисел фибонначи  ");
            int g = in.nextInt();

            int a = 1, b = 1;
            System.out.print(a);
            int summa = 1;
            while (summa <= g) {
                System.out.print(" " + summa);
                summa = a + b;
                a = b;
                b = summa;


            }
        }
}
