
package Classes;

import java.text.NumberFormat;

public abstract class Assets implements Comparable{
    
    protected double value;
    protected String name, code;
    protected double min, max, interest;
    protected boolean owned;
    protected String type;
    public static int markettotal;
    public NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    //Used to Create a New Asset
    public Assets(double v, String n, String c, double i, double i2) {
        value = v;
        name = n;
        code = c;
        min = i;
        max = i2;
        owned = false;
        markettotal ++;
    }
    
    //Used to copy an existing Asset (used for moving from available to owned assets)
    public Assets(Assets a) {
        value = a.value;
        name = a.name;
        code = a.code;
        min = a.min;
        max = a.max;
        interest = a.interest;
        owned = a.owned;
        type = a.type;
        //You can purchase multiple copies of commodities but it will not add to market total
        if(!a.type.equals("COMMODITY")) {
            markettotal ++;
        }
    }
    
    public double updateVal() {
        calcInterest();
        value *= interest;
        return value;
    }
    
    //Used as what to display in the Assets Lists, all assets will show the exact same info no matter what.
    final public String toString() {
        return type + ": " + name + " || " + code + " || " + nf.format(value);
    }
    
    //Different types of Assets will have different ways to calculate interests (Some are static growths, other's are variable/random, some are static decay)
    abstract public void calcInterest();

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
    
    public String getType() {
        return type;
    }

    public boolean isOwned() {
        return owned;
    }

    public void jumpStart() {
        value += 10;
    }
    
    public static int getTotal() {
        return markettotal;
    }
    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
