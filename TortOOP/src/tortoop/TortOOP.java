/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortoop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TheF00L
 */
public class TortOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int _nevezo=0,_szamlalo=0;
        int _nevezo_m=0,_szamlalo_m=0;
        try{
        
             do {
                 
               System.out.println("Kerem a egyik tort nevezojet:");
                 _nevezo=sc.nextInt();
               System.out.println("Kerem a egyik tort szamlalojat:");
                 _szamlalo=sc.nextInt(); 
             } while ((_nevezo==0)||(_szamlalo==0));
             
             
             do{
                 
                System.out.println("Kerem a masik tort nevezojet:");
                  _nevezo_m=sc.nextInt();
                System.out.println("Kerem a masik tort szamlalojat:");
                  _szamlalo_m=sc.nextInt(); 
             } while ((_nevezo==0)||(_szamlalo==0));
        
            }catch (ArithmeticException e) { 
                 System.out.println("You should not divide a number by zero");
                 System.exit(1);
            }catch (InputMismatchException e){
                System.out.println("Input Mismatch");
                System.exit(1);
            }catch (Exception e) {
                 System.out.println("Exception occurred");
                 System.exit(1);
            }
        
        
        sc.close();
        
        Tort tort=new Tort(_nevezo,_szamlalo);
        System.out.println(tort.toString());
        tort.isEgyszerusithetoE();
        System.out.println(tort.toString());
        tort.isEgeszE();
       
        Muveletek muvelet=new Muveletek(_nevezo_m,_szamlalo_m);
        
            
        
    }
    
}
