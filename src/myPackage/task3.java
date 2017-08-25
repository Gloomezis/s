package myPackage;
import java.util.Scanner;
public class task3 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            boolean iTOG = true;
            System.out.print("Введите значение Х первой точки первого отрезка");
            Float x11 = in.nextFloat();
            System.out.print("Введите значение У первой точки первого отрезка");
            Float y11 = in.nextFloat();
            System.out.print("Введите значение Х второй точки первого отрезка");
            Float x12 = in.nextFloat();
            System.out.print("Введите значение У второй точки первого отрезка");
            Float y12 = in.nextFloat();
            System.out.print("Введите значение Х первой точки второго отрезка");
            Float x21 = in.nextFloat();
            System.out.print("Введите значение У первой точки второго отрезка");
            Float y21 = in.nextFloat();
            System.out.print("Введите значение Х второй точки второго отрезка");
            Float x22 = in.nextFloat();
            System.out.print("Введите значение У второй точки второго отрезка");
            Float y22 = in.nextFloat();

            float a1 = 0, a2 = 0, b1 = 0, b2 = 0, d = 0, c1 = 0, c2 = 0, xi = 0, yi = 0;
            a1 = y11 - y12; b1 = x12 - x11;
            a2 = y21 - y22; b2 = x22 - x21;

            d = a1 * b2 - a2 * b1;
            if ( d != 0 ) { c1 = y12 * x11 - x12 * y11;
                c2 = y22 * x21 - x22 * y21;

                xi = (b1 * c2 - b2 * c1) / d;
                yi = (a2 * c1 - a1 * c2) / d;
                if (((x11<=xi)&&(x12>=xi)&&(x21<=xi)&&(x22 >=xi))||((y11<=yi)&&(y12>=yi)&&(y21<=yi) &&(y22>=yi))) {iTOG = true;}
                else {iTOG = false;}
            }
            else {iTOG = false;}

            if (iTOG) {System.out.println("пересекаются");}
            else {System.out.println("непересекаются");}

        }
    }