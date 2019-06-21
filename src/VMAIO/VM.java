/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VMAIO;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class VM { 

    /**
     *
     * @param args
     */
    
    public static void main (String[] args) {
        bottle1 Cola = new bottle1();
        Cola.setNama();
        Cola.setHarga();
        bottle2 Maid = new bottle2();
        Maid.setNama();
        Maid.setHarga();
        bottle3 Tab = new bottle3();
        Tab.setNama();
        Tab.setHarga();
        bottle4 Fanta = new bottle4();
        Fanta.setNama();
        Fanta.setHarga();
        bottle5 Aqua = new bottle5();
        Aqua.setNama();
        Aqua.setHarga();
        
        cans1 AW = new cans1();
        AW.setNama();
        AW.setHarga();
        cans2 Ciel = new cans2();
        Ciel.setNama();
        Ciel.setHarga();
        cans3 Sprite = new cans3();
        Sprite.setNama();
        Sprite.setHarga();
        cans4 Burn = new cans4();
        Burn.setNama();
        Burn.setHarga();
        cans5 Fresca = new cans5();
        Fresca.setNama();
        Fresca.setHarga();
   
        
        //masukkan inputan money
        String money;
        System.out.print("Masukkan uang : ");
        Scanner input = new Scanner(System.in);
      
        MoneySlot Slot = new MoneySlot();
        money = input.nextLine();
        Slot.setMoney(money);
        Slot.getMoney();
        
        //ambil nilai money panggil set & get money;

        //validedmoney
        // money valid

          //pilih produk (display)+(button)
            //produk available(product Shelf)
            //compare harga, jumlahkan money(product shelf)
            //lembar money bertambah (money acceptor)
            //produk keluar(product shelf)

            // di dalam product shelf manggil +++
            //display manggil ++++

            //produk not available
            //pilih produk (display) notif display

        //money not valid
        //slug
        //display(insert again)
    }  
}
