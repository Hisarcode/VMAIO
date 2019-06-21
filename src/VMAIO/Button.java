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
     public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int[][] btn = {
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5}
        };
        int choose = input.nextInt();
        for (int b = 0; b < 2; b++) {
            for (int k = 0; k < 5; k++) {
                if ((b == 0) && (choose < 6) && (choose!=0)) {
                    if (choose - 1 == k) {
                        btn[b][k] = btn[b][k] - 1;
                    }
                } else {
                    if (choose - 6 == k) {
                        btn[b][k] = btn[b][k] - 1;
                    }
                }
            }
        }
    }
}
