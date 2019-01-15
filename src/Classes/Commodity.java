
package Classes;

public class Commodity extends Assets{
    
    public Commodity(int v, String n, String c, double i, double i2){
        super(v,n,c,i, i2);
        type = "COMMODITY"; 
    }
    
    public Commodity() {
        super();
        type = "COMMODITY";
    }

    @Override
    public int updateVal() {
        interest = Math.random() * ((max - min) + 1) + min;
        value *= interest;
        return value;
    }
}
