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
public class ExceptionActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int x, y;
        
        try{
        System.out.print("Enter x :");
        x= scn.nextInt();
        
        System.out.print("Enter y :");
        y= scn.nextInt();
        
         System.out.print("Result : "+(x/y) );
        }catch(InputMismatchException iexception){
            
         System.out.println("InputMismatchException => Enter numeric value" );
        }catch(ArithmeticException aexception){
          System.out.println("ArithmeticException =>cant be divid on Zero  ");
        }
        catch(Exception exception){
          System.out.println(exception);
        } 
        finally{
        System.out.println(" finally block always print");
        }
    }
    
}
