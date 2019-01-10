package Classes;

public class Player extends Person {

    public static int str, agi, inte, en, hn, wa, enmax, hnmax, wamax;

    public Player(String n, int p, int m) {
        super(n, p, m);
        str = 1;
        agi = 1;
        inte = 1;
        enmax = 100;
        hnmax = 100;
        wamax = 100;
        en = 100;
        hn = 100;
        wa = 100;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        if (this.str == 99) return;
        this.str = str;
    }

    public int getAgi() {
        
        return agi;
    }

    public void setAgi(int agi) {
        if (this.agi == 99) return;
        this.agi = agi;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        if (this.inte == 99) return;
        this.inte = inte;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getHn() {
        return hn;
    }

    public void setHn(int hn) {
        this.hn = hn;
    }

    public int getWa() {
        return wa;
    }

    public void setWa(int wa) {
        this.wa = wa;
    }

    public int getEnmax() {
        return enmax;
    }

    public void setEnmax(int enmax) {
        this.enmax = enmax;
    }

    public int getHnmax() {
        return hnmax;
    }

    public void setHnmax(int hnmax) {
        this.hnmax = hnmax;
    }

    public int getWamax() {
        return wamax;
    }

    public void setWamax(int wamax) {
        this.wamax = wamax;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
