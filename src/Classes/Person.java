package Classes;

public abstract class Person implements Comparable {

    protected String name;
    protected int pr, mon;
    static int pos;

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

    public String getName() {
        return name;
    }

    public int getPr() {
        return pr;
    }

    public int getMon() {
        return mon;
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

    @Override
    public String toString() {
        return name + "\n" + pr + " Prestige\n$" + mon;
    }
}


