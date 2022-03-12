package Decoration_Pattern;

public class Suger extends AddOns {

    public Suger(Drinks drinksFee) {
        super(drinksFee);
    }

    public int getCost() {

        return (super.getCost() + 10);
        //// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
