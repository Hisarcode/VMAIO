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
public class Button {
    
        public void pilih() {    
        Scanner input = new Scanner(System.in);
        int[][] btn = {
                {25, 25, 25, 25, 25},
                {25, 25, 25, 25, 25}
        };
    
        System.out.print("Pilih minuman: ");
        int choose = input.nextInt();
        for (int b = 0; b < 2; b++) {
            for (int k = 0; k < 5; k++) {
                if ((b == 0) && (choose < 26) && (choose!=0)) {
                    if (choose - 1 == k) {
                        btn[b][k] = btn[b][k] - 1;
                    }
                } else {
                    if (choose - 26 == k) {
                        btn[b][k] = btn[b][k] - 1;
                    }
                }
            }
        }
        System.out.println("Thank you, please take your drink here . . .");
    }
}
