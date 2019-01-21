package Classes;

public class Commodity extends Assets {

    //Player can buy infinate amount of commodoties, and therefore it must be counted, used to ensure no replications
    public static int gldcount = 0;
    public static int silcount = 0;
    public static int oilcount = 0;
    public static int nrgcount = 0;
    public static int prdcount = 0;

    public Commodity(int v, String n, String c, double i, double i2) {
        super(v, n, c, i, i2);
        type = "COMMODITY";
    }

     //Used to copy an existing Commodity (used for moving from available to owned assets)
    public Commodity(Commodity a) {
        super((Assets)a);
    }
    
    @Override
    public double updateVal() {
        interest = Math.random() * (max - min) + min;
        super.updateVal();
        return value;
    }

    @Override
    public String event() {
        String logr = "";
        rng = Math.random();
        //1% chance of the commodity crashing 50%
        if (rng >= .99) {
            value *= 0.5;
            logr += "\nEVENT|| " + name + " has crashed 50%!!!";
        }
        //1% chance of the commodity increasing 50%
        else if (rng >= .98) {
            value *= 1.5;
            logr +="\nEVENT|| " + name + " has increased 50%!!!";
        }
        return logr;
    }
    
    
}
