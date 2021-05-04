/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class personaF extends Thread{
    Bagni b;//instanza bagno

    public personaF(Bagni b) {
        this.b = b;
    }
    
    
     // metodo che chiama il metodo bagno f
     
    public void run()
    {
        b.bagnoF();//chiama il metodo del bagno per le donne
    } 
    
}
