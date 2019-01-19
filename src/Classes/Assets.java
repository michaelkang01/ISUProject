
package Classes;

import java.text.NumberFormat;

public abstract class Assets implements Comparable{
    
    //$Value of the Asset
    protected double value;
    //Name and Code (Code is very important for sorting and such, Name is important for display only)
    protected String name, code;
    //Min and max will be used to generate randomness, interest will be used to actually discern gained value
    protected double min, max, interest;
    //Check if the Asset at hand is owned by the player, important for the examine() method
    protected boolean owned;
    //A short name to discern the type of Asset it is, used in place of .instanceOf, because of weird interaction with ArrayLists
    protected String type;
    //Markettotal is a static int storing how many assets are available for purchase (Counting commodities as 1)
    public static int markettotal;
    //Playertotal is a static int that stores how many total assets are owned by the player (Each commodity is an addition (5 Oils = 5 Total)
    public static int playertotal;
    //SortVal will be used to determine what kind of sort is done with the assets, Anything else = Code, 1 = Name, 2 = Type, 3 = Vallue
    public static int sortVal;
    
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
    }
    //All Assets will have the same way to update the value, only the (abstract)calcInterest() function will change
    final public double updateVal() {
        calcInterest();
        value *= interest;
        return value;
    }
    
    //Used as what to display in the Assets Lists, all assets will show the exact same info no matter what.
    final public String toString() {
        return code + ": " + name + " || " + type + " || " + nf.format(value);
    }
    
    //Different types of Assets will have different ways to calculate interests (Some are static growths, other's are variable/random, some are static decay)
    abstract public void calcInterest();
    //Returns the value of the asset, used when calculating gains/losses
    public double getValue() {
        return value;
    }
    //Returns entire name of the Assets
    public String getName() {
        return name;
    }
    //Returns 3 Letter Code, useful for comparison/easy searching.
    public String getCode() {
        return code;
    }
    //Returns the type of object it is (replaces instanceOf because of ArrayList issues)
    public String getType() {
        return type;
    }
    //Returns a boolean stating if the asset is owned by the player
    public boolean isOwned() {
        return owned;
    }
    
    //Jumpstart has a general value of $10 (Given by a mythical Bank), the function is extended in Stocks
    public void jumpStart() {
        value += 10;
    }
    //Returns the static value of the amount of assets in the market
    public static int getTotal() {
        return markettotal;
    }
    //Returns the static value of the amount of assets owned by the player
    public static int getOwnedtotal() {
        return playertotal;
    }
    
    public static void setSort(int a) {
        sortVal = a;
    }
    //This compareTo is required to sort  order for the list of objects ACCORDING TO THEIR determined variable
    @Override
    public int compareTo(Object t) {
        //If the sortVal is 3, sort by ascending value
        if (sortVal == 3) {
            return (int) (value - ((Assets)t).value);
        }
        //If the sortVal is 2, sort by type
        else if (sortVal == 2) {
            return type.compareTo(((Assets)t).type);
        }
        //If the sortVal is 1, sort by name
        else if (sortVal == 1) {
             return name.compareTo(((Assets)t).name);
        }
        //If the sortVal is anything else, sort by Code (DEFAULT)
        else {
             return code.compareTo(((Assets)t).code);
    }
    
    
}
}
