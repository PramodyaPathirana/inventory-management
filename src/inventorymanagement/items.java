package inventorymanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sashini Shihara
 */
public class items {

    String icode;
    int qty;
    double amt;

    public items(String icode, int qty, double amt) {
        this.icode=icode;
        this.qty=qty;
        this.amt=amt;
    }

    public String getIcode() {
        return icode;
    }

    public int getQty() {
        return qty;
    }

    public double getAmt() {
        return amt;
    }

}
