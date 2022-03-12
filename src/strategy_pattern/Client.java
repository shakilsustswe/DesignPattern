package strategy_pattern;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How to pay : ");
        String str = input.nextLine();
        if (str.equals("bkash")) {
            Default bk = new Default("shakil", 12345, 100);
            bk.info();
            bk.pay();
            bk.bkash();
            /////System.out.println(s);

        } else {
            Default card = new Default("shakil", 22, 100);
            card.info();
            card.pay();
            card.card();

        }
    }

}
