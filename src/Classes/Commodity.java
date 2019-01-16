package Classes;

public class Commodity extends Assets {

    //Player can buy infinate amount of commodoties, and therefore it must be counted.
    static int comid = 0;
    private int privid;

    public Commodity(int v, String n, String c, double i, double i2) {
        super(v, n, c, i, i2);
        type = "COMMODITY";
        privid = comid;
        comid++;
    }

    public Commodity() {
        super();
        type = "COMMODITY";
        privid = comid;
        comid++;
    }

    @Override
    public int updateVal() {
        interest = Math.random() * ((max - min) + 1) + min;
        value *= interest;
        return value;
    }
}
