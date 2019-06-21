import java.util.Scanner;
public class ProductShelf {
     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int DrinkTotal=20;

        int na;
        String cans;
        int how;
        int newTotal;
        int newProducttotal;
       

        System.out.print("Input Drink Code: ");
        na = input.nextInt();


        if (na == 1){
            cans = "Coca-Cola";
            System.out.println("Drinks there : "+DrinkTotal );
            System.out.println("Drinks Total : "+cans );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
          
            System.out.println("now total : "+newTotal);
            


        }else if (na == 2){
            cans = "Minute Maid";
            System.out.println("Drinks there : "+cans );
            System.out.println("Drink Total : "+DrinkTotal );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
            
            System.out.println("now total : "+newTotal);
            
        }else if (na == 3){
            cans = "TaB";
            System.out.println("Drinks there : "+cans );
            System.out.println("Drink Total : "+DrinkTotal );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
            System.out.println("now total : "+newTotal);
        
        }else if (na == 4){
            cans = "Fanta";
            System.out.println("Drinks there : "+cans );
            System.out.println("Drink Total : "+DrinkTotal );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
            
            System.out.println("now total : "+newTotal);
            
        }else if (na == 5){
            cans = "Aquarius";
            System.out.println("Drinks there : "+cans );
            System.out.println("Drink Total : "+DrinkTotal );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
            
            System.out.println("now total : "+newTotal);
           
        }else if (na == 6){
            cans = "AW";
            System.out.println("Drinks there : "+cans );
            System.out.println("Drink Total : "+DrinkTotal );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
           
            System.out.println("now total : "+newTotal);
           
        }else if (na == 7){
            cans = "Ciel";
            System.out.println("Drinks there : "+cans );
            System.out.println("Drink Total : "+DrinkTotal );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
           
            System.out.println("now total : "+newTotal);
            
        }else if (na == 8){
            cans = "Sprite";
            System.out.println("Drinks there : "+cans );
            System.out.println("Drink Total : "+DrinkTotal );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
            
            System.out.println("now total : "+newTotal);
            
        }else if (na == 9){
            cans = "Burn";
            System.out.println("Drinks there : "+cans );
            System.out.println("Drink Total : "+DrinkTotal );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
           
            System.out.println("now total : "+newTotal);
           
        }else if(na == 10){
            cans = "Fresca";
            System.out.println("Drinks there : "+cans );
            System.out.println("Drink Total : "+DrinkTotal );
            System.out.print("how many drink you want: ");
            how = input.nextInt();
            newTotal =( DrinkTotal-how);
            
            System.out.println("now total : "+newTotal);
           
        }else{
            cans = "Not Drink";
            System.out.println(""+cans );
        }
    } 
}
