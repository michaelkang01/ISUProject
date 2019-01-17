package Classes;

public class Commodity extends Assets {

    //Player can buy infinate amount of commodoties, and therefore it must be counted.
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
        calcInterest();
        value *= interest;
        return value;
    }
    
}
