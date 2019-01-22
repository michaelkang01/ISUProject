
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
        //1% Chance of your Luxury being a collectable and DOUBLELING in value and Giving 10 Prestige
        if (rng >= 0.99) {
            value *= 2;
            prestige += 10;
            logr += "\nEVENT||" + name + " was found to be a collectable!";
        }
        return logr;
    }
    
    @Override
    public String examine() {
        String ex = super.examine();
        //Gives information of the depreciation and prestige value of assets
        ex += "\nDepreciation: " + depreciation;
        ex += "\nPrestige: " + prestige;
        return ex;
    }
    
}
