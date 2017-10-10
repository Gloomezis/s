package Bankomat_epam;

public class Bankomat {
    private int denga5;
    private int denga10;
    private int denga20;

    public int getDenga5() {
        return denga5;
    }

    public int getDenga10() {
        return denga10;
    }

    public int getDenga20() {
        return denga20;
    }

    public void setDenga5(int denga5) {
        this.denga5 = denga5;
    }

    public void setDenga10(int denga10) {
        this.denga10 = denga10;
    }

    public void setDenga20(int denga20) {
        this.denga20 = denga20;
    }

    public void skokoDenegVBankomate() {
        System.out.println("В банкомате сейчас: " + getDenga5() + " купюр по 5р, " + getDenga10() + " купюр по 10р, " + getDenga20() + " купюр по 20р.\nВ общей сложности: " + (getDenga5() * 5 + getDenga10() * 10 + getDenga20() * 20) + "рублей.");
    }

    public void snimanie(int stokaSnyat) {
        if (stokaSnyat % 5 == 0) {
            if (stokaSnyat <= (getDenga20() * 20 + getDenga10() * 10 + getDenga5() * 5)) {

                int x20 = stokaSnyat / 20;
                if (getDenga20() >= x20) {
                    setDenga20(getDenga20() - x20);
                    int x10 = (stokaSnyat - x20 * 20) / 10;
                    if (getDenga10() >= x10) {
                        setDenga10(getDenga10() - x10);
                        int x5 = ((stokaSnyat - x20 * 20 - x10 * 10) / 5);
                        if (getDenga5() >= x5) {
                            setDenga5(getDenga5() - x5);
                            System.out.println("вы успешно получаете:\n" + x20 + " купюр(у) номиналом 20р,\n " + x10 + " купюр(у) номиналом 10р,\n " + x5 + " курюр(у) номиналом 5р.");
                        } else {
                            System.out.println("сорян, в банкомате нету купюры номиналом 5р\nМогу выдать:\n" + x20 + " купюр(ы) по 20р и " + x10 + "купюр(ы) по 10р");
                            setDenga20(getDenga20() + x20);
                            setDenga10(getDenga10() + x10);
                        }
                    } else {
                        int x5 = (stokaSnyat - x20 * 20) / 5;
                        if (getDenga5() >= x5) {
                            setDenga5(getDenga5() - x5);
                            System.out.println("вы успешно получаете:\n" + x20 + " купюр(у) номиналом 20р,\n" + 0 + " купюр(у) номиналом 10р,\n" + x5 + " курюр(у) номиналом 5р.");
                        } else {
                            System.out.println("сорян, в банкомате нету нужного количества купюр по 5р и 10р\nМогу выдать: " + x20 + " купюр(ы) по 20р");
                            setDenga20(getDenga20() + x20);
                        }
                    }
                } else {
                    x20 = getDenga20();
                    setDenga20(getDenga20() - x20);
                    int x10 = ((stokaSnyat - x20 * 20) / 10);
                    if (getDenga10() >= x10) {
                        setDenga10(getDenga10() - x10);
                        int x5 = ((stokaSnyat - x20 * 20 - x10 * 10) / 5);
                        if (getDenga5() >= x5) {
                            setDenga5(getDenga5() - x5);
                            System.out.println("вы успешно получаете:\n" + x20 + " купюр(у) номиналом 20р,\n " + x10 + " купюр(у) номиналом 10р,\n " + x5 + " купюр(у) номиналом 5р.");
                        } else {
                            System.out.println("сорян, в банкомате нету нужного количества купюр");
                            setDenga20(getDenga20() + x20);
                            setDenga10(getDenga10() + x10);
                        }
                    } else {
                        x10 = getDenga10();
                        setDenga10(getDenga10() - x10);
                        int x5 = (stokaSnyat - x20 * 20 - x10 * 10) / 5;
                        if (getDenga5() >= x5) {
                            setDenga5(getDenga5() - x5);
                            System.out.println("вы успешно получаете:\n" + x20 + " купюр(у) номиналом 20р,\n" + x10 + " купюр(у) номиналом 10р,\n" + x5 + " курюр(у) номиналом 5р.");
                        } else {
                            System.out.println("сорян, в банкомате нету нужного количества купюр по 5р и 10р\nМогу выдать: " + x20 + " купюр(ы) по 20р");
                            setDenga20(getDenga20() + x20);
                        }
                    }
                }
            } else {
                System.out.println("Нету столько денег в банкомате.будьте скромнее");
            }
        } else {
            System.out.println("вы ввели число не кратное 5, в банкомате предусмотрены купюры только 5р, 10р и 20р\n");
        }
    }
}
