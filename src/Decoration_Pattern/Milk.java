package Decoration_Pattern;

public class Milk extends AddOns {

    public Milk(Drinks drinksFee) {
        super(drinksFee);
    }

    public int getCost() {
        return (super.getCost() + 10);
        //// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
