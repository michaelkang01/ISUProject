
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
    
    public Luxury(Luxury a) {
        super((Assets)a);
        depreciation = a.depreciation;
        prestige = a.prestige;
    }
    
    @Override
    public double updateVal() {
        interest = depreciation;
        super.updateVal();
        return value;
    }
    
    
    public int getPrestige() {
        return prestige;
    }

    @Override
    public String event() {
        String logr = "";
        rng = Math.random();
        return logr;
    }
    
}
