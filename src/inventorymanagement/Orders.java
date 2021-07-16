/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;
import java.util.*;
/**
 *
 * @author Aamir ali Shafeek
 */
public class Orders {
    private int order_id,customer_id,order_total;
    
    
    public Orders(int order_id,int order_total,int customer_id){
        this.order_id= order_id;
        this.customer_id=customer_id;
        this.order_total= order_id;
        
        
    } 
    public int getorder_id(){
        return order_id;
    }
    public int getcustomer_id(){
        return customer_id;
    }
    public int getorder_total(){
        return order_total;
    }
    
}
