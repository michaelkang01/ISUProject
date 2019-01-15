
package Classes;

public class Stock extends Assets{
    
    private double ownership;
    private int dividend;
    
    public Stock(int v, String n, String c, double i, double i2){
        super(v,n,c,i, i2);
        super.type = "stock";
    }
    @Override
    public int updateVal() {
        value *= interest;
        return value;
    }
    
    public int payout() {
        return dividend;
    }

    public double getOwnership() {
        return ownership;
    }

    public double getdividend() {
        return dividend;
    }
    
    
    
}
