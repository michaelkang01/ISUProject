package Classes;

import java.util.*;

public abstract class Person implements Comparable {

    protected String name;
    protected int pr, mon;
    static int pos;
    protected ArrayList<Assets> ase;

    public Person(String n, int p, int m) {
        name = n;
        pr = p;
        mon = m;
    }
    
    public Person() {
        name = "";
        pr = 0;
        mon = 0;
    }

    @Override
    public int compareTo(Object t) {
        Person other = (Person) t;
        if (pr == other.pr) {
            Integer a = mon;
            return a.compareTo(other.mon);
        } else {
            return pr - other.pr;
        }
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

    public static int getPos() {
        return pos;
    }

    public ArrayList<Assets> getAse() {
        return ase;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public static void setPos(int pos) {
        Person.pos = pos;
    }

    public void setAse(ArrayList<Assets> ase) {
        this.ase = ase;
    }

    @Override
    public String toString() {
        return name + "\n" + pr + " Prestige\n$" + mon;
    }
}


