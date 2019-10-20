/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3edp2ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class Ficha3EDP2Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        PostFix calc = new PostFix();
        
        try {
            System.out.println(calc.calcular("1 2 +"));
            System.out.println(calc.calcular("3 5 + +"));
            System.out.println(calc.calcular("10 5 -"));
            System.out.println(calc.calcular("2 2 *"));
            System.out.println(calc.calcular("4 2 /"));
            System.out.println(calc.calcular("4 -2 /"));
        } catch (EmptyCollectionException ex) {
            Logger.getLogger(Ficha3EDP2Ex1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
