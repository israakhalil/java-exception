/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionactivity;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Israa
 */
public class maxValue {
    
   /* public void setMaxValue(){
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
          try {
        if(x>100 )
           throw new Exception("stack overflow");
         
        System.out.println(x);
        } catch (Exception ex) {
           System.out.println(ex.getMessage());
        }
    }*/ 
    
    
    public void setMaxValue()throws Exception{
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
         
        if(x>100 )
           throw new Exception("stack overflow");
         
        System.out.println(x);
        
    } 
}
