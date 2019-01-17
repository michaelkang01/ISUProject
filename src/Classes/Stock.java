
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
        calcInterest();
        value *= interest;
        return value;
    }

    //Special method of Stocks that pays out a dividend of the value every update  
    public double getDividend() {
        dividend = value/ownership;
        return dividend;
    }
    
    
    
}
