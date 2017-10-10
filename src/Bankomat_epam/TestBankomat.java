package Bankomat_epam;

import java.util.Scanner;

public class TestBankomat {
    public static void main(String[] args) {
        Bankomat bank = new Bankomat();
        bank.setDenga20(1);
        bank.setDenga10(5);
        bank.setDenga5(10);
        bank.skokoDenegVBankomate();
        boolean exit = true;
        while (exit) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("\nВведите номер операции:\n1.Снять деньгу.\n2.Положить деньгу в банкомат.\n3.Посмотреть сколько денег в банкомате.\n4.Завершить работу банкомата.");
                int vvod = in.nextInt();
                switch (vvod) {
                    case 1:
                        System.out.println("скоко денег хотите снять из банкомата?");
                        int x = in.nextInt();
                        if (x >= 0) {
                            bank.snimanie(x);
                        }
                        ;
                        break;
                    case 2:
                        System.out.println("Сколько купюр ложите в банкомат?");
                        int y = in.nextInt();
                        if (y > 0) {
                            System.out.println("Какова они номинала?\n1.5р\n2.10р\n3.20p");
                            int xx = in.nextInt();
                            switch (xx) {
                                case 1:
                                    bank.setDenga5(bank.getDenga5() + y);
                                    break;
                                case 2:
                                    bank.setDenga10(bank.getDenga10() + y);
                                    break;
                                case 3:
                                    bank.setDenga20(bank.getDenga20() + y);
                                    break;
                                default:
                                    System.out.println("Вы не сумели ввести цифру от 1 до 3.");
                            }
                        }
                        ;
                        break;
                    case 3:
                        bank.skokoDenegVBankomate();
                        ;
                        break;
                    case 4:
                        exit = false;
                        break;
                    default:
                        System.out.println("Вы не сумели ввести цифру от 1 до 4");
                }
            } catch (Exception e) {
                System.out.println("вы пытаетесь сломать банкомат");
            }
        }
    }
}


