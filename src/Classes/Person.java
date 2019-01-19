package Classes;

import java.util.*;

public class Person implements Comparable{

    public String name;
    public int pr;
    public double mon;
    public int pos;
    public double dividends;
    public ArrayList<Assets> ase = new ArrayList();
    
    //Creates a Person, given all the values required
    public Person(String n, int p, int m) {
        name = n;
        pr = p;
        mon = m;
        dividends = 0;
    }


    public boolean addAsset(Assets a) {
        //If you don't have te money, return false
        if (mon < a.getValue()) return false;
        //Or else just lose the money to buy something
        mon -= a.getValue();
        a.owned = true;
        //Puts in a Bond if it is a Bond
        if (a.type.equals("BOND")) {
            ase.add(new Bond((Bond) a));
        }
        //Puts in a Stock if it is a Stock, 
        else if (a.type.equals("STOCK")) {
            ase.add(new Stock((Stock) a));
        }
        //Adds the commodity to list if not previously present, otherwise only the static counter of commodities will tick up (taken care of by main program)
        else if (a.type.equals("COMMODITY")) {
            if(a.getCode().equals("OIL") && Commodity.oilcount == 0) {
                ase.add(new Commodity((Commodity) a));
            }
            if(a.getCode().equals("GLD") && Commodity.gldcount == 0) {
                ase.add(new Commodity((Commodity) a));
            }
            if(a.getCode().equals("SIL") && Commodity.silcount == 0) {
                ase.add(new Commodity((Commodity) a));
            }
            if(a.getCode().equals("PRD") && Commodity.prdcount == 0) {
                ase.add(new Commodity((Commodity) a));
            }
            if(a.getCode().equals("NRG") && Commodity.nrgcount == 0) {
                ase.add(new Commodity((Commodity) a));
            }
            else {
                return true;
            }
        }
        //Adds luxury if it is a luxury, and add prestige value
        else if (a.type.equals("LUXURY")) {
            ase.add(new Luxury((Luxury) a));
            pr += ((Luxury)a).getPrestige();
        }
        else return false;
        return true;
    }
    
    public void sellAsset(int a) {
        //Gain money equal to the value
        mon += ase.get(a).getValue();
        //Set owned to false
        ase.get(a).owned = false;
        //Remove pretige value if item sold was a luxury
        if (ase.get(a).getType().equals("LUXURY")) {
            pr -= ((Luxury)ase.get(a)).getPrestige();
        }
        //If it was a commodity, check if it was the last one, or if there are more still, if there are still more, do not delete from list, only remove one from the count (handled by main);
        if (ase.get(a).getType().equals("COMMODITY")) {
            if(ase.get(a).getCode().equals("OIL") && Commodity.oilcount == 0) {
                ase.remove(a);
            }
            else if(ase.get(a).getCode().equals("GLD") && Commodity.gldcount == 0) {
                ase.remove(a);
            }
            else if(ase.get(a).getCode().equals("SIL") && Commodity.silcount == 0) {
                ase.remove(a);
            }
            else if(ase.get(a).getCode().equals("PRD") && Commodity.prdcount == 0) {
               ase.remove(a);
            }
            else if(ase.get(a).getCode().equals("NRG") && Commodity.nrgcount == 0) {
                ase.remove(a);
            }
            else return;
        }
        else {
        ase.remove(a);
        }
        
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

    public double getMon() {
        return mon;
    }

    public ArrayList getAse() {
        return ase;
    }
    
    public void getPayout() {
        mon += dividends;
    }

    @Override
    public int compareTo(Object t) {
        Person other = (Person)t;
        if (mon == other.mon) return 0;
        else if (mon > other.mon) return 1;
        else return -1;
    }
}


