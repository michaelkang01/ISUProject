
package Classes;

public class Bond extends Assets{

    public Bond(int v, String n, String c, double i, double i2){
        super(v,n,c,i, i2);
        super.type = "bond"; 
    }
    
    @Override
    public int updateVal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
