
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
        ogvalue = value;
    }
    
    //Duplicating the Bond
    public Bond(Bond a) {
        super((Assets)a);
        rate = a.rate;
        ogvalue = value;
    }
    
    //Bonds have a special constructor, which slightly duplicates but uses the original value
    public Bond(double v, Bond a) {
        super((Assets)a);
        //Override the value given by the super, with the inputed ogvalue
        super.value = v;
        rate = a.rate;
    }
    @Override
    public void calcInterest() {
        interest = rate;
    }
    
    public double getOg() {
        return ogvalue;
    }

    @Override
    public String event() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
