import java.util.Scanner;

public class MainForATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(5, 8, 6);

        atm.display();

        atm.addMoney(2, 4, 1);
        atm.display();

        System.out.print("требуемое количество денег = ");
        int money = scanner.nextInt();

        System.out.println(atm.outMoney(money));
        System.out.println();
        atm.display();
    }
}
