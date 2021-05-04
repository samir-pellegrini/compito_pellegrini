/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class MainBagni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semaforo m=new Semaforo(1);//risorsa disponibile m
        Semaforo f=new Semaforo(1);//risorsa disponibile f
        
        
        Bagni b1=new Bagni(m,f,"alberto");//istanza di tipo bagno maschile
        Bagni b2=new Bagni(m,f,"giovanni");//istanza di tipo bagno maschile
        Bagni b3=new Bagni(m,f,"mario");//istanza di tipo bagno maschile
        Bagni b4=new Bagni(m,f,"samir");//istanza di tipo bagno maschile
         
         Thread m1=new personaM(b1);//istanza del thread
         Thread m2=new personaM(b2);//istanza del thread
         Thread m3=new personaM(b3);//istanza del thread
         Thread m4=new personaM(b4);//istanza del thread
        
         m1.start();//start del thread maschio con i maschi
         m2.start();//start del thread maschio con i maschi
         m3.start();//start del thread maschio con i maschi
         m4.start();//start del thread maschio con i maschi
         
        Bagni b5=new Bagni(m,f,"maria");//istanza di tipo bagno femminile
        Bagni b6=new Bagni(m,f,"martina");//istanza di tipo bagno femminile
        Bagni b7=new Bagni(m,f,"francesca");//istanza di tipo bagno femminile
        Bagni b8=new Bagni(m,f,"anna");//istanza di tipo bagno femminile
         
         Thread f1=new personaF(b5);//si instanzia il thread con le femmine
         Thread f2=new personaF(b6);//si instanzia il thread con le femmine
         Thread f3=new personaF(b7);//si instanzia il thread con le femmine
         Thread f4=new personaF(b8);//si instanzia il thread con le femmine
        
        
         f1.start();//start del thread femmina
         f2.start();//start del thread femmina
         f3.start();//start del thread femmina
         f4.start();//start del thread femmina
         
    }
    
}
