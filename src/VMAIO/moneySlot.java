/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VMAIO;

/**
 *
 * @author User
 */
public class moneySlot {
    private String money;
    
    public moneySlot(String nominal){
        money = nominal;
    }
    
    public void setMoney(String nominal){
        money = nominal;
    }
    public String getMoney(){
        return money;
    }
    
}
