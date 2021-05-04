/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class personaM extends Thread{
    Bagni b;//instanza bagno

    public personaM(Bagni b) {
        this.b = b;
    }
    
    //metodo chiama bagno m
    public void run()
    {
        b.bagnoM();//chiama il metodo del bagno per i maschi
    }
    
    
}
