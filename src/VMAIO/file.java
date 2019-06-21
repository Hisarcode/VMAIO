/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VMAIO;
import java.io.*;
public class file {
    public static void main(String[] args){
        FileInputStream input = null;
        int data;
        
        try{
            input = new FileInputStream("E:/listproduct.TXT");
        } catch (FileNotFoundException fnfe){
            System.out.println("File Tidak Ditemukan");
            return;
        }
        
        try{
            while ((data=input.read())!= -1){
            System.out.print((char)data);
        }
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
            return;
        }
        
        try{
            input.close();
        }catch (IOException ioe){}
    }
}

/**
 *
 * @author user
 */
    

