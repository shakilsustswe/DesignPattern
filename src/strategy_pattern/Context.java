
package strategy_pattern;


public class Context {
    
    private final Strategy strategy;
    
    public  Context(Strategy strategy)
    {
        this.strategy=strategy;
    }
    
    public String ExecuteInfo()
    {
      return strategy.info();
    }
    public String ExecutePayment()
    {
      return strategy.payMent();
    }
    
    
}
