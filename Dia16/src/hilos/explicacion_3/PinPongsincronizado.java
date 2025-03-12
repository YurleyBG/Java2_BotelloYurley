
package hilos.explicacion_3;

public class PinPongsincronizado extends Thread {
    
    private String word;
    
    public PinPongsincronizado(String s){
        word=s;
    
    }
    public void run(){
        synchronized (getClass()){
            for (int i = 0; i < 5; i++) {
                System.out.println(word);
                System.out.flush();
                getClass().notifyAll();
                try{
                    getClass().wait();
                    
                }catch(InterruptedException e){
                
                    getClass().notifyAll();
                }
                
            }
    
    
        }
    
    }
}
