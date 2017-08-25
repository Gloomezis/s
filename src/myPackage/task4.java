package myPackage;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите сначало одно число,а после \"ентера\" второе ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("наибольший общий делитель "+nod(a,b)+"\n"+"наименьшее общее кратное "+nok(a,b));

    }

        public static int nod(int a,int  b) {
            if (b == 0)
                return Math.abs(a);
            return nod(b, a % b);
        }
        public static int nok(int a, int b){
        int z;
        z=a/nod(a,b)*b;
        return z;
        }
}

