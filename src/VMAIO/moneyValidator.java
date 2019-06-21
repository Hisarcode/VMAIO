//Name: Mohamad Syazimmi Hersyaputra (D1041171026)
//file name: MoneyValidator.java
//date time create: 20th of June 2019 3:24 pm
//description: 
package VMAIO;
public class moneyValidator {
    String money;
    int moneyvalue;
    int total;
    boolean condition = false;

    void validationMoney(String nominal ) {
        money = nominal;



        

        if ("5000".equals(money)) {
            condition = true;
        }
        
        else if ("10000".equals(money)) {
            condition = true;
        }
        
        else if ("20000".equals(money)) {
            condition = true;
        }
        
        else if ("50000".equals(money)) {
            condition = true;
        }
        
        

    }
    
    void countBalance() {
        try{    
	moneyvalue = Integer.parseInt(money);
        total = total + moneyvalue;
        System.out.println("nominal: "+ moneyvalue);
        System.out.println("jumlah: "+ total);
        } catch(NumberFormatException e){
            System.out.println("Uang Illegal");
        }
    }
}