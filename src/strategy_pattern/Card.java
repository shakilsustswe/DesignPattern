
package strategy_pattern;

public class Card implements Strategy{

    public String Name,Passowrd;
    public int amount;

    public Card(String Name, String Passowrd, int amount) {
        this.Name = Name;
        this.Passowrd = Passowrd;
        this.amount = amount;
    }

    @Override
    public String info() {
        return "Card \n"+"Name : "+Name+" Pass : "+Passowrd;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String payMent() {
        
        return " Amount : "+amount+"\n";
       /// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
