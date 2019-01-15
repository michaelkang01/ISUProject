
package Classes;

public class Luxury extends Assets{
    //Luxuries have a %Depreciation value instead
    private double depreciation;
    //Luxuries, instead of earning money, gives prestige
    private int prestige;
    
    
    public Luxury(int v, String n, String c, double i, int p){
        super(v,n,c,1,1);
        type = "LUXURY"; 
        depreciation = i;
        prestige = p;
    }
    
    public Luxury() {
        super();
        type = "LUXURY";
        depreciation = 1;
        prestige = 1;
    }
    
    @Override
    public int updateVal() {
        interest = depreciation;
        value *= interest;
        return value;
    }
    
    public int getPrestige() {
        return prestige;
    }
    
}
