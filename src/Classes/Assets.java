
package Classes;

public abstract class Assets {
    protected int value;
    protected String name, code;
    protected double interest;
    protected boolean owned;
    
    public Assets() {
        value = 0;
        name = "";
        interest = 1;
        owned = false;
        code = "";
    }
    
    public Assets(int v, String n, String c, double i) {
        value = v;
        name = n;
        code = c;
        interest = i;
        owned = false;
    }
    
    abstract public int updateVal();

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
    
}
