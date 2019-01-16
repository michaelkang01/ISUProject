
package Classes;

public abstract class Assets implements Comparable{
    
    protected int value;
    protected String name, code;
    protected double min, max, interest;
    protected boolean owned;
    protected String type;
    
    public Assets() {
        value = 0;
        name = "";
        min = 1;
        max = 1;
        owned = false;
        code = "";
    }
    
    public Assets(int v, String n, String c, double i, double i2) {
        value = v;
        name = n;
        code = c;
        min = i;
        max = i2;
        owned = false;
    }
    
    abstract public int updateVal();
    
    final public String toString() {
        return type + ": " + name + " || " + code + " || $" + value;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public double getInterest() {
        return interest;
    }

    public String getCode() {
        return code;
    }

    public boolean isOwned() {
        return owned;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
