/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionactivity;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Israa
 */
public class ExceptionActivity2 {   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* maxValue mv= new maxValue();
       mv.setMaxValue();*/
        
        
       maxValue mv= new maxValue();
       try{
           mv.setMaxValue();
       }catch (Exception ex){
       System.out.println("this catch from main ");
       }
       
    }
    
}
