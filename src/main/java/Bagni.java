
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
public class Bagni {
    Semaforo m;//risorsa per il bagno maschile
    Semaforo f;//risorsa per il bagno femminile
    String nome;//nome della persona che entra e poi successivamente esce
    public Bagni(Semaforo m, Semaforo f,String nome) {
        this.m = m;
        this.f = f;
        this.nome=nome;
    }
   //metodo del bagno Maschile 
    public void bagnoM()
    {
        m.p();//richiamamo il metodo p per vedere se il bango è libero
        System.out.println("la persona maschile: " + nome + " è  entrato in bagno");//stampa messaggio
        try {
            Thread.sleep(1000);//tempo di sosta nel bagno
        } catch (InterruptedException ex) {
            Logger.getLogger(Bagni.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("la persona maschile: " + nome + " è  uscito dal bagno");//stampa messaggio
        m.v();//richiamiamo il metodo v per notifcare che il bagno si è liberato
        
    }
    //metodo del bagno femminile 
    public void  bagnoF()
    {
        f.p();//richiamamo il metodo p per vedere se il bango è libero
        System.out.println("la persona femminile:" + nome + " è  entrato in bagno");//stampa messaggio
        try {
            Thread.sleep(1000);//tempo di sosta nel bagno
        } catch (InterruptedException ex) {
            Logger.getLogger(Bagni.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("la persona femminile:" + nome + " è  uscita dal bagno");//stampa messaggio
        f.v();//richiamiamo il metodo v per notifcare che il bagno si è liberato
        
    }

    
    
    
}
