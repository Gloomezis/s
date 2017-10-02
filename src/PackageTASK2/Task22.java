package PackageTASK2;

//2. Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева направо и сверху вниз.
public class Task22 {
    public static void main(String[] args) {
        int q = 1;
        for (int i = 0; i < 5; i++) {
            for (int ii = 0; ii < 5; ii++) {
                System.out.print(q + " ");
                q +=1;
            }
            System.out.print("\n");

        }
    }
}
