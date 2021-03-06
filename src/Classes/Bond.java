
package Classes;

public class Bond extends Assets{
    //Bonds do not have randomness to them, but rather a flat rate.
    private double rate;
    //Bonds must also store their original value, as it will be needed when it is sold
    private double ogvalue;
    
    //Creating a new bond
    public Bond(double v, String n, String c, double r){
        super(v,n,c,1,1);
        type = "BOND"; 
        rate = r;
        ogvalue = v;
    }
    
    //Duplicating the Bond
    public Bond(Bond a) {
        super((Assets)a);
        rate = a.rate;
        ogvalue = a.ogvalue;
    }
    
    //Bonds have a special constructor, which slightly duplicates but uses the original value
    public Bond(double v, Bond a) {
        super((Assets)a);
        //Override the value given by the super, with the inputed ogvalue
        super.value = v;
        rate = a.rate;
    }
    @Override
    public double updateVal() {
        interest = rate;
        super.updateVal();
        return value;
    }
    
    public double getOg() {
        return ogvalue;
    }

    @Override
    public String event() {
        String logr = "";
        rng = Math.random();
        if (rng >= .9 && isOwned()) {
            logr += "\nEVENT|| " + name + " would have crashed, Good thing you invested in Bonds!";
        }
        return logr;
    }
    
    @Override
    public String examine() {
        String ex = super.examine();
        //Gives info about the rate of the bond, the original value and the total gain (should be 0 if not owned)
        ex += "\nRate: " + rate;
        ex += "\nOriginal Value: " + ogvalue;
        ex += "\nTotal Gains: " + (value - ogvalue);
        return ex;
    }
    
    
}
