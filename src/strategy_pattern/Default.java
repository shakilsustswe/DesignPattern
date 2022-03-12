package strategy_pattern;

public class Default extends Common implements Info, Payment {

    String fstr = "";

    public Default(String name, int pass, int amount) {
        this.name = name;
        this.pass = pass;
        this.amount = amount;
        ////throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void info() {

        fstr += "Name : " + name;
        fstr += " Pass : " + pass;
        ///System.out.println(fstr);
        /////return  fstr;
        /// return name;
        /// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pay() {
        fstr += " Ammount : " + amount;
        ///System.out.println(fstr);
        /////return fstr;
        /// return amount;
        ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void bkash() {
        fstr += " in Bkash";
        System.out.println(fstr);
        /////return  fstr;
    }

    public void card() {
        fstr += " in Card";
        System.out.println(fstr);
        ///// return fstr;
    }

}
