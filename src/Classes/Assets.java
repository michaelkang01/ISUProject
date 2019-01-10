
package Classes;

public class Assets {
    public int value;
    public String name;
    public double interest;
    
    public Assets() {
        value = 0;
        name = "";
        interest = 1;
    }
    
    public Assets(int v, String n, double i) {
        value = v;
        name = n;
        interest = i;
    }
    
    public int runInt() {
        value *= interest;
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInterest(double interest) {
        this.interest = interest;
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
}
