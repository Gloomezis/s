package PackageTASK2;
/*1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.
но йа 4уток извратился над заданием текущим. но коментариями стараюсь везде все обьяснить*/

import java.util.*;


public class BigClassForStudents {
    public static void main(String[] args) {


        Student[] mass = new Student[11];
        mass[0] = new Student(15, "fam1", "im91", "ot4estvo1", new Date(2000, 10, 1), "grodno", 780011, "econom", 3, 55);
        mass[1] = new Student(20, "fam2", "im92", "ot4estvo3", new Date(2002, 11, 5), "minsk", 870011, "matem", 2, 44);
        mass[2] = new Student(11, "fam3", "im93", "ot4estvo5", new Date(1997, 12, 4), "brest", 880011, "fizika", 3, 54);
        mass[3] = new Student(13, "fam2", "im95", "ot4estvo3", new Date(1990, 12, 4), "minsk", 661111, "matem", 1, 14);
        mass[4] = new Student(15, "fam3", "im93", "ot4estvo2", new Date(1987, 12, 4), "grodno", 877011, "fizika", 4, 44);
        mass[5] = new Student(16, "fam1", "im92", "ot4estvo1", new Date(1991, 12, 4), "minsk", 877011, "fizika", 3, 56);
        mass[6] = new Student(16, "fam3", "im91", "ot4estvo2", new Date(1987, 12, 4), "brest", 888011, "fizika", 3, 56);
        mass[7] = new Student(10, "fam2", "im92", "ot4estvo3", new Date(1999, 12, 4), "brest", 899011, "matem", 2, 56);
        mass[8] = new Student(20, "fam4", "im93", "ot4estvo1", new Date(1997, 12, 4), "grodno", 811011, "econom", 1, 54);
        mass[9] = new Student(11, "fam1", "im95", "ot4estvo3", new Date(1997, 12, 4), "minsk", 877711, "fizika", 1, 54);
        mass[10] = new Student(13, "fam2", "im91", "ot4estvo1", new Date(1997, 12, 4), "brest", 880011, "matem", 3, 44);
        System.out.println("весь массив через Arrays.deepToString:\n "+Arrays.deepToString(mass)); // список учебной группы через deeptoString
        System.out.println("вывод списка студентов на курсе fizika");
        for (int i = 0; i < mass.length; i++) {
            mass[i].facultet("fizika");//вывод студентов заданного факультета в данном случае это фи3ика

        }
        Scanner in1 = new Scanner(System.in);
        System.out.println("\nwrite number kursa what you wanna see");
        int n = in1.nextInt();
        for (int i = 0; i < mass.length; i++) {//вывести список студентов с заданным курсом
            mass[i].vivod_kurs(n);
        }

        String spisokFac = "";

        for (int i = 0; i < mass.length; i++) {
            if (!(spisokFac.contains(mass[i].getFacultet()))) {
                spisokFac = spisokFac + " " + mass[i].getFacultet();//вывод всех факультетов без повторений через метод contains
            }

        }
//списки студентов для каждого факультета и курса;! йа чета туплю пока.в след 3адании буду пробывать делать сортировку в алфавитном порядке.поэтому дослово этот пункт опускаю
        Scanner in2 = new Scanner(System.in);
        System.out.println("после кокого года рождения студентов вывести их имена и года рождения?");
        int n2 = in2.nextInt();
        for (int i = 0; i < mass.length; i++) {//вывести именя студентов моложе введенного года
            mass[i].vivodGodRojd(n2);
        }
        System.out.println("\nвывод всех факультетов: " + spisokFac);
    }
}
