public class CreditCard {
    int number;
    int money;

    public CreditCard(int number, int money) {
        this.number = number;
        this.money = money;
    }

    void addMoney(int money){
        this.money += money;
    }

    void minusMoney(int money){
        this.money -= money;
    }

    void display(){
        System.out.println("номер карточки = " + number);
        System.out.println("количество денег на карте = " + money);
    }
}
