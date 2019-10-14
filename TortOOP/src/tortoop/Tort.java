/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortoop;

import java.util.InputMismatchException;

/**
 *
 * @author TheF00L
 */
class Tort {
    private int _tort_nevezo;
    private int _tort_szamlalo;
    private int _tort_Egeszbe;
    
    public Tort(int tort_nevezo,int tort_szamlalo){
        
        this._tort_nevezo=tort_nevezo;
        this._tort_szamlalo=tort_szamlalo;
        
    }

    public int getTort_nevezo() {
        return _tort_nevezo;
    }

    public int getTort_szamlalo() {
        return _tort_szamlalo;
    }

    public void isEgyszerusithetoE(){
        
        int _a=this._tort_nevezo;
        int _b=this._tort_szamlalo;
        int _egyszerus_Int=0;
        int i=2;
  try{
        
        do {
            
            
            if ((_a%i==0)&&(_b%i==0)) {
                _egyszerus_Int=i;   
            }
            i++;
        } while ((_a%i==0)&&(_b%i==0));
        
        this._tort_nevezo=this._tort_nevezo/_egyszerus_Int;
        this._tort_szamlalo=this._tort_szamlalo/_egyszerus_Int;
        
            }catch (ArithmeticException e) { 
                 System.out.println("You should not divide a number by zero");
            }catch (InputMismatchException e){
                System.out.println("Input Mismatch");
            }catch (Exception e) {
                 System.out.println("Exception occurred");
            }
        
        
    }
    
    public void isEgeszE(){
        if (this._tort_nevezo%this._tort_szamlalo==0) {
            this._tort_Egeszbe=this._tort_nevezo/this._tort_szamlalo;
            System.out.println("Egesz a tort:"+this._tort_Egeszbe);
        }else{
            System.out.println("Nem egesz a tort");
            this._tort_Egeszbe=0;
        }
        
    }

    
    @Override
    public String toString() {
        return "Tort{" + "_tort_nevezo=" + _tort_nevezo + ", _tort_szamlalo=" + _tort_szamlalo + ", _tort_Egeszbe=" + _tort_Egeszbe + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
