//Name : Dinanda de Paguita (D1041171045)
//file name : Product.java
//date time create : 23rd of May 2019. 8.59 p.m.
//description : make atributs of product

import java.util.Scanner;

public class moneyCollector
{
    public static void main(String[] args)
    {
        int bucket = 0;
        Scanner money = new Scanner(System.in);

        while(bucket<100) {
            int m = money.nextInt();
            bucket = bucket + m;
            System.out.println(bucket);

        }
        bucket++;
    }
}