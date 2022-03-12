package strategy_pattern;

public class StrategyMain {

    public static void main(String[] args) {

        Context context = new Context(new Bkash("shakil", "3333", 0));
        System.out.print(context.ExecuteInfo());
        System.out.print(context.ExecutePayment());
    }
}
