package myPackage;
import java.util.Arrays;
import java.util.Scanner;
public class task1 {



        public static void main (String[]args){
            task1 go1=new task1();
            go1.go();}
        public void go(){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число N (предел вычисления простых чисел): ");
            int n = in.nextInt(); //принимает вводимое в консоли и переводит  это в инт, принимает только числа
            boolean[] mass = new boolean[n + 1];
            System.out.println("простые числа от 1 до "+n);
            Arrays.fill(mass, true);// Реализации алгоритмa /Решето Эратосфена
            mass[0] = mass[1] = false;
            for (int i = 2; i < mass.length; ++i)
                if (mass[i]) for (int j = 2; i * j < mass.length; ++j) {
                    mass[i * j] = false;
                }

            for (int i=0;i<mass.length;i++) {//если ячейка массива осталась true, то выводим ее адрес,которое будет простым числом
                if (mass[i]) {
                    System.out.println(i);
                }
            }

        }
    }