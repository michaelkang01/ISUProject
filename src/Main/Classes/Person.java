
package Main.Classes;

public abstract class Person {
    protected String name;
    protected int pr, mon;
    
    public Person (String n, int p, int m) {
        name = n;
        pr = p;
        mon = m;
    }

    public String getName() {
        return name;
    }

    public int getPr() {
        return pr;
    }

    public int getMon() {
        return mon;
    }
    
    
}
