package VMAIO8;
import java.util.Scanner;



class MoneyValidator{
    String money;
    private boolean valid;
    private int uang;
    int total;
    
    //method mengecek apakah uang atau bukan
    public void validedMoney(){
        MoneySlot moneyslot = new MoneySlot();
        money = moneyslot.getMoney();
        
        if (money=="5000"){
            uang = 5000;
            valid = true;
        }
        else if (money=="10000"){
            uang = 10000;
            valid = true;
        }
        else if (money=="20000"){
            uang = 20000;
            valid = true;
        }
        else if (money=="50000"){
            uang = 50000;
            valid = true;
        }
        total=uang+total;
    }
    public int getUang(){
        validedMoney();
        return total;
    }
    public boolean getValid(){
        validedMoney();
        return valid;
    }
  
}
public class VendingMachine {

    public static void main(String[] args) {
        String value; 
        Scanner input = new Scanner(System.in);

        System.out.print("Input Your Money Value: ");
        value = input.nextLine();
        
        MoneySlot moneyslot = new MoneySlot();
        moneyslot.setMoney(value);
        System.out.println(moneyslot.getMoney());
        MoneyValidator moneyvalidator = new MoneyValidator();
        System.out.println(moneyvalidator.getUang());
        System.out.println(moneyvalidator.getValid());
    } 
}
