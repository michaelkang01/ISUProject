
package Classes;

public class Bond extends Assets{
    //Bonds do not have randomness to them, but rather a flat rate.
    private double rate;
    
    public Bond(int v, String n, String c, double r){
        super(v,n,c,1,1);
        type = "BOND"; 
        rate = r;
    }
    
    public Bond() {
        super();
        type = "BOND";
        rate = 1;
    }
    
    @Override
    public int updateVal() {
        interest = rate;
        value *= interest;
        return value;
    }
    
}
