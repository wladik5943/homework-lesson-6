public class ATM {
    int twenty;
    int fifty;
    int hundert;

    int money;

    public ATM(int twenty, int fifty, int hundert) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundert = hundert;
        this.money += twenty * 20 + fifty * 50 + hundert * 100;
    }

    void addMoney(int twenty, int fifty, int hundert) {
        this.twenty += twenty;
        this.fifty += fifty;
        this.hundert += hundert;
        this.money += twenty * 20 + fifty * 50 + hundert * 100;
    }

    void display() {
        System.out.println("количество денег в банкомате = " + this.money);
        System.out.println("количество купюр номиналом 100 = " + this.hundert);
        System.out.println("количество купюр номиналом 50 = " + this.fifty);
        System.out.println("количество купюр номиналом 20 = " + this.twenty);
    }

    boolean outMoney(int money) {
        if (money > this.money) {
            System.out.println("недостаточно средств");
            return false;
        } else {
            int tw = 0;
            int fif = 0;
            int hun = 0;
            int banknots = 0;
            banknots = money / 100;
            if (banknots <= this.hundert) {
                hun = banknots;
                money -= banknots * 100;
                this.money -= banknots * 100;
                this.hundert -= banknots;
            } else {
                hun = this.hundert;
                banknots -= this.hundert;
                money -= this.hundert * 100;
                this.money -= this.hundert * 100;
                this.hundert = 0;
            }
            banknots = 0;
            banknots = money / 50;
            if (banknots <= this.fifty) {
                fif = banknots;
                money -= banknots * 50;
                this.money -= banknots * 50;
                this.fifty -= banknots;
            } else {
                fif = this.fifty;
                banknots -= this.fifty;
                money -= this.fifty * 50;
                this.money -= this.fifty * 50;
                this.fifty = 0;
            }
            banknots = 0;
            banknots = money / 20;
            if (banknots <= this.twenty) {
                tw = banknots;
                money -= banknots * 20;
                this.money -= banknots * 20;
                this.twenty -= banknots;
            } else {
                tw = this.twenty;
                banknots -= this.twenty;
                money -= this.twenty * 20;
                this.money -= this.twenty * 20;
                this.twenty = 0;
            }
            System.out.println("купюр номиналом 100 = " + hun);
            System.out.println("кюпюр номиналом 50 = " + fif);
            System.out.println("кюпюр номиналом 20 = " + tw);
            return true;


        }

    }
}
