/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author Nolasco
 */
public class PruebaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseAgregadaPorAdmin x=new ClaseAgregadaPorAdmin("Desde admin");
        ClaseDosAgregadaPorAdmin y=new ClaseDosAgregadaPorAdmin("Texto dos desde admin");
        
        System.out.println(x.getTexto());
        System.out.println(y.getOtroTexto());
    }
    
}
