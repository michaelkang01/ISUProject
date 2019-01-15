package Classes;

import java.util.*;

public class Person implements Comparable{

    public String name;
    public int pr;
    public int mon;
    public int pos;
    public ArrayList<Assets> ase = new ArrayList();
    
    public Person(String n, int p, int m) {
        name = n;
        pr = p;
        mon = m;
    }
    //Creates a dummy Person object.
    public Person() {
        name = "";
        pr = 0;
        mon = 0;
    }

    public void addAsset(Assets a) {
        mon -= a.getValue();
        a.owned = true;
        ase.add(a);
        
    }
    
    public void addAssetCP(Assets a) {
        a.owned = true;
        ase.add(a);
    }
    
    
    //The toString acts simply as a display for what the Scoreboard will show
    public String toString() {
        return (name + "\n" + pr + " Prestige\n" + "$" + mon);
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

    public ArrayList getAse() {
        return ase;
    }

    @Override
    public int compareTo(Object t) {
        Person other = (Person)t;
        if (mon == other.mon) return 0;
        else if (mon > other.mon) return 1;
        else return -1;
    }
}


