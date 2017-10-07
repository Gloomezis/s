package PackageTASK2;

import java.util.Date;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private Date data_rojdenia;
    private String adres;
    private int telefon;
    private String facultet;
    private int kurs;
    private int gryppa;


    Student(int id, String surname, String name, String patronymic, Date data_rojdenia, String adres, int telefon, String facultet, int kurs, int gryppa) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.data_rojdenia = data_rojdenia;
        this.adres = adres;
        this.telefon = telefon;
        this.facultet = facultet;
        this.kurs = kurs;
        this.gryppa = gryppa;


    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getData_rojdenia() {
        return data_rojdenia;
    }

    public String getAdres() {
        return adres;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getFacultet() {
        return facultet;
    }

    public int getKurs() {
        return kurs;
    }

    public int getGryppa() {
        return gryppa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void facultet(String fac) {
        if ((this.getFacultet()).equals(fac)) {
            System.out.print(" id:" + getId());
            System.out.print(" famil:" + getSurname());
            System.out.print(" name:" + getName());
            System.out.print(" patronymic: " + getPatronymic());
            System.out.print(" data rojd: " + getData_rojdenia().getYear() + " " + getData_rojdenia().getMonth() + " " + getData_rojdenia().getDay());
            System.out.print(" adres: " + getAdres());
            System.out.print(" telefon: " + getTelefon());
            System.out.print(" facultet: " + getFacultet());
            System.out.print(" kurs: " + getKurs());
            System.out.print(" gryppa: " + getGryppa() + "\n");
        }
    }
public void vivod_kurs(int kurs) {
        if ((this.getKurs())==kurs) {
            System.out.print(" id:" + getId());
            System.out.print(" famil:" + getSurname());
            System.out.print(" name:" + getName());
            System.out.print(" patronymic: " + getPatronymic());
            System.out.print(" data rojd: " + getData_rojdenia().getYear() + " " + getData_rojdenia().getMonth() + " " + getData_rojdenia().getDay());
            System.out.print(" adres: " + getAdres());
            System.out.print(" telefon: " + getTelefon());
            System.out.print(" facultet: " + getFacultet());
            System.out.print(" kurs: " + getKurs());
            System.out.print(" gryppa: " + getGryppa() + "\n");
        }
    }
    public void vivodGodRojd(int god){
        if(god<getData_rojdenia().getYear()){
            System.out.println(getName()+" "+getData_rojdenia().getYear()+" ");
        }
    }


    @Override
    public String toString() {
        return this.id + " " + this.surname + " " + this.name + " " + this.patronymic + " " + this.data_rojdenia.getYear()+" "+this.adres+" "+this.telefon+" "+this.facultet+" "+this.kurs+" "+this.gryppa+"\n";
    }
}


