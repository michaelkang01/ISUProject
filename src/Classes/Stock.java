
package Classes;

public class Stock extends Assets{
    //Stocks will reveal ownership of a company
    private double ownership;
    //Stocks will also pay out a dividend (seperate from value of stocks)
    private int dividend;
    
    public Stock(int v, String n, String c, double i, double i2, double os, int div){
        super(v,n,c,i,i2);
        type = "STOCK";
        ownership = os;
        div = dividend;
    }
    
    public Stock() {
        super();
    }
    
    @Override
    public int updateVal() {
        interest = Math.random() * ((max - min) + 1) + min;
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
