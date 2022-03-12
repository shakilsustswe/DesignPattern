package Decoration_Pattern;

public class DecoratorMain {

    public static void main(String[] args) {

        Drinks d = new Tea();
        d = new Milk(d);
        d = new Milk(d); ///for addons
        System.out.println(d.getCost());
        

        d = new Suger(d);
        System.out.println(d.getCost());

    }

}
