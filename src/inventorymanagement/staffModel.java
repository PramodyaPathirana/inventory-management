/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

/**
 *
 * @author Aamir ali Shafeek
 */
class staffModel {
    private int sno,telNo;
    private String name,address,privilege;
    
    public staffModel(int sno,String name, String address,int telNo,String privilege){
        this.sno=sno;
        this.name=name;
        this.address=address;
        this.telNo=telNo;
        this.privilege=privilege;   
        
    }
    public int getsno(){
        return sno;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public int gettelNo(){
        return telNo;
    }
    public String getprivilege(){
        return privilege;
    }
    
}
