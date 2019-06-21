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

    void validationMoney() {
        if (money == "5000") {
            condition = true;
        }
        
        else if (money == "10000") {
            condition = true;
        }
        
        else if (money == "20000") {
            condition = true;
        }
        
        else if (money == "50000") {
            condition = true;
        }
        
        else {
            condition = false;
        }
    }
    
    void countBalance() {
	moneyvalue = Integer.parseInt(money);
        total = total + moneyvalue;
    }
}