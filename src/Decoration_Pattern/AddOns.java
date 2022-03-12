package Decoration_Pattern;

public class AddOns extends Drinks {

    public Drinks drinksFee;

    public AddOns(Drinks drinksFee) {
        this.drinksFee = drinksFee;
    }

    @Override
    int getCost() {

        return drinksFee.getCost();

        ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
