
package Classes;

public class Stock extends Assets{
    //Stocks will reveal ownership of a company
    private double ownership;
    //Stocks will also pay out a dividend (seperate from value of stocks)
    private double dividend;
    
    public Stock(int v, String n, String c, double i, double i2, double os){
        super(v,n,c,i,i2);
        type = "STOCK";
        ownership = os;
        dividend = v/os;
    }
    
    public Stock(Stock a) {
        super((Assets)a);
        dividend = a.dividend;
        ownership = a.ownership;
    }

    @Override
    public double updateVal() {
        interest = Math.random() * (max - min) + min;
        super.updateVal();
        return value;
    }
    

    //Special method of Stocks that pays out a dividend of the value every update  
    public double getDividend() {
        dividend = value/ownership;
        return dividend;
    }
    
    //Stock will take the bankbailout of $10, but it will also add the value equal to the previous dividend
    @Override
    public void jumpStart() {
        super.jumpStart();
        value += dividend;
    }

    @Override
    public String event() {
        String logr = "";
        rng = Math.random();
        //20% of stock crashing 5% IF NOT OWNED BY THE PLAYER
        if (rng >= .8 && !isOwned()) {
            value *= .95;
            logr += "\nEVENT|| " + name + " has dropped 5%";
        }
        //5% of stock increasing 10% IF NOT OWNED BY THE PLAYER
        else if (rng >= .75 && !isOwned()) {
            value *= 1.10;
            logr +=  "\nEVENT||" + name + " has increased 10%";
        }
        //15% of stock increasing 10% IF OWNED BY THE PLAYER
        else if (rng >= .85 && isOwned()) {
            value *= 1.10;
            logr +=  "\nEVENT||" + name + " has increased 10%";
        }
        //5% Chance of stock increasing 25% IF OWNED BY THE PLAYER
        else if (rng >= 0.8 && isOwned()) {
            value *= 1.25;
            logr +=  "\nEVENT||" + name + " has increased 25%!";
        }
        //2% Chance of the stock Crashing 30% Regardless of ownership
        else if (rng <= 0.02) {
            value *= .7;
            logr +=  "\nEVENT||" + name + " has crashed 30%!";
        }
        //8% Chance of stock crashing 10% Regardless of ownership
        else if (rng <= .1) {
            value *= .9;
            logr +=  "\nEVENT||" + name + " has crashed 10%";
        }
        return logr;
    }
    
    @Override
    public String examine() {
        String ex = super.examine();
        //Gives infor about the range of chance, how much of the company the stock is, and the projected amount of dividend in the next day
        ex += "\nFlucuation Range: " + min + " - " + max;
        ex += "\nOwnership: " + ownership;
        ex += "\nProjected Dividend: " + getDividend();
        return ex;
    }
    
    
    
}
