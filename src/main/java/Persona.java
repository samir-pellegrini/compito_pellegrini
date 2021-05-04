/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Persona extends Thread{
    Bagni b;//instanza bagno
    int val;
    public Persona(Bagni b,int val) {
        this.b = b;
        this.val=val;//valore di controllo per vedere se è uomo o donna
    }
    
    //metodo chiama bagno maschile o femminile
    public void run()
    {
        if(val==0)
        {
        b.bagnoM();//chiama il metodo del bagno per i maschi
        }
        if(val==1)
       {
          b.bagnoF();//chiama il metodo del bagno per le femmine
       }
        }
    }
    
    

