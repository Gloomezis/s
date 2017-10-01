package secondPackageTASK;
//Напиши метод, который будет увеличивать заданный элемент массива на 10%

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner gg = new Scanner(System.in);
        System.out.println("ввести число количества элементов массива ");
        int g1 = gg.nextInt();

        int[] massiv = new int[g1];
        System.out.println("получаем и берем массив");
        for (int i = 0; i < g1; i++) {
            massiv[i] = i + 1;

            System.out.print(massiv[i] + " ");
        }

        System.out.println("\nввести число какой элемент массива увеличить на 10%, отсчет от 1 ");
        int g2 = gg.nextInt();

        double result = massiv[g2 - 1] * 1.11;
        System.out.println(result);
    }
}
