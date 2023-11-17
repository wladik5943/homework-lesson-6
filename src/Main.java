public class Main {
    public static void main(String[] args){
        CreditCard creditCard = new CreditCard(123456, 564);
        CreditCard creditCard1 = new CreditCard(465734, 898);
        CreditCard creditCard2 = new CreditCard(856754, 8765);

        creditCard.addMoney(765);

        creditCard1.addMoney(765);
        creditCard2.minusMoney(998);

        creditCard.display();
        System.out.println();
        creditCard1.display();
        System.out.println();
        creditCard2.display();
    }
}