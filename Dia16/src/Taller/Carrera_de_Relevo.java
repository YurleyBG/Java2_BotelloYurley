
package Taller;

import java.util.Random;


public class Carrera_de_Relevo extends Thread{
    private String atleta;

    public Carrera_de_Relevo(String atleta) {
        this.atleta = atleta;
    }
        

    public void run(){
       
        synchronized (getClass()){
            int contador=0;
            try{
                contador+=1;
                Random random = new Random();
                System.out.println("el " + atleta + " inicio la carrera");
                int testigo= random.nextInt(9000)+2000;
                Thread.sleep(testigo);
                System.out.println("el " + atleta + "finalizo la ronda"+" tiempo "+(testigo / 1000));
               
                getClass().notifyAll();
                   System.out.println(contador);
                try{
                     getClass().wait();
                }
                catch(InterruptedException e){
                      
                    getClass().notifyAll();
                }

            }
            catch(InterruptedException e){
                
                getClass().notifyAll();

            }
        }
    }

}
    

