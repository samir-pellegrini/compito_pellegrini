
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Semaforo {
    int val;

    public Semaforo(int val) {
        this.val = val;
    }
    
    
    synchronized public void p()//metodo per controllare se la risorsa è presente
    {
        while(val==0)//controlla se la risorsa è disponibile
                {
            try {
                wait();//se non è disponibile aspetta
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
        val--;//se disponibile la risorsa viene presa  
    }
    synchronized public void v()//rilascia la risorsa
    {
        val++;//risorsa rilasciata
        notify();//sveglia i thread in attessa
    }
}
